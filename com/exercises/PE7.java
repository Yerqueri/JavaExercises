package com.exercises;
import java.util.Arrays;
import java.util.Scanner;

public class PE7 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long a = in.nextLong();
		int len = Long.toString(a).length();
		int[] digitarray = new int[len];
		int sum=0;
		for(int i=0;i<len;i++){
			digitarray[i]=(int) (a% (long)10);
			a /= (long)10;
			
		}
		StringBuffer sb = new StringBuffer();
		Arrays.sort(digitarray);
		for(int i=len-1;i>=0;i--){
			sb.append(Integer.toString(digitarray[i]));
			if(i%2 ==0) {
				sum+= digitarray[i];
			}	
		}
		
		System.out.println(sb.toString());
		System.out.println(sum);
		if(sum < 15) {
			System.out.println("False");
		}
		else
			System.out.println("True");
		
		in.close();
	}
	
}
