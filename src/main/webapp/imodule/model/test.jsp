<%-- 
    Document   : test
    Created on : 2017-9-30, 16:59:05
    Author     : csandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            $.fn.myPlugin = function () {
                this.css('color', 'red');
            }
            $(function () {
                $('#myul').myPlugin();
            })
            //$("mydiv").test();
        </script>
    </head>
    <body>
        <p>Hello World!</p>
        <p>Hello World!</p>
        <p>Hello World!</p>
        <p>Hello World!</p>
        <ul id="myul">
            <li>
                <a href="http://www.webo.com/liuwayong">我的微博</a>
            </li>
            <li>
                <a href="http://http://www.cnblogs.com/Wayou/">我的博客</a>
            </li>
            <li>
                <a href="http://wayouliu.duapp.com/">我的小站</a>
            </li>
        </ul>
    </body>
</html>
