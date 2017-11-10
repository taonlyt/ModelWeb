/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.order.service;

import com.bamboo.common.beans.TableList;
import com.bamboo.order.dto.QOrderParam;

/**
 *
 * @author luotao
 */
public interface IOrderService {

    public TableList queryOrder(QOrderParam orderParam);
    public TableList queryOrderByOrderId(QOrderParam orderParam);
}
