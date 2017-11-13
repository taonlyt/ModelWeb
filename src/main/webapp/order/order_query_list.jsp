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
                    $("#btn_add_order").click(function () {
                        $("#addOrderModal").css("max-height", screen.height * 0.7);
                        $("#addOrderModal").css("width", screen.width * 0.5);
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

                            <form class="form-horizontal" role="form">
                                <div class="form-group">
                                    <label class="control-label col-sm-2" for="email">产品编码</label>
                                    <div class="col-sm-6">
                                        <input type="email" class="form-control" id="email" placeholder="输入条形码"></div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-2" for="email">产品名称</label>
                                        <div class="col-sm-6">
                                            <input type="email" class="form-control" id="email" placeholder=""></div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-sm-2" for="email">产品参数</label>
                                            <div class="col-sm-6">
                                                <input type="email" class="form-control" id="email" placeholder="大小/尺码等"></div>
                                            </div>
                                            <div class="form-group">
                                                <label class="control-label col-sm-2" for="email">产品价格</label>
                                                <div class="col-sm-6">
                                                    <input type="email" class="form-control" id="email" placeholder=""></div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-sm-2" for="email">优惠金额</label>
                                                    <div class="col-sm-6">
                                                        <input type="email" class="form-control" id="email" placeholder=""></div>
                                                    </div>
                                                </form>
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
