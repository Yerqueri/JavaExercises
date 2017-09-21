package com.exercises;

import java.util.Scanner;

public class PE10 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s1= in.nextLine();
			int rep = in.nextInt();
			String s2 =s1.substring(s1.length()-rep, s1.length());
			for (int i=rep; i>0; i--) {
			     s1+=s2;
			    }
			 
			    System.out.println(s1);
			
			in.close();
		}
}