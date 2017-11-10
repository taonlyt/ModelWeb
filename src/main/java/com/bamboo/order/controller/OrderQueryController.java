/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.order.controller;

import com.bamboo.common.beans.TableList;
import com.bamboo.order.dto.QOrderParam;
import com.bamboo.order.service.IOrderService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author luotao
 */
@Controller
public class OrderQueryController {

    @Resource
    private IOrderService orderService;

    @RequestMapping(value = "/queryOrder.do", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public TableList queryOrder(HttpServletRequest request, HttpSession session) {
        String limit = request.getParameter("limit");
        String offset = request.getParameter("offset");
        String cellPhoneNbr = request.getParameter("cellPhoneNbr");
        String orderId = request.getParameter("orderId");
        QOrderParam queryParam = new QOrderParam();
        queryParam.setLimit(Integer.parseInt(limit));
        queryParam.setOffset(Integer.parseInt(offset));
        if (cellPhoneNbr != null && cellPhoneNbr.trim().length() > 0) {
            queryParam.setCellPhoneNbr(cellPhoneNbr.trim());
        }
        if (cellPhoneNbr != null && cellPhoneNbr.trim().length() > 0) {
            queryParam.setOrderId(orderId.trim());
        }
        TableList tableList  = orderService.queryOrder(queryParam);
        return tableList;
    }
}
