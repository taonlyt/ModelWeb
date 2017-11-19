/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {

    //1.初始化Table
    var oTable = new TableInit();
    oTable.Init();

    //2.初始化Button的点击事件
    var oButtonInit = new ButtonInit();
    oButtonInit.Init();

});
var TableInit = function () {
    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function () {
        $('#tablelist').bootstrapTable({
            url: 'queryOrder.do', //请求后台的URL（*）
            dataType: "json",
            method: 'POST', //请求方式（*）
            contentType: "application/x-www-form-urlencoded",
            toolbar: '#toolbar', //工具按钮用哪个容器
            striped: true, //是否显示行间隔色
            cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true, //是否显示分页（*）
            sortable: false, //是否启用排序
            sortOrder: "asc", //排序方式
            queryParams: oTableInit.queryParams, //传递参数（*）
            sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
            pageNumber: 1, //初始化加载第一页，默认第一页
            pageSize: 10, //每页的记录行数（*）
            pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
            search: false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true, //是否显示所有的列
            showRefresh: true, //是否显示刷新按钮
            minimumCountColumns: 1, //最少允许的列数
            clickToSelect: false, //是否启用点击选中行
            height: 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "orderId", //每一行的唯一标识，一般为主键列
            showToggle: true, //是否显示详细视图和列表视图的切换按钮
            cardView: false, //是否显示详细视图
            detailView: false, //是否显示父子表
            paginationVAlign:"bottom",
            columns: [{
                    checkbox: true
                }, {
                    field: 'orderId',
                    title: '订单编号',
                    formatter: function (value, row, index) {
                        var e = '<a href="#">' + row.orderId + '</a> ';
                        return e;
                    }
                }, {
                    field: 'cellPhoneNbr',
                    title: '手机号码'
                }, {
                    field: 'custName',
                    title: '客户姓名'
                }, {
                    field: 'originalMoney',
                    title: '原始金额（元）'
                }, {
                    field: 'discountMoney',
                    title: '优惠金额（元）'
                }, {
                    field: 'payedMoney',
                    title: '实收金额（总计）'
                }, {
                    field: 'createDate',
                    title: '购买日期'
                }],
            onClickRow: function (row) {
               
            },
            onDblClickRow: function (row) {
                //$("#tableInfo").modal();
            }
        });
    };
    //得到查询的参数
    oTableInit.queryParams = function (params) {
        var temp = {//这里的键的名字和控制器的变量名必须一致，这边改动，控制器也需要改成一样的
            limit: params.limit, //页面大小
            offset: params.offset, //页码
            cellPhoneNbr: $("#cellPhoneNbr").val(),
            orderId: $("#orderId").val(),
        };
        return temp;
    };
    return oTableInit;
};

var ButtonInit = function () {
    var oInit = new Object();
    var postdata = {};

    oInit.Init = function () {
        //初始化页面上面的按钮事件
    };

    return oInit;
};

