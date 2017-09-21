package com.exercises;

import java.util.Scanner;

public class PE5 {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] arr = s.split(" ");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			try {
				sum+= Integer.parseInt(arr[i]);
			}
			catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
		System.out.println(sum);
		in.close();
	}

}
