package com.biz.classes.book;

public class BookMain {

	public static void main(String[] args) {

		Book book01 = new Book();
		Book book02 = new Book();
		Book book03 = new Book();
		
		book01.strBookName = "자바프로그래밍";
		book01.strCo = "이지스퍼블리밍";
		book01.strWriter = "박은종";
		book01.price = 25000;
		
		book02.strBookName = "가가가가가가";
		book02.strCo = "나나나나나나";
		book02.strWriter = "다다다";
		book02.price = 30000;

		book03.strBookName = "AAAAAAAAAAAAA";
		book03.strCo = "BBBBBBBBBBBBB";
		book03.strWriter = "CCC";
		book03.price = 50000;
		
		System.out.println("============================================================");
		System.out.println("도서의 개별 정보");
		book01.bookinfo();
		book02.bookinfo();
		book03.bookinfo();
		System.out.println("============================================================");
		
		System.out.println("============================================================");
		System.out.println("도서 리스트 보기");
		System.out.println("------------------------------------------------------------");
		System.out.println("도서명\t\t\t출판사\t\t저자\t가격");
		book01.booklist();
		book02.booklist();
		book03.booklist();
		System.out.println("============================================================");
	}

}
