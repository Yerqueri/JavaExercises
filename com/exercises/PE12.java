package com.exercises;

import java.util.Scanner;

public class PE12 {
	public static boolean isPower (int x)
    {
        int power = 1;
        while (power < x)
           power = power * 4;
        return (power == x);
    }
	
	public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean flag = isPower(a);
        if(flag==true) {
        	System.out.println(a+" is a power of four");
        }
        else {
        	System.out.println(a+" is not a power of four");
        }
        in.close();
    }
}
