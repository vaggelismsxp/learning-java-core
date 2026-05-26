package ArraysSection;

import java.util.Scanner;

public class Arrays2D {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        int[][] table2D = new int[rows][columns];

        for (int i=0; i<rows; i++){

            for (int j=0 ; j<columns;j++){
                table2D[i][j]= (i+1)*(j+1);
            }
        }
        for (int i=0; i<rows; i++){

            for (int j=0 ; j<columns;j++){
                System.out.print(table2D[i][j] + " " );
            }
            System.out.println();
        }
        



        scanner.close();   
    }

}
