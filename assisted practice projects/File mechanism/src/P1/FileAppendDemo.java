package P1;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {

	public static void main(String[] args) {
		String data = "data is appended..";
		try {
		    FileWriter output = new FileWriter("data1.txt",true);
		    output.write(data);
		    System.out.println("data append successfully.");
		    output.close();
		} catch (IOException ex) {
			System.out.println("file append error...");
		}
				
				

	}

}