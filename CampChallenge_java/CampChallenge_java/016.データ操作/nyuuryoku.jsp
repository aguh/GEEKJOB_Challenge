<%-- 
    Document   : nyuuryoku
    Created on : 2018/03/05, 17:50:30
    Author     : guest1Day
--%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="./out.jsp" method="get">
            <div>*半角数字のみ記入してください。</div>
            <div>* 3000円以上で、4% 5000円以上で、5%pポイントがつきます。</div>
            <div>総額入力<br> <input type="number" name="total"></div>
            <div>個数<br><input type="number" name="count"></div>
            <div>商品種別入力<br> 1：雑貨、2：生鮮食品、3:その他<br>
                <input type="number" name="type"  min="1" max="3"></div>
             <input type="submit" name="btnSubmit">
        </form>
        <div></div>
    </body>
</html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> </h1>
    </body>
</html>
