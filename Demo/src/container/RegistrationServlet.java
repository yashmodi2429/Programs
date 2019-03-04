package container;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		
		try
		{
			String query="insert into student values(?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","yash");
			PreparedStatement stmt=con.prepareStatement(query);
			Scanner s=new Scanner(System.in);
			
			
			
				int id1=Integer.parseInt(request.getParameter("id1"));
				//System.out.println("enter id");
				// int id1 = s.nextInt();
				
				stmt.setInt(1,id1);
				String name1=request.getParameter("name1");
				
			//	System.out.println("enter name");
				//String name1 = s.next();
				stmt.setString(2,name1);
				String email1=request.getParameter("email1");
				
			//	System.out.println("enetr email id");
				//String eid1=s.next();
				stmt.setString(3,email1);
				int i=stmt.executeUpdate();
               out.println("Registration sucessful!");
		  
		}
		catch(Exception e)
		{
			System.out.println(e);
			out.println("Registration unsucessful!");
		}
	}

}
