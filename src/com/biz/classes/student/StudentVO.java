package com.biz.classes.student;

public class StudentVO {

	public String strNum;
	public String strName;
	public int intYear;
	public String strDept;
	
	public void view(int intCurYear) { //void view(int CYear)를 우리 말로 파라메타(정확히는 int cYear를), 매개변수, 아규먼트라고 한다.
		
		System.out.println("학번 : " + strNum);
		System.out.println("이름 : " + strName);
		System.out.println("생년 : " + intYear);
		System.out.println("전공 : " + strDept);
		System.out.println("나이 : " 
					+ (intCurYear - intYear));
		
	}
	
}
