<%-- 
    Document   : test
    Created on : 2017-11-14, 16:49:19
    Author     : Luo Tao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="assets/iview/vue.min.js"></script>
        <!-- import Vue.js -->
        <script src="http://vuejs.org/js/vue.min.js"></script>
        <!-- import stylesheet -->
        <link rel="stylesheet" href="http://unpkg.com/iview/dist/styles/iview.css">
        <!-- import iView -->
        <script src="http://unpkg.com/iview/dist/iview.min.js"></script>
        <style scoped>
            .layout{
                border: 1px solid #d7dde4;
                background: #f5f7f9;
            }
            .layout-logo{
                width: 100px;
                height: 30px;
                background: #5b6270;
                border-radius: 3px;
                float: left;
                position: relative;
                top: 15px;
                left: 20px;
            }
            .layout-nav{
                width: 420px;
                margin: 0 auto;
            }
            .layout-assistant{
                width: 300px;
                margin: 0 auto;
                height: inherit;
            }
            .layout-breadcrumb{
                padding: 10px 15px 0;
            }
            .layout-content{
                min-height: 200px;
                margin: 15px;
                overflow: hidden;
                background: #fff;
                border-radius: 4px;
            }
            .layout-content-main{
                padding: 10px;
            }
            .layout-copy{
                text-align: center;
                padding: 10px 0 20px;
                color: #9ea7b4;
            }
        </style>
    </head>
    <body>
        <template>
            <div class="layout">
                <Menu mode="horizontal" theme="dark" active-name="1">
                    <div class="layout-logo"></div>
                    <div class="layout-nav">
                        <MenuItem name="1">
                        <Icon type="ios-navigate"></Icon>
                        Item 1
                        </MenuItem>
                        <MenuItem name="2">
                        <Icon type="ios-keypad"></Icon>
                        Item 2
                        </MenuItem>
                        <MenuItem name="3">
                        <Icon type="ios-analytics"></Icon>
                        Item 3
                        </MenuItem>
                        <MenuItem name="4">
                        <Icon type="ios-paper"></Icon>
                        Item 4
                        </MenuItem>
                    </div>
                </Menu>
                <Menu mode="horizontal" active-name="1">
                    <div class="layout-assistant">
                        <MenuItem name="1">Option 1</MenuItem>
                        <MenuItem name="2">Option 2</MenuItem>
                        <MenuItem name="3">Option 3</MenuItem>
                    </div>
                </Menu>
                <div class="layout-content">
                    <Row>
                        <Col span="5">
                        <Menu active-name="1-2" width="auto" :open-names="['1']">
                            <Submenu name="1">
                                <template slot="title">
                                    <Icon type="ios-navigate"></Icon>
                                    Item 1
                                </template>
                                <MenuItem name="1-1">Option 1</MenuItem>
                                <MenuItem name="1-2">Option 2</MenuItem>
                                <MenuItem name="1-3">Option 3</MenuItem>
                            </Submenu>
                            <Submenu name="2">
                                <template slot="title">
                                    <Icon type="ios-keypad"></Icon>
                                    Item 2
                                </template>
                                <MenuItem name="2-1">Option 1</MenuItem>
                                <MenuItem name="2-2">Option 2</MenuItem>
                            </Submenu>
                            <Submenu name="3">
                                <template slot="title">
                                    <Icon type="ios-analytics"></Icon>
                                    Item 3
                                </template>
                                <MenuItem name="3-1">Option 1</MenuItem>
                                <MenuItem name="3-2">Option 2</MenuItem>
                            </Submenu>
                        </Menu>
                        </Col>
                        <Col span="19">
                        <div class="layout-content-main">Content</div>
                        </Col>
                    </Row>
                </div>
                <div class="layout-copy">
                    2011-2016 &copy; TalkingData
                </div>
            </div>
        </template>
        <script>
            export default {

            }
        </script>
    </body>
</html>
