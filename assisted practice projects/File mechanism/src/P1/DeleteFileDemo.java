package P1;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		File myFile = new File("data2.txt");
		
		if(myFile . delete()){
			System.out.println("file deleted:."+myFile.getName()+"successfully:");
			
		}
		else {
			System.out.println("failed to delete a file.");
		}

	}

}