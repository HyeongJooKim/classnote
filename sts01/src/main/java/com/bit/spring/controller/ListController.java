package com.bit.spring.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.spring.model.DeptDao;

@Controller
public class ListController {
	
	DeptDao deptDao;
	
	@Autowired
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@RequestMapping("/list")
	public String list(Model model) throws SQLException {
		model.addAttribute("list",deptDao.selectAll());
		return "list";
	}
}