package com.exercises;

import java.util.Scanner;

public class PE4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println(new String(new char[i]).replace('\0', Integer.toString(i).charAt(0)));
		}
		in.close();
	}
}
