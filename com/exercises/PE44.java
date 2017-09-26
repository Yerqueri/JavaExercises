package com.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PE44 {
	public static void main(String[] args) {
		ArrayList<Student> stulist = new ArrayList<>();
		stulist.add(new Student(1,22,"Ayush"));
		stulist.add(new Student(9,22,"Ayush"));
		stulist.add(new Student(2,22,"Ankur"));
		stulist.add(new Student(3,23,"Jaydeep"));
		stulist.add(new Student(4,23,"Palash"));
		stulist.add(new Student(5,24,"Age"));
		stulist.add(new Student(6,24,"Age"));
		
		Collections.sort(stulist,Student.StudentAgeComparator); 
		System.out.println(stulist);
		Iterator<Student> itr2=stulist.iterator();  
		while(itr2.hasNext()){  
			Student st=(Student)itr2.next();  
			System.out.println(st.getId()+" "+st.getName()+" "+st.getAge());  
		}  
	}
}
