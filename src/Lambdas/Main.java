package Lambdas;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("giorgos");
        names.add("mix");
        names.add("mary");
        names.add("mpil");
        
        IGreetings lambda = () -> System.out.println("DVL");
        lambda.greetings();

        StringEndings exclamationMark = (s) -> s + "!";
        System.out.println(exclamationMark.perform(names.get(new Random().nextInt(0,5))));

        String a = "apples";
        String b = "banana";

        StringCompare compare = (s1,s2) -> getBiggerOrFirstAlphabetically(s1,s2);
        
        String winner = compare.perform(a, b);
        System.out.println(winner);

        Predicate<Integer> lessThan100 = i -> (i<100);
        Predicate<Integer> greaterThan50 = i -> (i>50);
        boolean result = lessThan100.and(greaterThan50).test(ThreadLocalRandom.current().nextInt(1000));

        System.out.println(result);

        
        Supplier<Integer> randomInt = () -> ThreadLocalRandom.current().nextInt(1000);
        System.out.println(randomInt.get());


        Calculate divide = (a1,b1) -> {
            try{
                return a1/b1;
            }catch(ArithmeticException e){
                e.printStackTrace();
                return -1;
            }
        };
        int solution = divide.perform(10, 0);
        System.out.println(solution);





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
