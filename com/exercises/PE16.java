package com.exercises;

import java.util.Scanner;

public class PE16 {
	
	private int findMin(int[] a){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	private int findMax(int[] a){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	private double findAvg(int[] a){
		double avg=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
            sum+=a[i];
        }
		avg=sum/a.length;
		return avg;
	}
	
	public static void main(String[] args) {
		PE16 obj = new PE16();
		Scanner in = new Scanner(System.in);
		
		System.out.println("  Enter the number of students: ");
        int students= in.nextInt();
        int[] grades= new int[students];
        
        
        System.out.println( "The average is"+obj.findAvg(grades));
        System.out.println("The minimum is"+obj.findMin(grades));
        System.out.println(" The maximum is"+obj.findMax(grades));
        in.close();
	}
}
