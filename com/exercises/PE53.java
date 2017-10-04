package com.exercises;

public class PE53 {
	 public static void main(String[] args) {
		new Exception("you are trying to do something fishy in your code");
		int a=1;
		try {
			System.out.println(a/0);
		} catch( Exception e ){
			e.printStackTrace();
		}finally {
			System.out.println("I was here");
		}
	}
}
