<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="messagebox/myerrorpage.jsp" isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:red; text-align:center;">PROJECT SECTION</h2>

<%@include file="messagebox/message.jsp" %>
  <sql:setDataSource
  var="con"
  driver="oracle.jdbc.driver.OracleDriver"
  url="jdbc:oracle:thin:@localhost:1521:xe"
  user="hr"
  password="hr"
  
  />
    
    <sql:query dataSource="${con}" var="rs">Select * from project</sql:query>
    <c:forEach var="data" items="${rs.rows}">
    <img style="height:100px" alt="" src="images/myproject/${data.filename}"><br>
    SN:${data.sn}<br>
    filename:${data.filename}<br>
    <form action="Project" method="post">
    <input type="hidden" name="check" value="deleteProject">
    <input type="hidden" name="sn" value="${data.sn}">
    <input type="hidden" name="filename" value="${data.filename}">
    <button>Delete</button>
    
    </form>
    </c:forEach>
		
</body>
</html>