<%-- 
    Document   : order_query
    Created on : 2017-11-10, 11:45:35
    Author     : Luo Tao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>订单查询</title>
    </head>
    <body>
        <form role="form" class="form-inline text-center">
            <div class="form-group">
                <label for="lb_fieldName">查询条件：</label>
                <input type="text" class="form-control" placeholder="模型英文名" id="modelName">
            </div>
            <div class="form-group">
                <input type="text" class="form-control"  placeholder="模型中文名" id="modelNameZh">
            </div>
            <div class="form-group">
                <input type="text" class="form-control"  placeholder="字段英文名"  id="fieldName">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" placeholder="字段中文名" id="fieldNameZh">
            </div>
            <button type="button" class="btn btn-primary" onclick="queryModel()">查询</button>
            <button type="button" class="btn btn-primary" onclick="resetQuery()">重置</button>
        </form>
        <div id="queryList" class="container-fluid left-sm">

        </div>
    </body>
</html>
