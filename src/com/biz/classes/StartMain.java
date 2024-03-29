package com.biz.classes;

import com.biz.classes.grade.GradeVO;
import com.biz.classes.grade.StaticGrade;

public class StartMain {

	public static void main(String[] args) {

		/*
		 * static class는
		 * 선언, 생성, 초기화 과정을 코딩하지 않고
		 * 직접 클래스.~~~ 방식으로 접근할 수 있다.
		 */
		StaticGrade.strNum = "001";
		StaticGrade.strName = "홍길동";
		
		StaticGrade.intKor = 90;
		StaticGrade.intEng = 88;
		StaticGrade.intMath = 77;
		
		StaticGrade.sum(); // 총점 : 255

		/*
		 * non static class는
		 * 반드시 접근(읽기, 쓰기)전에
		 * 대리자를 선언, 생성, 초기화 과정을 코딩해야 한다.
		 * 대리자 : 객체, Object, instance 라고 한다.
		 * 대리자는 클래스의 복제품이다.
		 * 
		 * 대리자가 선언, 생성, 초기화 되면
		 * 대리자는 일반 변수와 같은 방식으로 사용된다.
		 */
		GradeVO grade01 = new GradeVO(); // Non static 변수들은 대리자를 만들고 생성자로 만들어줘야 한다.
		grade01.strNum = "002"; // import오류나면 ctrl shift o 눌러서 import문을 작성해야 한다.
		grade01.strName = "성춘향";
		
		grade01.intKor = 99;
		grade01.intEng = 99;
		grade01.intMath = 99;
		
		grade01.sum(); // 총점 : 297 \n 총점 : 99
		
		/*
		 * grade02는 grade01과 마찬가지로 GradeNew의 복제자(품)이지만 
		 * 전혀 별개의 메모리 장소에 존재하므로
		 * grade01과는 관계, 영향이 전혀 미치지 않는다.
		 */
		GradeVO grade02 = new GradeVO();
		GradeVO grade03 = new GradeVO();
		GradeVO grade04 = new GradeVO();
		GradeVO grade05 = new GradeVO();
		
		
		
	}

}
