package com.bit.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class Ex07Controller {

	@RequestMapping("/ex08") //ex08.jsp �������� �����Ƿ� �ȵ�. void �Ϸ��� ���� �̸��� �� ������ �־�� ��
	public void ex01() {}

//	@RequestMapping("/ex09")
	public ModelAndView ex02() { //ModelAndView �� ��� null �ָ� ��
		return null;
	}
	
//	@RequestMapping("/ex10")
	public View ex03() { //View �� ��� ��ü���������� �ϸ� ��
		return new View() {

			@Override
			public String getContentType() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
