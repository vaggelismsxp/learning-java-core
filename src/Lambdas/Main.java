package Lambdas;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("giorgos");
        names.add("mix");
        names.add("mary");
        names.add("mpil");
        
        names.forEach((n) -> System.out.println(n) );

        IGreetings lambda = () -> System.out.println("LMS");
        lambda.greetings();
    }
}
