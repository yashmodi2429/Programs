package com.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeemanagement.employee_dao_impl.EmployeeDAOImpl;
import com.employeemanagement.model.Pojo;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException{
		Pojo p = new Pojo();
		try {
			int id =Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			
			p.setEmployeeId(id);
			p.setEmployeeName(name);
			
		}catch(Exception e) {
			req.getRequestDispatcher("Error.html").forward(req, res);
		}
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		int x =e.addEmployee(p);
		if(x==0) {
			
			res.sendRedirect("Error.html");
		}else {
			
			res.sendRedirect("AddEmployee.jsp");
		}
		
		
	}
}
