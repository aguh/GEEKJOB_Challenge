<%-- 
    Document   : switch文１
    Created on : 2018/01/24, 18:55:17
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
        int  type=2;
          //1ならone,2ならtwo,それ以外は想定外
          switch(type){
              case 1:
                  out.print("one");
                  break;
              case 2:
                  out.print("two");
                  break;
              default:
                  out.print("想定外");
                  break;
          }
          
        
         %>       
    </body>
</html>
