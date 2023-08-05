package com.ty.Student.EB8.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Student.EB8.dao.StudentDao;
import com.ty.Student.EB8.dto.Student;

public class StudentController extends HttpServlet{
	
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	//super.doPost(req, resp);
	String name=req.getParameter("name");
	String address=req.getParameter("address");
	long phone=Long.parseLong(req.getParameter("phone"));
	String email=req.getParameter("email");
	String password=req.getParameter("mypassword");
	
	Student student=new Student();
	student.setName(name);
	student.setAddress(address);
	student.setPhone(phone);
	student.setEmail(email);
	student.setPassword(password);
	
	StudentDao studentDao=new StudentDao();
	studentDao.saveStudent(student);
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("StudentMessage.html");
	dispatcher.forward(req, resp);
	
	
	
	
	
}
	
	
	
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		
//		String name=req.getParameter("name");
//		String address=req.getParameter("address");
//		long phone=Long.parseLong(req.getParameter("phone"));
//		String email=req.getParameter("email");
//		String password=req.getParameter("mypassword");
//		
//		Student student=new Student();
//		student.setName(name);
//		student.setAddress(address);
//		student.setPhone(phone);
//		student.setEmail(email);
//		student.setPassword(password);
//		
//		StudentDao studentDao=new StudentDao();
//		studentDao.saveStudent(student);
//		
//		RequestDispatcher dispatcher=req.getRequestDispatcher("StudentMessage.html");
//		dispatcher.forward(req, res);
//	}

	
}
