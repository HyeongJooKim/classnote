package com.bit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") //�� Ŭ���� ��ü�� ����Ǵ� ��, �� ���� �� �ִ� ��. value�� ����. ���� / �־� �ָ� �Ʒ��� �� �ȳ־ ��
public class Ex05Controller {

	@RequestMapping("ex06")
	public void ex01() {} //void�� ��� url �� ��������

	@RequestMapping("ex/ex07")
	public void ex02() {} 
	//�� ��� /ex/ex07�� �������� �����Ƿ� �˻� �ȵ�. �޼ҵ���� ��� ����. ���� ����. 

}