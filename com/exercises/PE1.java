package com.exercises;
import java.util.Scanner;


public class PE1 {
	
	
	private static long findSum(String s) {
		long sum =0;
		for(int i=0;i<s.length();i++) {
			
			if(i%2==0) {
				sum+=s.charAt(i) -'0';
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean isAPalindrome = false;
		
		long input = in.nextInt();
		String inString = Long.toString(input);
		StringBuffer buff = new StringBuffer(inString);
		if(buff.reverse().toString().equals(inString)) {
			isAPalindrome=true;
		}
		
		if(input>20 && input<=30 && input%2==0) {
			System.out.println("jerry");
		}
		if(input>20 && input<=30 && input%2!=0) {
			System.out.println("tom");
		}
		
		long sum = 0;
		
		if(isAPalindrome) {
			sum=findSum(inString);
			if(sum%2==0 && sum >25)
				System.out.println(inString+" is palindrome and the sum of even numbers is greater than 25");
			
			if(sum%2==0 && sum<25)
				System.out.println(inString+" is is palindrome and sum of even numbers is less than 25 ");
		}
		else {
			System.out.println(inString+" is not palindrome");
		}
		
		in.close();
	}
}
