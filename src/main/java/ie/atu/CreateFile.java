package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {

    public static void main(String[] args){
        String fileName = "File14.txt";

        try (PrintWriter writer = new PrintWriter (new FileWriter(fileName, true))){

         writer.println("today is monday.");
         writer.println("tomorrow is tuesday.");

         System.out.println("content successfully writen to the file");
        }catch (IOException e){
            System.out.println("An error ocurred while creating the file.");
            e.printStackTrace();
        }
    }
}


