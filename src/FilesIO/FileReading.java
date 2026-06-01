package FilesIO;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReading {
    public static void main(String[] args) throws IOException  {
        FileReader fileReader = null;
        try  {
            fileReader = new FileReader("data/sample-words.txt");

            //-1 means end of file in a filereader
            int character = 0;
            List<String> fullFile = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();

            //cast the unicode(UTF8) int into a char
            while ((character = fileReader.read()) != -1){
                System.out.print((char)character);

                if(character == '\n' || character == '\r'){
                    if (stringBuilder.length()>0){
                        fullFile.add(stringBuilder.toString());
                        stringBuilder.delete(0,stringBuilder.length());
                    }
    
                }else{
                    stringBuilder.append((char)character);
                }
            }
            if (stringBuilder.length()>0){
                fullFile.add(stringBuilder.toString());
            }


            System.out.println("\n-----------------------------------");
            for (String temp:fullFile){
                System.out.println(temp);
            }
            
        }catch (Exception e) {
            System.out.println(e);
        }finally{
            if (fileReader!=null){
                fileReader.close();
            }

            
                
        }
        
           
    }



    // public static void readFile() throws FileNotFoundException {
    //     FileReader fileReader = new FileReader("data/sample-words.txt");
    // }
    
}
