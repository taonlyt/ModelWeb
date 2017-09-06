<%-- 
    Document   : modelIndex
    Created on : 2017-9-1, 14:48:11
    Author     : luotao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="model/js/tablelist.js"></script>
        <script>
            function showComment(comment_value) {

            }
        </script>
    </head>
    <body>
        <p></p>
        <ul class="nav nav-tabs">
            <li><a data-toggle="tab" href="#home">模型基本信息</a></li>
            <li class="active"><a data-toggle="tab" href="#menu1">模型字段信息</a></li>
        </ul>
        <div class="container-fluid left-sm">
            <div class="container-fluid col-sm-10">
                <table id="tablelist" class="table">
                    
                </table>
            </div>
            <div class="container-fluid col-sm-2">
                <div class="panel panel-default">
                    <div class="panel-heading">字段注释</div>
                    <div id="fieldComment" class="panel-body"></div>
                </div>
            </div>
        </div>
        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>&nbsp;查看建表语句
            </button>
            <!--            <button id="btn_add" type="button" class="btn btn-primary">
                            <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>查看建表语句
                        </button>-->
            <!--
            <button id="btn_delete" type="button" class="btn btn-warning">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>-->
        </div>
        <!-- Modal -->
        <div id="tableInfo" class="modal fade" role="dialog">
            <div class="modal-dialog  modal-lg">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">模型基本信息</h4>
                    </div>
                    <div class="modal-body">

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-info" data-dismiss="modal">关闭</button>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
