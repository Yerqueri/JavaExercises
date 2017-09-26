package com.exercises;

import java.util.ArrayList;

public class PE47 {
	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Java");
		c1.add("C");
		c1.add("C++");
		c1.add("Python");
		c1.add("JavaScript");
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Java");
		c2.add("Angular");
		c2.add("C++");
		c2.add("JavaScript");
		ArrayList<String> c3 = new ArrayList<>();
		for(String s:c1) {
			if(c2.contains(s)) {
				c3.add("yes");
			}
			else {
				c3.add("no");
			}
		}
		System.out.println(c3);
	}
}
