<%-- 
    Document   : modelUpgradeDetail
    Created on : 2017-9-12, 15:13:19
    Author     : 罗涛
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form class="form-horizontal" role="form">
            <div class="form-group">
                <label class="control-label col-sm-2" for="email">升级模型名：</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="email" placeholder="">
                </div>
            </div>
            <div class="form-group"> 
                <label class="control-label col-sm-2" for="email">操作类型：</label>
                <div class="checkbox">
                    <label><input type="checkbox">新建模型</label>
                </div>
                <label class="control-label col-sm-2" for="email">&nbsp;</label>
                <div class="checkbox">
                    <label><input type="checkbox"> 新增字段</label>
                </div>
                <label class="control-label col-sm-2" for="email">&nbsp;</label>
                <div class="checkbox">
                    <label><input type="checkbox"> 修改字段</label>
                </div>
            </div>
        </form>
    </body>
</html>
