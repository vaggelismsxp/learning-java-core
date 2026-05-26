package OneTwoSections;
import java.util.Scanner;

public class modernSwitch {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String machine = scanner.nextLine();
        machine = machine.toLowerCase();

        String description = switch (machine){

            case "laptop" -> "a laptop to do you work at home";
            case "smartphone" -> "Phone killa";
            case "desktop" -> "Unix for the win";
            default -> "Nothing found";
        };
        System.out.println(description);
        scanner.close();
    }
}
