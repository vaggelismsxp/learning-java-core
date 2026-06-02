package FilesIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedReading {

    public static void main(String[] args) throws IOException {

        // BufferedReader reader = null;
        // List<String> words = new ArrayList<>();

        // try{
            
        //     //connects to new BufferedReader
        //     reader = new BufferedReader(new FileReader("data/story.txt"));

        //     String line;
        //     int count=0;
        //     //Fetches a line at a time
        //     while ((line = reader.readLine()) != null){
        //         words.add(line);
        //         System.out.println(line );
        //     }


        // }catch(FileNotFoundException e){
        //     e.printStackTrace();
        // }finally{
        //     if (reader!=null)
        //         reader.close();
        // }
        
        List<String> story = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("data/story.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                story.add(line);
            }

        }catch (IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        for (String temp : story){
            System.out.println(temp);
        }
    }
}
