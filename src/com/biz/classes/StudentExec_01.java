package com.biz.classes;

import com.biz.classes.student.Student;

public class StudentExec_01 {

	public static void main(String[] args) {

		// Student 클래스를 활용하여
		// 실제 작동되는 코드를 작성
		Student student = new Student();
		
		student.strStudentId = "001";
		student.strName = "홍길동";
		student.admissionYear = 2012;
		student.strMajor = "회계학";
		
		student.StudentInformation();
		
		student.StudentList();
		
	}

}
