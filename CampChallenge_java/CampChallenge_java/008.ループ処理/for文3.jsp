<%-- 
    Document   : for文3
    Created on : 2018/01/29, 18:55:41
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
          //1から10の合計を表示する処理
            int total=0;
            for(int i=0;i<=100;i++){
                total=total+i;
            }
            out.print(total);
             
            //回数を把握するための変数:i=1(初期値は1)
            //繰り返す条件:i<=100(iが100以下の場合繰り返す)
            //1回毎の増減:i++(1回毎にiに+1する)
            


            
        
        
        %>
    </body>
</html>
