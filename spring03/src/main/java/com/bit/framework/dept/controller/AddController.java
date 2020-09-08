package com.bit.framework.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.dept.model.DeptDao;
import com.bit.framework.dept.model.entity.DeptVo;

public class AddController implements Controller {

	DeptDao deptDao;
	
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav=new ModelAndView();
		DeptVo bean=new DeptVo();
		
		request.getAttribute("deptno");
		request.getAttribute("dname");
		request.getAttribute("loc");
		
		
		mav.setViewName("dept/add");
		mav.addObject("list", deptDao.insertOne(bean));
		return mav;
	}
}
