package ArraysSection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordQuestGame {
    static char EMPTY_PLACE_HOLDER = '-';
    public static void main(String[] args) throws IOException {

        //init
        Scanner scanner = new Scanner(System.in);
        String fileName = "data/sample-words.txt";


        System.out.print("How many lives you want? (0,20) ");
        int attempts = scanner.nextInt();
        if (attempts >20){attempts = 10;}

        //Read word from file
        
        
        String secretWord= getRandomWord(fileName);
        
        //GameEnum[] table = GameEnum.values();
        //String secretWord = table[random.nextInt(table.length)].toString();
        


        char[] hiddenWord = new char[secretWord.length()];
        
        
        Arrays.fill(hiddenWord, EMPTY_PLACE_HOLDER);
        char guess;
        System.out.println("Welcome to Word Quest!");

        boolean hasMissingLetters = true;

        while(attempts > 0 && hasMissingLetters){
            boolean isGuessCorrect=false;

            System.out.println("Current Word: "  + String.copyValueOf(hiddenWord)  );

            System.out.print("Guess a letter: ");
            String userInput = scanner.next().toUpperCase();
            guess = userInput.charAt(0);

            for (int i =0 ; i<secretWord.length(); i++){
                if (secretWord.charAt(i)==guess){
                    hiddenWord[i]=guess;
                    isGuessCorrect=true;
                }
            }

            if (isGuessCorrect){
                System.out.println("Correct. Attempts remaining: "+ attempts);
                System.out.println();
                hasMissingLetters = containsNonLetters(hiddenWord, EMPTY_PLACE_HOLDER);
            }else{
                attempts--;
                System.out.println("Wrong. Attempts remaining: "+ attempts);
                System.out.println();
            }

        }

        if (hasMissingLetters){
            System.out.println("You have run out of attempts. The hidden word was: " + secretWord);

        }else{
            System.out.println("Gj my guy !!! you won the game. you found the word: "+ String.valueOf(hiddenWord));
        }

        scanner.close();
    }
    private static boolean containsNonLetters(char[] word, char EMPTY_PLACE_HOLDER ){
        for (char temp : word){
            if (temp == EMPTY_PLACE_HOLDER){
                return true;
            }
        }
        return false;

    }

    private static String getRandomWord(String fileName) throws IOException{
        //read all lines from the file
        List<String> lineList = Files.readAllLines(Path.of(fileName));

        //toArray just needs to know what type of variable, so we pass a string array with 0 space
        String[] words = lineList.toArray(new String[0]);
        Random random = new Random();
        int index = random.nextInt(words.length);
        String theWord = words[index];
        return theWord.trim().toUpperCase();
    }

    
}
