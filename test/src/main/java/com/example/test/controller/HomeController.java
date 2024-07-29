package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody //웹화면으로 바로나옴
	public String home() {
		return "Hello Boot";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "/index";
	}
	@RequestMapping("/modelTest")
	public String modelTest(Model model) { 
		//model 은request와는 다르게 데이터가 뷰로 전달되어 특정 뷰에서만 사용할 수 있다. 
		 /*주로 사용되는 프레임워크가 다르다는 차이점이 있다.
		 Servlet은 JSP나 Servlet을 이용한 웹 어플리케이션 개발에 사용되며 
		 Spring MVC는 Spring 기반의 웹 어플리케이션 개발에 사용된다. 
		 서로 다른 개발 환경에서 사용되는 메서드이기 때문에 사용 범위가 다르다.
		 */
		//req.setAttribute("name", "123");
		//req.setAttribute("tel", "123-123");
		model.addAttribute("name","abcdefg");
		model.addAttribute("tel", "123-1234");
		
		return "/modelTest";
	}
}