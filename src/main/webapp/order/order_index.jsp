<%-- 
    Document   : order_index
    Created on : 2017-11-10, 11:24:06
    Author     : Luo Tao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>订单首页</title>
        <script type="text/javascript">
            $("#query_list").load("order/order_query_list.jsp");
            
            function queryOrder() {
                $("#query_list").load("order/order_query_list.jsp");
            }
            function resetQuery() {
                $("#cellPhoneNbr").val('');
                $("#orderId").val('');
            }
            $('.form_datetime').datetimepicker({
                language: 'zh-CN',
                format: "yyyy-mm-dd",
                initialDate: new Date(),
                weekStart: 1,
                todayBtn: 1,
                autoclose: true,
                todayHighlight: 1,
                maxView: "month",
                startView: 2,
                forceParse: 0,
                showMeridian: 1
            });
        </script> 
    </head>
    <body>
        <div id="query_condition" class="container-fluid text-center">
            <form role="form" class="form-inline text-center">
                <div class="form-group">
                    <label for="lb_fieldName">查询条件：</label>
                    <input type="text" class="form-control" placeholder="手机号码" id="cellPhoneNbr">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control"  placeholder="订单编号" id="orderId">
                </div>
                <div class="form-group">
                    <input type="text" value="" readonly class="form_datetime" data-date-format="yyyy-mm-dd">
                </div>
                <button type="button" class="btn btn-primary" onclick="queryOrder()">查询</button>
                <button type="button" class="btn btn-primary" onclick="resetQuery()">重置</button>
            </form>
        </div>
        <div id="query_list" class="container-fluid text-center">

        </div>
    </body>
</html>
