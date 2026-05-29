package JavaCollectionsFramework;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo{

    public static void main(String[] args) throws IOException {
        
        List<String> names = new ArrayList<>();
        ArrayList<String> newName = new ArrayList<>();
        String fileName = "data/sample-words.txt";

        names = getRandomWord(fileName);

        System.out.println(names.size());
        newName.addAll(names);
        
        for (String temp:newName){
            System.out.println(temp);
        }
    }

    
    private static List<String> getRandomWord(String fileName) throws IOException{
        List<String> lineList = Files.readAllLines(Path.of(fileName));

        return  lineList ;
        //toArray just needs to know what type of variable, so we pass a string array with 0 space
        // String[] words = lineList.toArray(new String[0]);
        // Random random = new Random();
        // int index = random.nextInt(words.length);
        // String theWord = words[index];
        //  return theWord.trim().toUpperCase();
    }
}