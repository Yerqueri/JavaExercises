package com.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PE42 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String raw = in.nextLine();
		raw=raw.replaceAll("[^a-zA-Z0-9]+"," ");
		raw=raw.trim().replaceAll(" +"," ");
		raw= raw.toLowerCase();
		String[] rawArr = raw.split(" ");
		Map<String, Integer> m = new HashMap<String, Integer>(); 
		for (String a : rawArr) { 
			Integer freq = m.get(a); 
			m.put(a, (freq == null) ? 1 : freq + 1); 
		} 
		System.out.println(m); 
		in.close();
	}

}
