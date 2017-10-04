package com.exercises;

public class PE13 {
	public static void main(String[] args) {
		Member member = new Member() {
			
		};
		member.age=22;
		member.name="Ayush";
		member.salary=Integer.MAX_VALUE;
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.salary);
	}
	
}
