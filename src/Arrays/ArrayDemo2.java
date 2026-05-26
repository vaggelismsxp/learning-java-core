package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2{
    public static void main(String[] args) {
        
        double[] grades = readUserInputGrades();
        

        if (grades.length!=0){
            double avGrade=computeGradeAverage(grades);
            System.out.println("Average of user Input Grades: " + avGrade );
        }

        printAfterSort(grades);

        int result= Arrays.binarySearch(grades, 10);
        boolean found=(result>=0)?true:false;
        System.out.println("Item found : "  + found + " and index of array: "+result );
    }

    private static void printAfterSort(double[] grades) {
        Arrays.sort(grades);
        for (double temp:grades)
            System.out.println("check thsi out  " + temp);
    }

    private static double[] readUserInputGrades(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grades you gonna enter?");
        int length = scanner.nextInt();
        double[] grades= new double[length];

        for (int i=0;i<length;i++){
            grades[i]=scanner.nextDouble();
        }
        scanner.close();

        return grades;
        

    }

    private static double computeGradeAverage(double[] grade){
        double sum=0;
        for (double temp : grade)
            sum+=temp;
        return sum/grade.length;
    }

}