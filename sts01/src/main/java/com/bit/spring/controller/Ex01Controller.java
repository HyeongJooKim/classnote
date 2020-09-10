package com.bit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//POJO (Plain Old Java Object)

//bean ��ü ����
@Controller
public class Ex01Controller {
	
	//url����
	@RequestMapping("/ex01.bit")
	public ModelAndView ex01() {
		//�̷��� �����ϰԸ� �ص� ���۵�
		return new ModelAndView("ex01");
	}
}