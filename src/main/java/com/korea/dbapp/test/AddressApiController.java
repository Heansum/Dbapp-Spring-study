package com.korea.dbapp.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressApiController {
	
	final HttpServletRequest request;
	final HttpSession session;
	
	// DI = Dependency Injection(의존성 주입)
	
	public AddressApiController(HttpServletRequest request, HttpSession session) {
		this.request = request;
		this.session = session;
	}
	
	@GetMapping("/test/find")
	public String findAddres() {
		return "jusoPopup";
	}
}
