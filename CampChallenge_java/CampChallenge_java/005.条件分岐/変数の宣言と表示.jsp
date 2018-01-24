<%-- 
    Document   : 変数の宣言と表示
    Created on : 2018/01/24, 14:01:50
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
        int num=2;
        
        //else if文を追加しました。
        //if文の条件を満たさなかった場合に,else if文が実行されます。
        //これにより,「変数の中身は50です!」と表示されます。
        if(num==1){
            out.print("1です!");
        }else if(num==2){ 
             out.print("プログラミングキャンプ!");
        }else{
            out.print("その他です!");
        }     
        %>
        
        
        
    </body>
</html>
