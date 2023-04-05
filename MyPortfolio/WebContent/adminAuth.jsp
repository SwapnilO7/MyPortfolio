<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    
    <h2 style="color: blue; text-align: center;"><% out.print(value);   %></h2>
    
       <%} 
        session.removeAttribute("msg");
       %>
       <h3>Login here</h3>
       <form action="Login" method="post">
       <table style="width: 20%">
        <tr>
                 <td>UserName</td>
                                    <td><input type="text" name="userid" placeholder="Enter UserID"></td>
                         </tr>
                         <tr>
                                    <td>Password</td>
       <td><input type="text" name="password" placeholder="Enter Password"></td>
                           </tr>
                 </table>
       <button>Login</button>
       </form>
</body>
</html>



                 
                                  