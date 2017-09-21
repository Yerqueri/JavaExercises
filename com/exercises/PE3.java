package com.exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import com.exeptions.DigitFoundExeption;

public class PE3 {
	
	private void checkDigit(char c) throws DigitFoundExeption{
		int a=c;
		
		if(a-'0'>=0 && a-'0'<=9) {
			throw new DigitFoundExeption("digit was found");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList <Character> a = new ArrayList<>();
		a.addAll(Arrays.asList('a','e','i','o','u'));
		
		String s = in.nextLine();
		 PE3 obpe3 = new PE3();
		
		for(int i=0;i<s.length();i++) {
			try {
				obpe3.checkDigit(s.charAt(i));
				
				if(a.contains(s.charAt(i))){
					System.out.print("Vowel ");
				}
				else
					System.out.print("Consonant ");
				
			}catch(DigitFoundExeption e) {
				e.printStackTrace();
			}
		}
		in.close();
	}

}
