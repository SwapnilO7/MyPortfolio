<!DOCTYPE html>
<%@page import="com.dao.ReadDaoImp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pojo.Experience" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center; color:red; background-color:pink">EXPERIENCE SECTION</h1>
  <%@include file="messagebox/message.jsp" %>
   
<%
ReadDaoImp r=new ReadDaoImp();
ArrayList<Experience> al=r.readAllExperience();
for(Experience m:al)
{
%>
SN:<%=m.getSn() %><br>
YEAR:<%=m.getYear() %><br>
TITLE:<%=m.getTitle() %><br>
SUBTITLE:<%=m.getSubtitle() %><br>
DESCRIPTION:<%=m.getDescription() %><br>

               <form action="DeleteExperience" method="post">
                <input type="hidden" value="<%=m.getSn()%>" name="sn" >
                <button>Delete</button>
                </form><br><br>
<%} %>
</body>
</html>