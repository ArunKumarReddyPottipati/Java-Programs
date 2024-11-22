<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration page</title>
<link rel="stylesheet" href="style.css"/>
</head>
<body>

	<form class="form" action="register" method="post">
        <h1 class="login-title">Registration</h1>
        <input type="text" class="login-input" name="username" placeholder="Enter roll no." required />
        <input type="text" class="login-input" name="email" placeholder="Enter Email">
        <input type="password" class="login-input" name="password" placeholder="Enter Password">
        <input type="submit" name="submit" value="Register" class="login-button">
        <p class="link">Already have an account? <a href="login.jsp">Login here</a></p>
    </form>

</body>
</html>