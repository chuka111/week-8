package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {

    public static void main(String[] args){
        String fileName = "File14.txt";

        try (FileWriter writer = new FileWriter(fileName)){
         writer.write("some different content for the file.");

         System.out.println("content successfully writen to the file");
        }catch (IOException e){
            System.out.println("An error ocurred while creating the file.");
            e.printStackTrace();
        }
    }
}


