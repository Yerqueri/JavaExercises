package com.exercises;

import java.util.Scanner;

public class PE26 {
	private boolean checkOrder(String[] s, int a) {
		boolean flag=true;
		if(a==-1) {
			for(int i=0;i<s.length-1;i++) {
				if(Integer.parseInt(s[i])+1!=Integer.parseInt(s[i+1])) {
					flag=false;
					break;
				}
			}
		}
		
		if(a==1) {
			for(int i=0;i<s.length-1;i++) {
				if(Integer.parseInt(s[i])-1!=Integer.parseInt(s[i+1])) {
					flag=false;
					break;
				}
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		String[] s2=s.split(",");
		boolean flag=false;
		PE26 ob= new PE26();
		if(Integer.parseInt(s2[0])>Integer.parseInt(s2[1])) {
			flag=ob.checkOrder(s2, 1);
			//System.out.println(flag+"1");
		}
		else {
			flag=ob.checkOrder(s2, -1);
			//System.out.println(flag+"-1");
		}
		
		if(flag==true) {
			System.out.println("Numbers are in serial");
		}
		else {
			System.out.println("Numbers were not in serial order");
		}
		in.close();
	}

}
