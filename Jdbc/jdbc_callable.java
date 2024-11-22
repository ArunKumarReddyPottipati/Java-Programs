import java.sql.*;
public class jdbc_callable
{
	public static void main(String[] args)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String userName = "mydb";
		String password = "root";
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,userName,password);
			CallableStatement cstmt = conn.prepareCall("{call pro_persons}");
			ResultSet res = cstmt.executeQuery();
			if(res.next())
				System.out.println("Name = "+res.getString(1));
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}