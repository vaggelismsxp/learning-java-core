
package UnitTesting.JUnitDemoTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import UnitTesting.JUnitDemo.DemoUtils;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class DemoUtilsTest {
    DemoUtils demoUtils;


    @BeforeEach
    void setupBeforeEach(){
        System.out.println("@BeforeEach executes before the execution of each test method");
        demoUtils = new DemoUtils();
    }
    
    @AfterEach
    void tearDownAfterEach(){
        System.out.println("Just here to say im running after each test method");
    }

    @BeforeAll
    static void setupBeforEachClass(){
        System.out.println("@BeforeAll executes only once before all test methods executions in the class ");
    }
    
    @AfterAll
    static void tearDownAfterEachClass(){
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }

    @Test
    void testEqualsAndNotEquals(){
        System.out.println("Testing equals and not equals");
        assertEquals(6,demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(8, demoUtils.add(1, 9),"1+9 must not be 8");
    }
    
    @Test
    void testNullAndNotNull(){
        System.out.println("Testing null and not null");
        String str1=null;
        String str2="luv2code really sucks...";

        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
    }

    @Test
    void sameAndNotSame(){
        String str = "Techpro";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Objects should refer to same object");
        assertNotSame(str, demoUtils.getAcademyDuplicate(),"Objects should not refer to the same object");
    }
    @Test
    void testTrueFalse(){
        int gradeOne=10;
        int gradeTwo=5;
        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo),"This should return True");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne),"This should return false");
    }
    @Test
    void testArrayEquals(){
        String[] stringArray = {"A","B","C"};
        
        assertArrayEquals(demoUtils.getFirstThreeLettersOfAlphabet(), stringArray,"Arrays should be the same");
    }
    @Test
    void testIterableEquals(){
        ArrayList<String> theArrayList = new ArrayList<>();
        theArrayList.add("luv");
        theArrayList.add("2");
        theArrayList.add("code");

        List<String> theList = List.of("luv","2","code");

        assertIterableEquals(theArrayList, demoUtils.getAcademyInList(),"Expected Iterable should be same as actual Iterable");
        assertIterableEquals(theArrayList, theList,"Expected Iterable should be same as actual Iterable");
    }

    @Test
    void testThrowsAndDoesNotThrow(){
        assertThrows(Exception.class, ()->{demoUtils.throwException(-1);},"Should Throw an Exception");

        assertDoesNotThrow(()->{demoUtils.throwException(9);},"Should not throw an exception");

    }


    @Test
    @EnabledOnOs(OS.MAC)
    void testTimeout(){
        assertTimeoutPreemptively(Duration.ofSeconds(4), ()->{demoUtils.checkTimeout();},
                    "Method should not execute in 3 seconds");
    }

}
    

