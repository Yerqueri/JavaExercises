package com.exercises;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int id;
	private int age;
	private String name;

	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int compareByAge(Student stu) {
		int compareAge = ((Student) stu).getAge();
		return this.age - compareAge;
		// descending order
		// return compareId - this.id;

	}

	
	public static Comparator<Student> StudentAgeComparator = new Comparator<Student>() {

		public int compare(Student stu1, Student stu2) {

			int stuAge1 = stu1.getAge();
			int stuAge2 = stu2.getAge();
			String stuname1 =stu1.getName();
			String stuname2 =stu2.getName();


			if(stuAge1 == stuAge2) {
				return stuname1.compareTo(stuname2);
			}
			return stu1.compareByAge(stu2);

		}

	};

	@Override
	public int compareTo(Student stu) {
		int compareId = ((Student) stu).getId();
		return this.id - compareId;
	}

}
