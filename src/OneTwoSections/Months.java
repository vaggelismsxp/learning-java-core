package OneTwoSections;
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theMonth=scanner.nextInt();

        switch(theMonth){
            case 1:
            case 2:
            case 3:
                System.out.println("Q1");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Q2");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Q3");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Q4");
                break;
            default:
                System.out.println("Wrong input");
            
        }
        scanner.close();
    }
    
}
