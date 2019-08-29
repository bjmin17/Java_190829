package com.biz.classes;

import com.biz.model.AddressVO;

public class AddressMain {

	public static void main(String[] args) {

		AddressVO address01 = new AddressVO();
		address01.strName = "홍길동";
		address01.strTel = "01012345678";
		address01.strAddr = "북구 설죽로";
		address01.strChain = "관계";
		
		address01.view();
	}

}
