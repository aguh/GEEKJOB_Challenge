<%-- 
    Document   : for文1
    Created on : 2018/01/29, 15:20:21
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
    
int answer=1;
for(int i=0;i<=20; i++){
      answer=answer*8;
      out.print(answer);
// 回数を把握するための変数：i=0（初期値は0）
// 繰り返す条件：i<60（iが60未満の場合繰り返す）
// １回毎の増減：i++（１回毎にiに+1する）

          
}
 %>
    </body>
</html>
