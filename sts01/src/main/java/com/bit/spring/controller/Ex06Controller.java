package com.bit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex06Controller {

	@RequestMapping("/ex07/*") //주소 뒤에 뭐가 와도 다 ex07로 감
	public String ex01() {
		System.out.println("/ex07/*");
		return "ex07";
	}

	@RequestMapping("/ex07")
	public String ex02() {
		System.out.println("/ex07");
		return "ex07";
	}
}