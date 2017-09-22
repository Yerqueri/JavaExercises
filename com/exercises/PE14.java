package com.exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class PE14 {
	public static void main(String[] args) {
		String dirname = "src/com/iofiles/pe14.txt";
		try {
			File f = new File(dirname);
			InputStream fileInputStream = new FileInputStream(f);
			for(int i = 0; i < fileInputStream.available(); i++) {
	            System.out.print(Character.toUpperCase((char)fileInputStream.read()));
	         }
			fileInputStream.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}	
}
