<!DOCTYPE html>
<%@page import="com.dao.ReadDaoImp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pojo.Message" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center; color:red; background-color:blue">MESSAGE SECTION</h1>
    <% 
         String value=(String)session.getAttribute("msg");
         if(value!=null)
         {
    %>
    
    <h2 style="color: blue; text-align: center;"><% out.print(value);   %></h2>
    
       <%} 
        session.removeAttribute("msg");
       %>
   
   
<%
ReadDaoImp r=new ReadDaoImp();
ArrayList<Message> al=r.readAllMessage();
for(Message m:al)
{
%>
SN:<%=m.getSn() %><br>
NAME:<%=m.getName() %><br>
EMAIL:<%=m.getEmail() %><br>
MESSAGE:<%=m.getMessage() %><br>
               <form action="DeleteMessage" method="post">
                <input type="hidden" value="<%=m.getSn()%>" name="sn" >
                <button>Delete</button>
                </form><br><br>
<%} %>
</body>
</html>