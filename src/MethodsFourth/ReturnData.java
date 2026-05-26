package MethodsFourth;

import java.util.Scanner;

public class ReturnData {

    public static void main(String[] args) {
        System.out.println("Give me a number to summate");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int result = summation(userInput);
        System.out.println(result);
        scanner.close();
        
    }
    public static int summation(int num){
        
       
        return  (num * (num+1)/2);
    }
    
}
