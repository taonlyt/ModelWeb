/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.order.service.impl;

import com.bamboo.common.beans.TableList;
import com.bamboo.cust.beans.Customer;
import com.bamboo.cust.dao.CustomerDao;
import com.bamboo.order.beans.Order;
import com.bamboo.order.dao.OrderDao;
import com.bamboo.order.dto.QOrder;
import com.bamboo.order.dto.QOrderParam;
import com.bamboo.order.service.IOrderService;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author luotao
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private CustomerDao custDao;

    @Override
    public TableList queryOrder(QOrderParam orderParam) {
        long toatalRecord = orderDao.countByOrderParam(orderParam);
        List<QOrder> orderList = orderDao.selectByOrderParam(orderParam);
        System.out.println(orderList.get(0).toString());
        TableList tableList = new TableList();
        tableList.setRows(orderList);
        tableList.setTotal(Integer.parseInt(String.valueOf(toatalRecord)));
        return tableList;
    }

    @Override
    public TableList queryOrderByOrderId(QOrderParam orderParam) {
        Order order = orderDao.selectByPrimaryKey(orderParam.getOrderId());
        Customer cust = custDao.selectByPrimaryKey(order.getCustId());
        
        QOrder qOrder = new QOrder();
        qOrder.setCellPhoneNbr(cust.getCellPhoneNbr());
        qOrder.setCreateDate(order.getCreateDate());
        qOrder.setCustId(order.getCustId());
        qOrder.setCustName(cust.getCustName());
        qOrder.setDiscountMoney(order.getDiscountMoney());
        qOrder.setDiscountType(order.getDiscountType());
        qOrder.setOrderId(order.getCustId());
        qOrder.setOrderStatus(order.getOrderStatus());
        qOrder.setOriginalMoney(order.getOriginalMoney());
        qOrder.setPayedMoney(order.getPayedMoney());
        
        TableList tableList = new TableList();
        tableList.setRows(Arrays.asList(qOrder));
        tableList.setTotal(1);
        return tableList;
    }

}
