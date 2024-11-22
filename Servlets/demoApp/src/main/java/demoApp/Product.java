package demoApp;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Product extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.getWriter().println("Number 1 : "+req.getParameter("num1"));
		res.getWriter().println("Number 2 : "+req.getParameter("num2"));
		int n3 = Integer.parseInt(req.getParameter("num1"))*Integer.parseInt(req.getParameter("num2"));
		res.getWriter().println("Product : "+n3);
	}

}
