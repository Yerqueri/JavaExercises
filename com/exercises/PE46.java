package com.exercises;
import java.util.*;

public class PE46 {
	public static void main(String[] args) {
		SortedSet<String> ss= new TreeSet<>();
		String[] s = ("A programming language's surface form is known as its syntax. Most programming languages are purely textual; they use sequences of text including words, numbers, and punctuation, much like written natural languages.").toLowerCase().split(" | ,");
		for(int i=0;i<s.length;i++ ) {
			ss.add(s[i]);
		}
		ArrayList<?> list = new ArrayList<>(ss);
		System.out.println(list);
	}
}
