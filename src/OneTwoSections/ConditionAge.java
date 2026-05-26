package OneTwoSections;
import java.util.Scanner;

public class ConditionAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minVotingAge=19;
        System.out.print("Whats your age? ");
        int age = scanner.nextInt();
        System.out.println("min voting age: " + minVotingAge);
        
        String eligibility = (age >= minVotingAge) ? "You are Eligible to vote" : "You are Not eligible to vote" ;
        
        System.out.println(eligibility);

       
        scanner.close();
    }

}