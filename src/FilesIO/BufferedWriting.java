package FilesIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriting {
    
    public static void main(String[] args) {
        

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/writeFile.txt"))){
            //write a new line on the file/ if it already exists does nothing
            writer.write("Hello World!1\n");
            writer.write("DVL numba 1");

            writer.newLine(); // line seperator

            writer.write("This is a simple text file");



        } catch (IOException e) {
            System.out.println("Error found, message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
