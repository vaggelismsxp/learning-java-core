package Lambdas;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        names.add("giorgos");
        names.add("mix");
        names.add("mary");
        names.add("mpil");
        
        IGreetings lambda = () -> System.out.println("DVL");
        lambda.greetings();

        StringEndings exclamationMark = (s) -> s + "!";
        System.out.println(exclamationMark.perform(names.get(new Random().nextInt(0,4))));

        String a = "apples";
        String b = "banana";

        //StringCompare compare = (a,b) -> getBiggerOrFirstAlphabetically(s1,s2);
        //String winner = compare.perform(a,b);
        BinaryOperator<String> compare1 = Main::getBiggerOrFirstAlphabetically;
        String winner = compare1.apply(a, b);
        System.out.println(winner);


        String str = "Hello World!";
        Predicate<String> methodRef = str::startsWith;
        System.out.println("---------------------");
        System.out.println(methodRef.test("Not"));
        

        

        Predicate<Integer> lessThan100 = i -> (i<100);
        Predicate<Integer> greaterThan50 = i -> (i>50);
        boolean result = lessThan100.and(greaterThan50).test(ThreadLocalRandom.current().nextInt(1000));

        System.out.println(result);

        
        Supplier<Integer> randomInt = () -> ThreadLocalRandom.current().nextInt(1000);
        System.out.println("random we got: " +randomInt.get());
        System.out.println("--------------");

        // ============== with Method Referencing ================
        ICalculate divide = Main::divideTwoNumbers;

        // ============== With Lambda ==============
        // Calculate divide = (a1,b1) -> {
        //     try{
        //         return a1/b1;
        //     }catch(ArithmeticException e){
        //         e.printStackTrace();
        //         return -1;
        //     }
        // };
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        
        System.out.println(divide.perform(a1,a2));


        Function<String,Integer> countVowelsFunction = Vowels::countVowels;
        System.out.println("Word: Umbrella, Vowels found: "+countVowelsFunction.apply("umbrella"));

        scanner.close();




        // ===================  Streams  ===================  
        List<String> names2 = Arrays.asList("Holland","duck","Beef","DVL","1312","Giati milate mesa edw?","e?","Tilefwno","Lord","Apo pote kai poy");

        List<String> resultStream = names2.stream()
            .filter((s) -> s.length()<=6)
            .map(String::toUpperCase)
            .sorted((s,v)-> (s.charAt(1)<v.charAt(1)) ? -1 : (s.charAt(1) == v.charAt(1) ? 0 : 1))//Random sort based on Character with index 1
            .collect(Collectors.toList());
        
        
        System.out.println("-------------------Stream Result -------------------");
        resultStream.forEach(System.out::println);
        
        


        //Last session Streams.

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Eric", 8));
        employees.add(new Employee(2,"Milo",3));
        employees.add(new Employee(3, "Melo", 12));
        employees.add(new Employee(4,"Elija",35));
        employees.add(new Employee(5,"Adil",24));
        employees.add(new Employee(6,"Enrique",1));
        employees.add(new Employee(7,"chad",18));


        //First part of the Problem: How many have over 10 years of experience:

        //-----My solution----- Wrong solution
        // List<Employee> resultStream2 = employees.stream()
        //     .filter((s) -> s.getYearsOfService()>10)
        //     .collect(Collectors.toList());
        //  

        // resultStream2.forEach((s) -> System.out.println("Name: " + s.getFirstName() + ", ID: " + s.getId()));

        //Udemy course solution:
        // int employeeYearsAboveTen = employees.stream()
        //     .filter((s)->s.getYearsOfService()>10)
        //     .count();
        // System.out.println(employeeYearsAboveTen);
        



        //Second part of the Problem : Their name starts with the letter E + 10 years of experience.

        List<Employee> resultStream2 = employees.stream()
            .filter((s) -> (s.getYearsOfService()>10)&&(s.getFirstName().startsWith("E")))
            .toList();
        
        resultStream2.forEach((s) -> System.out.println("Name: " + s.getFirstName() + ", ID: " + s.getId()));





    }

    private static int divideTwoNumbers(int n1, int n2){
        try{
            System.out.print("Divide "+n1+ " by " + n2 + " and result is: ");
            return n1/n2;
        }catch(ArithmeticException e){
            e.printStackTrace();
            return -1;
        }
    }

    private static String getBiggerOrFirstAlphabetically(String s1,String s2){
        if (s1.length()>s2.length()){
            return s1;
        }else if (s2.length()>s1.length()){
            return s2;
        }else {
            return s1.compareTo(s2)<=0 ? s1 : s2;
        }
    }
}
