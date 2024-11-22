<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
<style type="text/css">
div
{
background-color:lime;
align-self:center;
height:300px;
width:300px;
color:white;
font-size: 25px;
}
</style>
</head>
<body>
	<div>
		<%
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String rno=request.getParameter("rno");
		out.println("Name = "+name+"<br>");
		out.println("Roll Number: "+rno+"<br>");
		out.println("Age = "+age);
		%>
	</div>
</body>
</html>