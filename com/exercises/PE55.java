package com.exercises;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class PE55 {
	public static void main(String[] args) {
		try	(Scanner in = new Scanner(System.in)){
			while (true) {
				System.out.println("Enter regex pattern:");
				Pattern pattern = Pattern.compile(in.nextLine());
				System.out.println("Enter text:");
				Matcher matcher = pattern.matcher(in.nextLine());
	
				if (matcher.find()) {
					System.out.println("True");
	
				} else {
					System.out.println("False");
				}
				
			}
		}	
	}
}