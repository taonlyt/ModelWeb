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
        <title>订单录入</title>
        <style>
            .bottom-bordered{
                border-top: 0;
                border-left: 0;
                border-right: 0;
                border-bottom: 1px #080808 solid;
                border-radius: 0 0 0 0;
            }
            .font-lg{
                font-size: 18px;
                color: green
            }
        </style>
    </head>
    <body>
        <div class="col-sm-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">订单信息</h3>
                </div>
                <div id="" class="panel-body">
                    <div id="m_order_detail">
                        <table class="table table-hover table-bordered table-condensed">
                            <th width="2%">#</th>
                            <th width="13%">产品编号</th>
                            <th width="35%">产品名称</th>
                            <th width="20%">尺码/大小</th>
                            <th width="10%">原单价（元）</th>
                            <th width="10%">出售单价（元）</th>
                            <th width="10%">数量</th>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId1"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName1"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size1"></td>
                                <td><input type="text" class="form-control"  placeholder="原价格" v-model="oPrice1"></td>
                                <td><input type="text" class="form-control"  placeholder="出售价格" v-model="sPrice1"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('1')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count1">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('1')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId2"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName2"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size2"></td>
                                <td><input type="text" class="form-control" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" placeholder="出售价格" v-model="sPrice2"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('2')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count2">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('2')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId3"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName3"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size3"></td>
                                <td><input type="text" class="form-control" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" placeholder="出售价格" v-model="sPrice3"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('3')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count3">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('3')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId4"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName4"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size4"></td>
                                <td><input type="text" class="form-control" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" placeholder="出售价格" v-model="sPrice4"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('4')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count4">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('4')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId5"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName5"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size5"></td>
                                <td><input type="text" class="form-control" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" placeholder="出售价格" v-model="sPrice5"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('5')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count5">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('5')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId6"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName6"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size6"></td>
                                <td><input type="text" class="form-control" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" placeholder="出售价格" v-model="sPrice6"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('6')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count6">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('6')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId7"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName7"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size7"></td>
                                <td><input type="text" class="form-control" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" placeholder="出售价格" v-model="sPrice7"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('7')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count7">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('7')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId8"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName8"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size8"></td>
                                <td><input type="text" class="form-control" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" placeholder="出售价格" v-model="sPrice8"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('8')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count8">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('8')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId9"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName9"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size9"></td>
                                <td><input type="text" class="form-control" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" placeholder="出售价格" v-model="sPrice9"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('9')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count9">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('9')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" class="checkbox"/>
                                </td>
                                <td><input type="text" class="form-control"  placeholder="条形码" v-model="productId10"></td>
                                <td><input type="text" class="form-control"  placeholder="服装名称" v-model="productName10"></td>
                                <td><input type="text" class="form-control"  placeholder="尺码/大小" v-model="size10"></td>
                                <td><input type="text" class="form-control"  placeholder="原价格"></td>
                                <td><input type="text" class="form-control"  placeholder="出售价格" v-model="sPrice10"></td>
                                <td>
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                            <button v-on:click="countDown('10')" class="btn btn-default" type="button">-</button>
                                        </span>
                                        <input type="text" class="form-control" placeholder="1" v-model="count10">
                                        <span class="input-group-btn">
                                            <button v-on:click="countUp('10')" class="btn btn-default" type="button">+</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </td>
                            </tr>
                        </table>
                    </div>
                    <div id="m_order">
                        <form class="form-inline" role="form">
                            <div class="form-group col-sm-2">
                                <label class="" style="color:red" for="inputfile"><h4>总计：{{oMoney}} 元</h4></label>
                            </div>
                            <div class="form-group col-sm-4">
                                <label class="" style="color: #31b0d5"   for="inputfile"><h4>实收：</h4></label>
                                <input type="text" class="form-control font-lg" v-model="sMoney">
                                <label class="" style="color: #31b0d5"  for="inputfile"><h4>元</h4></label>
                            </div>
                            <div class="form-group col-sm-2">
                                <label class="" style="color: #843534" for="inputfile"><h4>找零：{{charge}}元</h4></label>
                            </div>
                            <div class="form-group col-sm-4">
                                <input type="text" class="form-control font-lg" placeholder="客户手机号码" v-model="input_phone">
                            </div>
                        </form>
                    </div>
                </div>
                <div id="save_btn" class="panel-footer">
                    <div class="col-md-offset-6">
                        <button class="btn btn-info" @click="saveOrder()">保存</button>
                    </div>
                </div>
            </div>
        </div>
        <script>

            var order_detail = new Vue({
                el: "#m_order_detail",
                data: {
                    productId1: '', productName1: '', size1: '', oPrice1: '', sPrice1: '', count1: '1',
                    productId2: '', productName2: '', size2: '', oPrice2: '', sPrice2: '', count2: '1',
                    productId3: '', productName3: '', size3: '', oPrice3: '', sPrice3: '', count3: '1',
                    productId4: '', productName4: '', size4: '', oPrice4: '', sPrice4: '', count4: '1',
                    productId5: '', productName5: '', size5: '', oPrice5: '', sPrice5: '', count5: '1',
                    productId6: '', productName6: '', size6: '', oPrice6: '', sPrice6: '', count6: '1',
                    productId7: '', productName7: '', size7: '', oPrice7: '', sPrice7: '', count7: '1',
                    productId8: '', productName8: '', size8: '', oPrice8: '', sPrice8: '', count8: '1',
                    productId9: '', productName9: '', size9: '', oPrice9: '', sPrice9: '', count9: '1',
                    productId10: '', productName10: '', size10: '', oPrice10: '', sPrice10: '', count10: '1'
                },
                methods: {
                    saveOrder() {

                    },
                    countUp: function (seq) {
                        var seq = seq * 1;
                        switch (seq) {
                            case 1:
                                this.count1++;
                                break;
                            case 2:
                                this.count2++;
                                break;
                            case 3:
                                this.count3++;
                                break;
                            case 4:
                                this.count4++;
                                break;
                            case 5:
                                this.count5++;
                                break;
                            case 6:
                                this.count6++;
                                break;
                            case 7:
                                this.count7++;
                                break;
                            case 8:
                                this.count8++;
                                break;
                            case 9:
                                this.count9++;
                                break;
                            case 10:
                                this.count10++;
                                break;
                        }
                    },
                    countDown: function (seq) {
                        var seq = seq * 1;
                        switch (seq) {
                            case 1:
                                this.count1 > 1 ? this.count1-- : this.count1 = 1;
                                break;
                            case 2:
                                this.count2 > 1 ? this.count2-- : this.count2 = 1;
                                break;
                            case 3:
                                this.count3 > 1 ? this.count3-- : this.count3 = 1;
                                break;
                            case 4:
                                this.count4 > 1 ? this.count4-- : this.count4 = 1;
                                break;
                            case 5:
                                this.count5 > 1 ? this.count5-- : this.count5 = 1;
                                break;
                            case 6:
                                this.count6 > 1 ? this.count6-- : this.count6 = 1;
                                break;
                            case 7:
                                this.count7 > 1 ? this.count7-- : this.count7 = 1;
                                break;
                            case 8:
                                this.count8 > 1 ? this.count8-- : this.count8 = 1;
                                break;
                            case 9:
                                this.count9 > 1 ? this.count9-- : this.count9 = 1;
                                break;
                            case 10:
                                this.count10 > 1 ? this.count10-- : this.count10 = 1;
                                break;
                        }
                    }
                }
            });
            var charge = new Vue({
                el: '#m_order',
                data: {
                    oMoney: '0.00',
                    sMoney: '',
                    input_phone: ""
                },
                computed: {
                    // 计算属性的 getter
                    charge: function () {
                        // `this` 指向 vm 实例
                        this.oMoney = order_detail.sPrice1 * 1 * order_detail.count1 + order_detail.sPrice2 * 1 * order_detail.count2 + order_detail.sPrice3 * 1 * order_detail.count3 + order_detail.sPrice4 * 1 * order_detail.count4 + order_detail.sPrice5 * 1 * order_detail.count5
                                + order_detail.sPrice6 * 1 * order_detail.count6 + order_detail.sPrice7 * 1 * order_detail.count7 + order_detail.sPrice8 * 1 * order_detail.count8 + order_detail.sPrice9 * 1 * order_detail.count9 + order_detail.sPrice10 * 1 * order_detail.count10;
                        return this.sMoney - this.oMoney;
                    }
                }
            });
            var saveBtn = new Vue({
                el: "#save_btn",
                data: {

                },
                methods: {
                    saveOrder() {
                        $.ajax({
                            type: "post",
                            url: "aaaaa.do",
                            dataType: "json",
                            contentType: "application/x-www-form-urlencoded",
                            data: {
                                custPhone: charge.input_phone,
                                orderDetails: [
                                    {productId: orderDetail.productId1, productName: orderDetail.productName1, size: orderDetail.size1, oPrice: orderDetail.oPrice1, sPrice: orderDetail.sPrice1, count: orderDetail.count1},
                                    {productId: orderDetail.productId2, productName: orderDetail.productName2, size: orderDetail.size2, oPrice: orderDetail.oPrice2, sPrice: orderDetail.sPrice2, count: orderDetail.count2},
                                    {productId: orderDetail.productId3, productName: orderDetail.productName3, size: orderDetail.size3, oPrice: orderDetail.oPrice3, sPrice: orderDetail.sPrice3, count: orderDetail.count3},
                                    {productId: orderDetail.productId4, productName: orderDetail.productName4, size: orderDetail.size4, oPrice: orderDetail.oPrice4, sPrice: orderDetail.sPrice4, count: orderDetail.count4},
                                    {productId: orderDetail.productId5, productName: orderDetail.productName5, size: orderDetail.size5, oPrice: orderDetail.oPrice5, sPrice: orderDetail.sPrice5, count: orderDetail.count5},
                                    {productId: orderDetail.productId6, productName: orderDetail.productName6, size: orderDetail.size6, oPrice: orderDetail.oPrice6, sPrice: orderDetail.sPrice6, count: orderDetail.count6},
                                    {productId: orderDetail.productId7, productName: orderDetail.productName7, size: orderDetail.size7, oPrice: orderDetail.oPrice7, sPrice: orderDetail.sPrice7, count: orderDetail.count7},
                                    {productId: orderDetail.productId8, productName: orderDetail.productName8, size: orderDetail.size8, oPrice: orderDetail.oPrice8, sPrice: orderDetail.sPrice8, count: orderDetail.count8},
                                    {productId: orderDetail.productId9, productName: orderDetail.productName9, size: orderDetail.size9, oPrice: orderDetail.oPrice9, sPrice: orderDetail.sPrice9, count: orderDetail.count9},
                                    {productId: orderDetail.productId10, productName: orderDetail.productName10, size: orderDetail.size10, oPrice: orderDetail.oPrice10, sPrice: orderDetail.sPrice10, count: orderDetail.count10}
                                ]
                            },
                            success: function (rspdata) {
                                alert(2);
                            },
                            error: function () {
                                alert(3)
                            }
                        });
                    }
                }
            });
        </script>
    </body>
</html>
