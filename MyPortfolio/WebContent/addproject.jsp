<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align:center; color:red; background-color:blue">ADD PROJECT SECTION</h1>

<%@include file="messagebox/message.jsp" %>
*file size should be less than 1 mb<br>
*file should be in jpg/jpeg format


<form action="Project" method="post" enctype="multipart/form-data">
<input type="file" name="project"><br><br>
<button>Add</button>

</form>
</body>
</html>