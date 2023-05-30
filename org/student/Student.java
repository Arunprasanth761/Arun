package org.student;

import org.department.Department;

public class Student extends Department{
	public void StudentName() {
		System.out.println("Arun");
	}
	public void StudentDept() {
		System.out.println("Mechatronics");
	}
	public void StudentId() {
		System.out.println("18mtr010");
	}

	public static void main(String[] args) {
		Student stud=new Student();
		stud.StudentName();
		stud.StudentDept();
		stud.StudentId();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		
	}

}
