package LoopsThird;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        do {

            System.out.println("{hello r");

            System.out.println("Are we done? (Y|N)");
            String userInput = scanner.nextLine().toUpperCase();
            
            
            done = (userInput.equals("Y") ) ? true : false;



        }while(!done);
        scanner.close();

        /* 
        while (!done){

            System.out.println("{hello ng");
            System.out.println("Are we done? (Y|N)");
            String userInput = scanner.nextLine().toUpperCase();
            
            
            done = (userInput.equals("Y") ) ? true : false;
            
            if (userInput.equals("Y")) { 
                done = true ;
            }else {
                System.out.println("keep going");
            }
        }
        */


    }

}
