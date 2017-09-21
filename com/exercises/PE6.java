package com.exercises;
import java.util.Scanner;

public class PE6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char a = in.nextLine().charAt(0);
		if((int)a>= (int)'a' && (int)a<=(int)'z') {
			System.out.println("small letter");
		}
		else if((int)a>= (int)'A' && (int)a<=(int)'Z') {
			System.out.println("Capital letter");
		}
		else if((int)a>= (int)'0' && (int)a<=(int)'9') {
			System.out.println("Capital letter");
		}
		else {
			System.out.println("Special charachter");
		}
		
		in.close();
	}
}
