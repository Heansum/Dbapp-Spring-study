package com.korea.dbapp.web;

import org.junit.jupiter.api.Test;

public class UserControllerTest {

	//@Test
	public void 주소파싱() {
		String addr = "http://localhost:8000/user/2";
		String host = "http://localhost:8000";
		
		String r1 = addr.replace(host, "");
		// host를 공란으로 만듬
		String[] r2 = r1.split("/");
		//        -0/- -user/-2
		System.out.println(r2[2]);
		System.out.println("주소파싱테스트");
	}
	
	@Test
	public void 서브스트링() {
		String addr = "{2}";
		int startIndex = addr.indexOf("{");
		int endIndex = addr.indexOf("}");
		System.out.println(startIndex);
		System.out.println(endIndex);
		String result = addr.substring(startIndex+1, endIndex);
		System.out.println(result);
	}
	
}
