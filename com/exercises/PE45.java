package com.exercises;

import java.util.HashMap;
import java.util.Map;

public class PE45 {
	public static void main(String[] args) {
		String temp="";
		String temp2="";
		Map<Integer,String> m = new HashMap<>();
		String[] s = ("A programming language's surface form is known as its syntax. Most programming languages are purely textual; they use sequences of text including words, numbers, and punctuation, much like written natural languages.").split(" ");
		for(int i=0;i<s.length;i++ ) {
			m.put(i,s[i]);
		}
		System.out.println(m);
		for(int i=0;i<s.length;i++) {
			temp2 =m.get(i);
			m.put(i,temp);
			temp=temp2;
		}
		System.out.println(m);
	}
}
