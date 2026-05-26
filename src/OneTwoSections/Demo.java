package OneTwoSections;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Favourite color?");
        String color = scanner.nextLine();
        System.out.println("color they like: "+ color);
        
        System.out.println("Favourite sport?");
        String sport = scanner.nextLine();
        System.out.println("sport they like: "+ sport);
        
        scanner.close();
    }
    
}
