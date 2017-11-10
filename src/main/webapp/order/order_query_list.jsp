<%-- 
    Document   : order_query_list
    Created on : 2017-11-11, 1:39:08
    Author     : luotao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>订单列表</title>
        <script src="order/js/order-query.js"></script>
        <script>
            $(document).ready(function () {
                $('[data-toggle="popover"]').popover();
            });
        </script>
    </head>
    <body>
        <div class="container-fluid left-sm">
            <div class="container-fluid col-sm-12">
                <table id="tablelist" class="table table-condensed">

                </table>
            </div>
        </div>
        <div id="toolbar" class="btn-group">
            <button id="btn_add_order" type="button" class="btn btn-primary">
                <span class="glyphicon" aria-hidden="true">创建订单</span>
            </button>
            <button id="btn_modify_order" type="button" class="btn btn-primary">
                <span class="glyphicon" aria-hidden="true">修改订单</span>
            </button>
        </div>
    </body>
</html>
