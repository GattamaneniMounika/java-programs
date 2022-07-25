package com;
import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main(String[] args) {
		File myFile = new File("data1.txt");
		
		
		try {
			if(myFile.createNewFile()) {
				System.out.println("file created successfully");
			}
			else {
				System.out.println("file creation error.");
			}
		} catch (IOException e) {
			System.out.println("file error....");
		}
	}

}