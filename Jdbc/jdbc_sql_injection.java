import java.sql.*;
import java.util.*;
public class jdbc_sql_injection
{
	public static void main(String[] args)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String userName = "mydb";
		String password = "root";
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("Enter your id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter your name: ");
			String name = sc.nextLine();
			String qry = "select username,password from bank where id="+id+" and name='"+name+"'";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(qry);
			if(res.next())
			{
				System.out.println("Your username is :"+res.getString(1));
				System.out.println("Your Password is :"+res.getString(2));
			}
			else
				System.out.println("Invalid Credentials");
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}