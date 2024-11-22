package demoApp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetNumbers extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException
	{
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		res.sendRedirect("prod?num1="+n1+"&num2="+n2);
//		req.setAttribute("num1", n1);
//		req.setAttribute("num2", n2);
//		RequestDispatcher rd = req.getRequestDispatcher("prod");
//		rd.forward(req, res);
	}

}
