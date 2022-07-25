package Filehandling;
import java.io.FileWriter; 
import java.io.IOException;
public class Writingafile {
	
	
	    public static void main(String[] args)
	    {
	        try {
	            FileWriter Writer
	                = new FileWriter("Lakshmi file.txt");
	            Writer.write(
	                "Files in python are  good!!");
	            Writer.close();
	            System.out.println("Successfull.");
	        }
	        catch (IOException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }
	    }
	}