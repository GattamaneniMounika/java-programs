package Filehandling;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 
  
public class Readingafile {
	
	  
	
	
	
	    public static void main(String[] args)
	    {
	        try {
	            File Obj = new File("Lakshmi file.txt");
	            Scanner Reader = new Scanner(Obj);
	            while (Reader.hasNextLine()) {
	                String data = Reader.nextLine();
	                System.out.println(data);
	            }
	            Reader.close();
	        }
	        catch (FileNotFoundException e) {
	            System.out.println("error has occurred.");
	            e.printStackTrace();
	        }
	    
	}
}