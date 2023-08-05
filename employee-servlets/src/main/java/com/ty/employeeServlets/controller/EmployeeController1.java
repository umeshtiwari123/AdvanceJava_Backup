package com.ty.employeeServlets.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeController1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		String name=req.getParameter("name");
		String password=req.getParameter("mypassword");
		
		HttpSession session=req.getSession();
		session.setAttribute(name, session);
	}
}
