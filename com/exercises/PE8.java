package com.exercises;

import java.util.Scanner;

public class PE8 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int toguess= 42;
		int guess=0;
		while(guess != toguess) {
			guess = in.nextInt();
			if(guess<toguess) {
				System.out.println("number is greater than guess");
			}
			else if(guess>toguess) {
				System.out.println("number is smaller than guess");
			}
			else {
				System.out.println("correct answer");
				break;
			}
		}
		in.close();
	}

}
