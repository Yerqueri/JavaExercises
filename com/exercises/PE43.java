package com.exercises;

import java.util.HashMap;
import java.util.Map;

public class PE43 {
	public static void main(String[] args) {
		String arr[] = {"a","b","c","d","a","c","c"};
		Map<String, Boolean> m = new HashMap<>(); 
		for (String a : arr) { 
			Boolean flag = m.get(a); 
			m.put(a, (flag == null) ? false : true); 
		}
		System.out.println(m);
	}
}
