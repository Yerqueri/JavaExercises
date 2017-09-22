package com.exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PE20 {
	public static void main(String[] args) {
		String dirname = "src/com/iofiles/pe14.txt";
		try {
			File f = new File(dirname);
			InputStream fileInputStream = new FileInputStream(f);
			Scanner filehandle = new Scanner(fileInputStream);
			Scanner s = filehandle.useDelimiter("\\A");
			String raw =  s.hasNext() ? s.next() : "";
			raw=raw.replaceAll("[^a-zA-Z0-9]+"," ");
			raw= raw.toLowerCase();
			String[] rawArr = raw.split(" ");
			Map<String, Integer> m = new HashMap<String, Integer>(); 
			for (String a : rawArr) { 
				Integer freq = m.get(a); 
				m.put(a, (freq == null) ? 1 : freq + 1); 
			} 
			fileInputStream.close();
			filehandle.close();
			System.out.println(m); 

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}	

}
