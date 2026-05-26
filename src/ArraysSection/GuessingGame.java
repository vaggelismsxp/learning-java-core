package ArraysSection;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    static int LIVES=3;
    static int max =5;
    static int min =1 ;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();

        int[] guesses = new int[3];
        int secretNumber = random.nextInt(max) + 1;

        boolean won=false;

        System.out.println("Number Guessing game");
        System.out.println("You have 3 attempts to guess the random number");

        for (int i =0 ; i<LIVES ; i++){

            System.out.println();
            System.out.print("Guess a number between 1 and 5: " );
            guesses[i]=scanner.nextInt();
            
            won = (secretNumber == guesses[i]);

            if (won) {
                System.out.println("Success you guessed the secret number: "+ secretNumber);
                break;
            }else{
                System.out.println("Sorry your guess is incorrect.");
                System.out.println("You have "+ (3-i-1) + " attempt(s) left.");
            }

        }
        if(!won){
            System.out.println();
            System.out.println("You did not win. Secret number was: "+ secretNumber);
        }
        scanner.close();
        

    }
    
}
