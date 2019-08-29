package com.biz.classes.book;

/*
 * 1. 프로젝트 : Java_07
 * 2. 패키지 : com.biz.classes.book
 * 3. 도서관의 정보처리를 위하여
 * 		Book 클래스를 추상화하여 정의하시오.
 * 		1.'도서'정보에는
 * 		
 */
public class Book {
	
	public String strBookName;
	public String strCo;
	public String strWriter;
	public int price;
	
	public void bookinfo() {
		System.out.println("------------------------------------------------------------");
		System.out.println("도서명 : " + strBookName);
		System.out.println("출판사 : " + strCo);
		System.out.println("저자 : " + strWriter);
		System.out.println("가격 : " + price);
		System.out.println("------------------------------------------------------------");
		System.out.println();
	}
	
	public void booklist() {

		System.out.printf("%s\t\t%s\t%s\t%d\n", strBookName,
				strCo,
				strWriter,
				price);
	}
	

}
