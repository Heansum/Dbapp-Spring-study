package com.korea.dbapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // View(jsp파일)를 리턴!!
public class HomeController {

	final HttpServletRequest request;
	final HttpSession session;
	
	// DI = Dependency Injection(의존성 주입)
	
	public HomeController(HttpServletRequest request, HttpSession session) {
		this.request = request;
		this.session = session;
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("data", "홍길동");
		return "home"; // View 경로
	}
	
	@GetMapping("/post")
	public String post() {
		
		return "post";
	}
}
