<%-- 
    Document   : while文課題
    Created on : 2018/01/30, 13:12:23
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
<%
int num=1000;
while(num<=1000){
      num/=2;
  if(num<=100){
    out.print(num);  
    break;
    
  }
}
%>            
            
            
        
        
        
    </body>
</html>
