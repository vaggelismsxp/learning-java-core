package OneTwoSections;

import java.util.Scanner;

public class FailTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade exam 1: ");
        double grade1= scanner.nextDouble();
        

        System.out.print("Enter grade exam 2: ");
        double grade2 = scanner.nextDouble();
        
        System.out.print("Enter grade exam 3: ");
        double grade3= scanner.nextDouble();
        

        double averageGrade = (grade1+grade2+grade3)/3;
        System.out.println("Grade Average: " + String.format("%.2f", averageGrade));

        scanner.close();
    }
    
}
