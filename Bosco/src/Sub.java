import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sub")
      public class Sub extends HttpServlet
      {
	
		private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int i = Integer.parseInt(request.getParameter("t11"));
		int j = Integer.parseInt(request.getParameter("t22"));
		int l = i - j;
		PrintWriter out=response.getWriter();
		out.println(l);
	}
      }
		