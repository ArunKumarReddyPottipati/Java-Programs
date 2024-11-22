import java.sql.*;
import java.util.*;
public class jdbcPreparedStmt2
{
	public static void main(String[] args)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/XE";
		String username = "mydb";
		String password = "root";
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("Enter id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Last Name: ");
			String lastName = sc.nextLine();
			System.out.print("Enter First Name: ");
			String firstName = sc.nextLine();
			System.out.print("Enter Address: ");
			String address = sc.nextLine();
			System.out.print("Enter City: ");
			String city = sc.nextLine();
			String qry = "insert into persons values(?,?,?,?,?)";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,password);
			PreparedStatement pstmt = conn.prepareStatement(qry);
			pstmt.setInt(1,id);
			pstmt.setString(2,lastName);
			pstmt.setString(3,firstName);
			pstmt.setString(4,address);
			pstmt.setString(5,city);
			pstmt.executeUpdate();
			System.out.println("Details updated successfully");
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}