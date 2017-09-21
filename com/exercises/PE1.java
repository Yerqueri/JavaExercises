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
		
		long a = in.nextInt();
		String s = Long.toString(a);
		StringBuffer buff = new StringBuffer(s);
		if(buff.reverse().toString().equals(s)) {
			isAPalindrome=true;
		}
		
		if(a>20 && a<=30 && a%2==0) {
			System.out.println("jerry");
		}
		if(a>20 && a<=30 && a%2!=0) {
			System.out.println("tom");
		}
		
		long sum = 0;
		
		if(isAPalindrome) {
			sum=findSum(s);
			if(sum%2==0 && sum >25)
				System.out.println(s+" is palindrome and the sum of even numbers is greater than 25");
			
			if(sum%2==0 && sum<25)
				System.out.println(s+" is is palindrome and sum of even numbers is less than 25 ");
		}
		else {
			System.out.println(s+" is not palindrome");
		}
		
		in.close();
	}
}
