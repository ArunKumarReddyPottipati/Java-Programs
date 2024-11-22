import java.sql.*;
public class jdbcPreparedStmt1
{
	public static void main(String[] args)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String username = "mydb";
		String password = "root";
		try
		{
			String qry = "select * from persons where city = ?";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = conn.prepareStatement(qry);
			pstmt.setString(1,"Fire Nation");
			ResultSet res = pstmt.executeQuery();
			while(res.next())
			{
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println(res.getString(4));
				System.out.println(res.getString(5));
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}