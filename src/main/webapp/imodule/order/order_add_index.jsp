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
        </style>
    </head>
    <body>
        <div class="col-sm-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">订单信息</h3>
                </div>
                <div id="" class="panel-body">
                    <form class="form-inline" role="form">
                        <div class="form-group col-lg-8">
                            <label class=""  for="inputfile"><h3>客户手机号码：</h3></label>
                            <input type="text" class="form-control input-lg" v-model="input_phone">
                        </div>
                    </form>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice1"></td>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice2"></td>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice3"></td>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice4"></td>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice5"></td>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice6"></td>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice7"></td>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice8"></td>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice9"></td>
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
                                <td><input type="text" class="form-control" id="productId" placeholder="条形码"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="服装名称"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="尺码/大小"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="原价格"></td>
                                <td><input type="text" class="form-control" id="cellPhoneNbr" placeholder="出售价格" v-model="sPrice10"></td>
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
                            <div class="form-group col-lg-3">
                                <label class="" for="inputfile"><h3>总计：{{oMoney}} 元</h3></label>
                            </div>
                            <div class="form-group col-lg-3">
                                <label class=""  for="inputfile"><h3>实收：</h3></label>
                                <input type="text" class="input-lg bottom-bordered" v-model="sMoney">
                                <label class="" for="inputfile"><h3>元</h3></label>
                            </div>
                            <div class="form-group col-lg-3">
                                <label class="" for="inputfile"><h3>找零：{{charge}}</h3></label>
                                <label class="" for="inputfile"><h3>元</h3></label>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="panel-footer">
                    <div class="btn-group col-md-offset-11">
                        <button class="btn btn-lg btn-primary">保存</button>
                        <button class="btn btn-lg btn-primary">取消</button>
                    </div>
                </div>
            </div>
        </div>
        <script>
            var order_detail = new Vue({
                el: "#m_order_detail",
                data: {
                    product1: '', productName1: '', size1: '', oPrice1: '', sPrice1: '', count1: '1',
                    product2: '', productName2: '', size2: '', oPrice2: '', sPrice2: '', count2: '1',
                    product3: '', productName3: '', size3: '', oPrice3: '', sPrice3: '', count3: '1',
                    product4: '', productName4: '', size4: '', oPrice4: '', sPrice4: '', count4: '1',
                    product5: '', productName5: '', size5: '', oPrice5: '', sPrice5: '', count5: '1',
                    product6: '', productName6: '', size6: '', oPrice6: '', sPrice6: '', count6: '1',
                    product7: '', productName7: '', size7: '', oPrice7: '', sPrice7: '', count7: '1',
                    product8: '', productName8: '', size8: '', oPrice8: '', sPrice8: '', count8: '1',
                    product9: '', productName9: '', size9: '', oPrice9: '', sPrice9: '', count9: '1',
                    product10: '', productName10: '', size10: '', oPrice10: '', sPrice10: '', count10: '1'
                },
                methods: {
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
                    sMoney: '0.00',
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
        </script>
    </body>
</html>
