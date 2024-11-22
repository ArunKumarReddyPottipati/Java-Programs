package student;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Scanner;

@WebServlet("/student")

public class StudentServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String username = "mydb";
		String password = "root";
		String sql = "insert into student(name,rno,age,gender,email,phone) values(?,?,?,?,?,?)";

		String name = request.getParameter("name");
		String rno = request.getParameter("rno");
		String gen = request.getParameter("gender");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		long phone = Long.parseLong(request.getParameter("phone"));
		try
		{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,username,password);
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, name);
		pst.setString(2, rno);
		pst.setInt(3,age);
		pst.setString(4,gen);
		pst.setString(5, email);
		pst.setLong(6,phone);
		pst.executeUpdate();
		conn.close();
		}
		catch(Exception e)
		{
			response.getWriter().println(e);
		}

		response.getWriter().println("Details uploaded successfully");
	}

}
