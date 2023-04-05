<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.dao.ReadDaoImp"%>
    <%@page import="com.pojo.LoginDetails" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% 
         String value=(String)session.getAttribute("msg");
         if(value!=null)
         {
    %>
    
    <h2 style="color: blue; text-align: center;"><% out.print(value);%></h2>
    
       <%} 
        session.removeAttribute("msg");
       %>
       
       <%
       ReadDaoImp r=new ReadDaoImp();
       LoginDetails l=r.getLoginDetails();
       %>
       
       <form action="ChangeCredentials" method="post">
       <input type="text" value="<%=l.getUserid() %>" name="userid"><br><br>
       <input type="text" value="<%=l.getPassword()%>" name="password"><br><br>
       <button>update</button>
       </form>
       
       <br><br><br>
       <a href="admin.jsp">HOME</a>
</body>
</html>