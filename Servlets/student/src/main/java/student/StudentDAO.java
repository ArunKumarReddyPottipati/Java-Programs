package student;

import java.sql.*;

public class StudentDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/XE";
	String username = "mydb";
	String password = "root";
	
	void registerUser(String rno,String email,String pass)
	{
		String sql = "insert into registration(rno,email,password) values(?,?,?)";
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, rno);
			pst.setString(2, email);
			pst.setString(3, pass);
			pst.executeUpdate();
			conn.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	boolean checkLogin(String uname,String pass)
	{
		String sql = "select * from registration where rno = ? and password = ?";
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, uname);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return false;
	}

}
