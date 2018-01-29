<%-- 
    Document   : ???????
    Created on : 2018/01/29, 13:34:18
    Author     : guest1Day
--%>

<%@ page import="java.util.HashMap" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>       
<%
// ???????
 HashMap<String, String> prof =
            new HashMap<String, String>();
// ?????
prof.put("name", "1");
// ????? -- 1?AAA?
prof.put("name", "AAA");
// ????? -- Name:????
out.print("Name:" + prof.get("name"));
//????
prof.put("suuji","hello");
//?????--hello?world?
prof.put("suuji","world");
//?????--suuji:world
out.print("suuji:"+prof.get("suuji"));
prof.put("nnn","soeda");
prof.put("nnn", "33");
out.print("nnn:"+prof.get("nnn"));
prof.put("nnnn","20");
prof.put("nnnn", "20");
out.print("nnnn:"+prof.get("nnnn"));


%>
        
        
        
        
        
        
            
    </body>
</html>
