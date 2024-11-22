import java.sql.*;
public class Jdbc_Connection
{
	public static void main(String[] args)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String uname = "mydb";
		String pwd = "root";
		try
		{
			String qry = "insert into persons values(3,'Namikaze','Minato','Hidden Leaf','Fire Nation')";
			Class.forName(driver);//Register the driver
			Connection conn = DriverManager.getConnection(url,uname,pwd);//Get the connection
			Statement stmt = conn.createStatement();//Create the Statement
			stmt.executeUpdate(qry);//Execute the query
			conn.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}