package com.exercises;

import java.util.Scanner;
import com.exeptions.InvalidGradeInput;;

public class PE21 {
	private static boolean checkNo(int a)throws InvalidGradeInput{
		if(a<0 || a>100) {
			throw new InvalidGradeInput("grades must be between 0 and 100");
		}else {
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int noOfStudents =in.nextInt();
		int[] stuGrades = new int[noOfStudents];
		for(int i=0;i<noOfStudents;i++) {
			System.out.println("Enter grades for student "+i+" :");
			int grade = in.nextInt();
			try {
				boolean b=checkNo(grade);
				if(b==true) {
					stuGrades[i]=grade;
				}
			}
			catch(InvalidGradeInput e) {
				e.printStackTrace();
				i--;
			}
			
		}
		in.close();
	}
}
