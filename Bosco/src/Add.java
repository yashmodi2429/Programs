

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class Add extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       int count =1;
      @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			int i = Integer.parseInt(request.getParameter("t1"));
			int j = Integer.parseInt(request.getParameter("t2"));
		    int k = i + j;
			PrintWriter out=response.getWriter();
			out.println(k);
			out.println("\nNumber of time you visit a page is" + count++);
		}
      
}
