package FilesIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedReading {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        List<String> words = new ArrayList<>();

        try{
            
            //connects to new BufferedReader
            reader = new BufferedReader(new FileReader("data/sample-words.txt"));

            String line;
            int count=0;
            //Fetches a line at a time
            while ((line = reader.readLine()) != null){
                words.add(line);
                System.out.println(line + " " + count );
                count++;
            }


            reader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally{
        }
        
    }
}
