package com.biz.classes.student;

public class StudentMain {

	public static void main(String[] args) {

		Student student01 = new Student();
		Student student02 = new Student();
		Student student03 = new Student();
		
		student01.strStudentId = "133333";
		student01.strName = "홍길동";
		student01.admissionYear = 2013;
		student01.strMajor = "컴퓨터";

		student02.strStudentId = "144444";
		student02.strName = "김갑동";
		student02.admissionYear = 2014;
		student02.strMajor = "경영";

		student03.strStudentId = "155555";
		student03.strName = "김을동";
		student03.admissionYear = 2015;
		student03.strMajor = "행정";
		
		System.out.println("===============================================");
		System.out.println("학생 개인의 정보 보기");
		System.out.println("===============================================");
		student01.StudentInformation();
		student02.StudentInformation();
		student03.StudentInformation();
		System.out.println("===============================================");
		
		System.out.println();
		System.out.println("===============================================");
		System.out.println("학생 리스트 보기");
		System.out.println("===============================================");
		System.out.println("학번\t이름\t입학년도\t전공\t학년");
		System.out.println("-----------------------------------------------");
		student01.StudentList();
		student02.StudentList();
		student03.StudentList();
		System.out.println("===============================================");
		
		
		
		
	}

}
