package com.biz.classes;

import java.util.Scanner;

public class Prime_01 {

	/*
	 * 어떤 수(num)가 소수인지 아닌지를 알아보자
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 >> ");
		String strNum = scanner.nextLine();
		
		int num = Integer.valueOf(strNum);
		
		int index;
		for(index = 2; index < num; index++) {
			if(num % index == 0) break; //13은 소수라 if문이 true인 경우가 없고, 계속 반복될 때 index 값은??
		}
		
		// index 의 값은 ?? 12가 아니라 13임.
		if(index >= num) {
			System.out.println(num + "는 소수(Prime)이다!!");
		} else {
				System.out.println(num + "는 소수가 아니다!!!");
		}
	}
}
