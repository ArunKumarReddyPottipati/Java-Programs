import java.sql.*;
public class jdbc_Retrivedata
{
	public static void main(String[] args)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String userName = "mydb";
		String password = "root";
		try
		{
			String qry = "select * from persons";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,userName,password);
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(qry);
			while(res.next())
			{
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5));
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
			