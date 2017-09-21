package com.exercises;

import java.util.Scanner;

public class PE15 {

	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (isEven(num) == true) {
			System.out.println("True");
		} else
			System.out.println("False");
		
		in.close();
	}
}
