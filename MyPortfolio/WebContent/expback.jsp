<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
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
<sql:setDataSource
  var="con"
  driver="oracle.jdbc.driver.OracleDriver"
  url="jdbc:oracle:thin:@localhost:1521:xe"
  user="hr"
  password="hr"
  
  />
 <sql:update dataSource="${con}" var="row">insert into exp(year,title,subtitle,description) values (?,?,?,?)
 
 <sql:param value="${param.year}"></sql:param>
 <sql:param value="${param.title}"></sql:param>
 <sql:param value="${param.subtitle}"></sql:param>
 <sql:param value="${param.description}"></sql:param>
 </sql:update>
 
 <c:if test="${row==1}" >
 <c:set var="msg" value="Data inserted succesfully" scope="session"></c:set>
 <c:redirect url="addExp.jsp"></c:redirect>
 </c:if>
  <c:set var="msg" value="something went wrong" scope="session"></c:set>
 <c:redirect url="addExp.jsp"></c:redirect>
 
</body>
</html>