package com.exercises;

import java.util.Scanner;

public class PE24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] places  = s.split(" ");
		for(String place :places) {
			System.out.println(place.replaceAll( "[aeiou]", "" ));
		}
		in.close();
	}
}
