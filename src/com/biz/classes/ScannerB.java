package com.biz.classes;

import java.util.Scanner;

public class ScannerB {
//ScannerBug
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 >> ");
		String strName = scanner.nextLine();
		
		System.out.print("국어 >> ");
		int intKor = scanner.nextInt();
		
		System.out.print("영어 >> ");
		int intEng = scanner.nextInt();

		System.out.print("전화 >> ");
		String strTel = scanner.nextLine(); // 전화 >> 전화1 >> ,, nextInt버그로 다음 코드를 건너뜀

		System.out.print("전화1 >> ");
		String strTel1 = scanner.nextLine();
		
				
	}

}
