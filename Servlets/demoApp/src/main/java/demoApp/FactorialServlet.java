package demoApp;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fact")

public class FactorialServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int n=(int)(req.getAttribute("digSum"));
		res.getWriter().println("Sum of the digits = "+n);
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		res.getWriter().println("Factorial of "+n+" is "+fact);
		
	}

}
