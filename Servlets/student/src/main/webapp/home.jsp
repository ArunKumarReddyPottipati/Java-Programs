<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
   
 
<!DOCTYPE html>
<html>
<head>
<title>home page</title>
<meta charset="utf-8"/>
    <title>home1</title>
    <link rel="stylesheet" href="style1.css"/>
	<style>
	
</style>
</head>
<%
	
	if(session.getAttribute("username")== "")
	{
		response.sendRedirect("login.jsp");
	}

%>

<body style="background:none">
<div class="br">
<img align="left" src="nbkrist.jpeg" height="180" width="180">
<center><h1 style="color:darkblue">N.B.K.R</h1>
<h3 style="color:blue">INSTITUTE OF SCIENCE & TECHNOLOGY</h3>
<h3 style="color:red">(AUTONOMOUS)</h3>
<h3 style="color:black">Affiliated to JNTUA,Ananthapur</h3></center>
</div> 
<div id="wrap">
      <ul class="navbar">
        <li>
          <a class="active" href="home1.php">Home</a>
        </li>
        <li>
          <a href="#">Login</a>
          <ul>
            <li>
              <a href="slogin1.php">Student</a>
            </li>
            <li>
              <a href="flogin1.php">Faculty</a>
            </li>
          </ul>
        </li>
        <li>
          <a href="#">About us</a>
		  <ul>
		    <li>
			  <a href="institute.php">About Institute</a></li>
			<li><a href="couns.php">counselling Management System</a></li>
			<li><a href="v&m.php">Vision and mission</a></li>
			
		  </ul>
        </li>
      </ul>
    </div>
   <center>	<h1 style="color:brown">COUNSELLING MANAGEMENT SYSTEM</h1></center>
   <p class="h" ><u>About:</u></p>
   <p>
     Counseling is a form of education, which the students receive from their counselors. The essence of incorporating guidance and counseling into the school system was to eliminate overwhelming ignorance of many young people on their choices of career prospects and personality maladjustment among school children.
   </p>
   <p> The Student Counseling System is developing to improve the counseling, which fully works as online software. </p>
   <p style="font-size:20"> <u>Advantages of online based counselling management system:</u></p>
   <p><li>It is totally online based system,so that the students can easily enter their details from enywhere.</li> </p>
   <p><li>Since it is a online based system the faculty can update the student details at anytime from any place.</li></p>
   <p><li>The details of students like marks ,student details,achievements are present in the website , so that the parents can monitor their son/daughter’s performance from home.</li><p>
   </body>
</html>


