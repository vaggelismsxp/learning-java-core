package OneTwoSections;
import java.util.Scanner;

public class Enums {

    
    public static void main(String[] args) {

        ComputerType computerType = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Computer type?  (SMARTHPHONE,TABLET,DESKTOP,LAPTOP)");
        String userInput = scanner.nextLine().trim().toUpperCase();

        try{
        computerType = ComputerType.valueOf(userInput);
        }catch(IllegalArgumentException exception){
            System.out.println("Illegal arg");
            System.exit(1);
        }finally{
            scanner.close();
        }

        String description = switch (computerType){

            case LAPTOP -> "a laptop to do you work at home";
            case TABLET -> "Phone killa";
            case DESKTOP -> "Unix for the win";
            default -> "Nothing found";
        };
        System.out.println(description);
        
        
    }
}
