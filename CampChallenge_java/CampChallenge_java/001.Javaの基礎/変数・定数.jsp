<%-- 
    Document   : 変数・定数
    Created on : 2018/01/23, 11:23:59
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
        int num1=100;
        num1 +=100;
        num1 -=100;
        num1 *=10;
        num1 /=10;
        
        String jikoshokai="自己紹介します";
        jikoshokai +="GEEK JOBに通っている大濱拓人です！";
        
        String num2="ぱすも";
        num2=null;
        out.print(jikoshokai);
         %>
    </body>
</html>
