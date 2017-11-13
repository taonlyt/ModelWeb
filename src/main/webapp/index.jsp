<%-- 
    Document   : index
    Created on : 2017-9-1, 14:48:11
    Author     : luotao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
    <head>
        <title>萌萌哒</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--jquery-->
        <script src="jquery/jquery-3.2.0.min.js"></script>
        <!--bootstrap-->
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <!--bootstap table-->
        <link rel="stylesheet" href="bootstrap/css/bootstrap-table.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap-datetimepicker.min.css">
        <script src="bootstrap/js/bootstrap-table.min.js"></script>
        <script src="bootstrap/js/bootstrap-table-zh-CN.min.js"></script>
        <script src="bootstrap/js/bootstrap-datetimepicker.min.js"></script>
        <script src="bootstrap/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
        <style>
            /* Remove the navbar's default margin-bottom and rounded borders */ 
            .navbar {
                margin-bottom: 0;
                border-radius: 0;
            }
            .left-zero{
                padding-left: 0;
            }
            .contentRight{
                top: 30px;
            }
            .right-zero{
                padding-right: 0;
            }
            .left-sm{
                padding-left: 1px;
            }
            .right-sm{
                padding-right: 1px;
            }
            /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
            .row.content {height: 100%;}

            /* Set gray background color and 100% height */
            .sidenav {
                padding: 4px;
                background-color: #f1f1f1;
                height: 100%;
                overflow-y:auto;
            }
            /* Set black background color, white text and some padding */

            /* On small screens, set height to 'auto' for sidenav and grid */
            @media screen and (max-width: 767px) {
                .sidenav {
                    height: auto;
                    padding: 15px;
                }
                .row.content {height:auto;} 
            }
        </style>

    </head>
    <body>
        <!--页面头部-->
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="#"><font style=" font-weight: 900; color: #0078ae">萌萌哒童装店</font></a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="javascript:loadPage('order/order_index.jsp')">订单查询</a></li>
                        <li><a href="javascript:loadPage('order/order_add_index.jsp')">创建订单</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!--页面主体-->
        <div class="container-fluid text-center">   
            <div class="row content">
                <!--左侧菜单-->
                <!--中间内容-->
                <div class="col-sm-12 text-left left-zero" id="contentBody"> 

                </div>
                <!--右侧广告位-->
<!--                <div class="col-sm-2 text-left left-zero contentRight" id="contentRight"> 
                </div>-->
                <!--页面底部-->
                <div class="container-fluid" id="footer">
                    <p>

                    </p>
                </div>
            </div>
        </div>
        <script>
            $("#contentBody").css("height", screen.height);//自适应高度
            $("#contentBody").load("order/order_index.jsp");
            function loadPage(pageUrl){
                $("#contentBody").load(pageUrl);
            }
        </script>
    </body>
</html>

