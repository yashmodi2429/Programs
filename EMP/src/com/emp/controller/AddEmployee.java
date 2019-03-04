package com.emp.controller;
import com.emp.model.Pojo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Dao.implementation.*;;


@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Pojo p = new Pojo();
		try {
			int id =Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			
			p.setEmployeeId(id);
			p.setEmployeeName(name);
			System.out.println("value of id "+ id);
		}catch(Exception e) {
			req.getRequestDispatcher("Error.html").forward(req, res);
		}
		Daoimplementation e = new Daoimplementation();
		int x =e.addEmployee(p);
		if(x==0) {
			
			res.sendRedirect("AddEmployee.jsp");
		}else {
			
			res.sendRedirect("AddEmployee.jsp");
		}
		
		
	}

}
