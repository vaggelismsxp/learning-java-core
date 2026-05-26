package Arrays;

import java.util.Random;
import java.util.Scanner;

public class WordQuestGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 5;
        GameEnum[] table = GameEnum.values();

        String word = String.valueOf(table[random.nextInt(table.length + 1)]);

        char[] hiddenWord = new char[word.length()];
        
        
        for (int i=0; i<word.length();i++){
            hiddenWord[i]= '_';
        }


        char guess;

        System.out.println("Welcome to Word Quest!");

        boolean wordNotRevealed = true;
        while(attempts > 0 && wordNotRevealed){
            boolean isGuessCorrect=false;

            System.out.print("Current Word: "  + String.copyValueOf(hiddenWord));
            System.out.println();
            System.out.print("Guess a letter: ");
            String userInput = scanner.next().toUpperCase();
            guess = userInput.charAt(0);

            for (int i =0 ; i<word.length(); i++){
                if (word.charAt(i)==guess){
                    hiddenWord[i]=guess;
                    isGuessCorrect=true;
                }
            }

            if (String.copyValueOf(hiddenWord).equals(word)){
                wordNotRevealed=false;
                break;
            }

            if (isGuessCorrect){
                continue;
            }else{
                attempts--;
                System.out.println("Attempts remaining: "+ attempts);
            }

        }

        if (wordNotRevealed){
            System.out.println("You have run out of attempts. The hidden word was: " + word);

        }else{
            System.out.println("Gj my guy !!! you won the game. you found the word: "+ new String(hiddenWord));
        }
    }

    
}
