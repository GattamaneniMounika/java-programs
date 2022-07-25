package Filehandling;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;



public class Creatingatextfile {
 public static void main(String[] args)
 {

     try {
         File Obj = new File("Lakshmi file.txt");
         if (Obj.createNewFile()) {
             System.out.println("File created: "
                                + Obj.getName());
         }
         else {
             System.out.println("File already exists.");
         }
     }
     catch (IOException e) {
         System.out.println("An error has occurred.");
         e.printStackTrace();
     }
 }
}