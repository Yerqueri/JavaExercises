package com.exercises;

public class PE17 {
	
	public static int Factorial(int n) {
		if (n > 12)
			throw new IllegalArgumentException(n + " is out of range");
		int i, factorial = 1;
		int num = n;
		for (i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	public static void main(String[] args) {
	
		for (int i = 0; i <= 14; i++) {
			System.out.println(Factorial(i));
		}
	}

}
