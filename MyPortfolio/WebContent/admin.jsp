<%
String s=(String)session.getAttribute("login");
if(s==null)
{
	response.sendRedirect("adminAuth.jsp");
}
%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:red;"><a href="readAllMessage.jsp">Read All Message</a></h2>
<h2 style="color:red;"><a href="addproject.jsp">Add Your Project</a></h2>
<h2 style="color:red;"><a href="projectSection.jsp">Project Section</a></h2>
<h2 style="color:red;"><a href="addEdu.jsp">Add Education</a></h2>
<h2 style="color:red;"><a href="readAllEducation.jsp">Read All Education Details</a></h2>
<h2 style="color:red;"><a href="addExp.jsp">Add Experience</a></h2>
<h2 style="color:red;"><a href="readAllExperience.jsp">Read All Experiences Details</a></h2>
<h2 style="color:red;"><a href="uploadResume.jsp">Upload Resume</a></h2>
<form action="Login" method="post">
<input type="hidden" name="check" value="Logout">
<button>Logout</button>
</form>
<br>
<a href="changeCredentials.jsp">CHANGE CREDENTIALS</a>
</body>
</html>