package demoApp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/addfact")

public class DigitSum extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int n = Integer.parseInt(req.getParameter("num"));
		int sum=0,dig,temp=n;
		while(n>0)
		{
			dig=n%10;
			sum+=dig;
			n/=10;
		}
		req.setAttribute("digSum", sum);
		RequestDispatcher rd = req.getRequestDispatcher("fact");
		rd.forward(req, res);
		
	}

}
