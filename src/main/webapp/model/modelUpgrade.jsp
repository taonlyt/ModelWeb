<%-- 
    Document   : modelUpgrade.jsp
    Created on : 2017-9-7, 10:25:26
    Author     : 罗涛
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>模型升级</title>
        <script>
            function queryUpgradeList() {
                $("#queryList").load("model/modelUpgradeList.jsp");
            }
            function resetQuery() {
                $("#reqCode").val('');
                $("#reqName").val('');
            }
        </script>
    </head>
    <body>
        <form role="form" class="form-inline text-center">
            <div class="form-group">
                <label for="l_reqCode">查询升级单：</label>
                <input type="text" class="form-control" placeholder="需求编号" id="reqCode">
            </div>
            <div class="form-group">
                <input type="text" class="form-control" placeholder="需求名称" id="reqName">
            </div>
            <button type="button" class="btn btn-primary" onclick="queryUpgradeList()">查询</button>
            <button type="button" class="btn btn-primary" onclick="resetQuery()">重置</button>
        </form>
        <div id="queryList" class="container-fluid">

        </div>
    </body>
</html>
