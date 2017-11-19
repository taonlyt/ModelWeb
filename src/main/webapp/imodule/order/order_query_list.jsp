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
        <script src="imodule/order/js/order-query.js"></script>
        <script>
            $(document).ready(function () {
                $("#btn_add_order").click(function () {
                    $("#OrderModal").modal();
                });
            });
            $(document).ready(function () {
                $('[data-toggle="popover"]').popover();
            });
        </script>
    </head>
    <body>
        <div class="container-fluid left-sm">
            <div class="container-fluid col-sm-12">
                <table id="tablelist" class="table table-condensed"></table>
            </div>
        </div>
        <div id="toolbar" class="btn-group">
            <button id="btn_add_order" type="button" class="btn btn-primary">
                <span class="glyphicon" aria-hidden="true">创建订单</span>
            </button>
            <button id="btn_modify_order" type="button" class="btn btn-primary">
                <span class="glyphicon" aria-hidden="true">修改订单</span>
            </button>
            <!--            <div class="input-group">
                            <input type="text" class="form-control">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    查询
                                </button>
                            </span>
                        </div> /input-group -->
        </div>
        <!-- Modal -->
        <div id="OrderModal" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">订单信息</h4>
                    </div>
                    <div class="modal-body" id="addOrderModal">

                        <div class="col-sm-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title">订单信息</h3>
                                </div>
                                <div class="panel-body">
                                    <div class="form-group col-sm-8">
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码">
                                        </div>
                                    </div>
                                </div>
                                <table class="table">
                                    <th>产品编号</th><th>产品名称</th><th>尺码</th><th>数量</th><th>原单价</th><th>出售单价</th>
                                    <tr>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="产品编号"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                    </tr>
                                    <tr>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder产品编号"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                    </tr>
                                                                        <tr>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder产品编号"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                        <td><input type="text" class="form-control " id="cellPhoneNbr" placeholder="输入客户手机号码"></td>
                                    </tr>
                                </table>
                                <div class="panel-footer">
                                    <div class="btn-group">
                                        <button class="btn btn-default">新增</button>
                                        <button class="btn btn-default">删除</button>
                                        <button class="btn btn-default">保存</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">保存</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
