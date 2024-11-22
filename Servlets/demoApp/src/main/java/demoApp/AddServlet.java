package demoApp;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
		
		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
		{
			int n1 = Integer.parseInt(req.getParameter("num1"));
			int n2 = Integer.parseInt(req.getParameter("num2"));
			int n3 = n1+n2;
			res.getWriter().println("Sum of"+n1+" and "+n2+" is "+n3);
			
		}
		

	}

