<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

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

response.getWriter().println("Details uploaded successfully");

%>

</body>
</html>