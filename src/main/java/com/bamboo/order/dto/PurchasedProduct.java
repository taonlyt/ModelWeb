/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.order.dto;

import java.util.List;

/**
 *
 * @author luotao
 */
public class PurchasedProduct {

    private String custPhone;

    private List<BuyedProduct> orderDetails;

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public List<BuyedProduct> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<BuyedProduct> orderDetails) {
        this.orderDetails = orderDetails;
    }

}
