<%-- 
    Document   : ?????
    Created on : 2018/01/25, 14:13:27
    Author     : guest1Day
--%>

<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
         <%
         String[] data={"10","100","soeda","hayashi","-20","118","END"};
         //?soeda???33???????
            data[2]="33";
            
            //1???10????
            out.print(data[0]);
            //2???100????;
            out.print(data[1]);
            //3???soeda????
            out.print(data[2]);
            //4???hayashi????
            out.print(data[3]);
            //5???-20????
            out.print(data[4]);
            //6???118????
            out.print(data[5]);
            //7???END????
            out.print(data[6]);
            
        %>
        
        
    </body>
</html>
