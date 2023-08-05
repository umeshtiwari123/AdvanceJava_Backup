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

public class LoginController extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("name");
		String password=req.getParameter("mypassword");
		
		StudentDao studentdao=new StudentDao();
		Student student=studentdao.getStudentByEmail(name);
		
		if(student.getPassword().equals(password)) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("index.html");
			dispatcher.forward(req, resp);
		}
		else {
			resp.getWriter().print("<html><body>Invalid Credentials</body></html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("student1.html");
			dispatcher.include(req, resp);
		}
	
	
	
	
	
	
	}
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		
//		String name=req.getParameter("name");
//		String password=req.getParameter("mypassword");
//		
//		StudentDao studentdao=new StudentDao();
//		Student student=studentdao.getStudentByEmail(name);
//		
//		if(student.getPassword().equals(password)) {
//			RequestDispatcher dispatcher=req.getRequestDispatcher("index.html");
//			dispatcher.forward(req, res);
//		}
//		else {
//			res.getWriter().print("<html><body>Invalid Credentials</body></html>");
//			RequestDispatcher dispatcher=req.getRequestDispatcher("student1.html");
//			dispatcher.include(req, res);
//		}

//}
}