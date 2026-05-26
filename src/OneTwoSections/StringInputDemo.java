package OneTwoSections;
import java.util.Scanner;

public class StringInputDemo{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your favourite Color? ");
        String favouriteColor = scanner.nextLine();
        System.out.print("What is your hobby? ");
        String hobby = scanner.nextLine();
        

        System.out.println("My favourite Color is " + favouriteColor);
        System.out.println("My hobby is "+ hobby);


        scanner.close();


    }
}