package Filehandling;
import java.io.FileWriter;
import java.io.IOException;


	import java.io.*;
	public class Appendastringtothefile {
	// Main class
	
	 
		 public static void main(String[] args) throws IOException { 
		 
			 String textToAppend = " I am learning file handling";
			 String fileName = "Lakshmi file.txt";

			 try(FileWriter fw = new FileWriter(fileName, true);
			 BufferedWriter writer = new BufferedWriter(fw);) {

			   writer.write(textToAppend);
			 }  
		 }
	}