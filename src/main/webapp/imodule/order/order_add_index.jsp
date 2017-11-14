<%-- 
    Document   : order_add_index
    Created on : 2017-11-12, 9:42:36
    Author     : luotao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            // $("#add_order_panel").css("height", screen.height*0.8);//自适应高度
        </script>
    </head>
    <body>
        <div class="col-sm-12">
            <div class="panel panel-default">
                <div class="panel-heading">购买的产品信息</div>

                <div class="panel-body" id="add_order_panel">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">产品编码</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="输入条形码">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">产品名称</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">产品参数</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="大小/尺码等">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">产品价格</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">优惠金额</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="panel-footer"><button type="button" class="btn btn-default" >保存</button></div>
            </div>
            <div class="panel panel-default">
                <div class="panel-heading">购买的产品信息</div>

                <div class="panel-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">产品编码</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="输入条形码">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">产品名称</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">产品参数</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="大小/尺码等">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">产品价格</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">优惠金额</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" id="email" placeholder="">
                            </div>
                        </div>

                    </form>
                </div>
                <div class="panel-footer"><button type="button" class="btn btn-default" >保存</button></div>
            </div>
        </div>
    </body>
</html>
