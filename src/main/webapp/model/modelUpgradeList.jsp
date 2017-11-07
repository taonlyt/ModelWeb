<%-- 
    Document   : modelUpgradeList
    Created on : 2017-9-7, 11:14:07
    Author     : 罗涛
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>升级单列表</title>
        <script src="model/js/upgrade.js"></script>
    </head>
    <body>
        <div class="container-fluid left-sm">
            <div class="container-fluid col-sm-12">
                <table id="upgradeList" class="table table-condensed">

                </table>
            </div>
        </div>
        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-primary" onclick="add()">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button id="btn_add" type="button" class="btn btn-primary">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button>

            <button id="btn_delete" type="button" class="btn btn-warning">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>

        <!-- Modal -->
        <div class="modal fade" id="addUpgradeModal" role="dialog">
            <div class="modal-dialog modal-lg">
                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h5 class="modal-title">创建升级单</h5>
                    </div>
                    <div class="modal-body">
                        <form role="form" class="form-horizontal">
                            <div class="form-group text-left">
                                <label class="control-label col-sm-2" for="l_reqCode">需求类型：</label>
                                <div class="col-sm-9">
                                    <select class="form-control">
                                        <option value="1">
                                            固定需求
                                        </option>
                                        <option value="2">
                                            临时需求
                                        </option>
                                        <option value="3">
                                            内部改进
                                        </option>
                                        <option value="4">
                                            其他
                                        </option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="reqCode">需求编号：</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="reqCode" placeholder="需求编号">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-2" for="reqName">需求名称：</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="reqCode" placeholder="需求名称">
                                </div>
                            </div>
                        </form>
                    </div>
                     <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h5 class="modal-title">升级明细</h5>
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
