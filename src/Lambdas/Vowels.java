package Lambdas;


public class Vowels {

    public static int countVowels(String s){
        int count = 0 ;
        String vowels = "AEIOUaeiou";
         

        //how many they do not have in common
        for (char c : s.toCharArray()){
            if (vowels.indexOf(c) != -1  ){
                count++;
            }
        }
        return count;

    }

        
    
}
