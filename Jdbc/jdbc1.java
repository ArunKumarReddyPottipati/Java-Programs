import java.sql.*;
class jdbc1
{
    public static void main(String[] args)
    {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url="jdbc:oracle:thin:@localhost:1521/XE";
        String user_name = "mydb";
        String passsword = "root";
        int salary=0;
        try{
            Class.forName(driver);//Register the driver
            Connection conn = DriverManager.getConnection(url, user_name, passsword);//get the connection
            Statement stmt = conn.createStatement() ;  //Create the connection statement
            salary = stmt.executeUpdate("select max(salary) from employees");//Execute the statement
            conn.close();//close the connection
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Maximum salary = "+salary);
        }
    }
}