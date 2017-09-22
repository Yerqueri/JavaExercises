package com.exercises;

import java.util.Scanner;

public class PE11 {
	private String reverse(String s) {
		StringBuffer s1 = new StringBuffer(s).reverse();
		return s1.toString();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		PE11 ob = new PE11();
		String rev = ob.reverse(s);
		System.out.println(rev);
		if(rev==s) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		in.close();
	}	
}
