/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.order.dto;

import com.bamboo.order.beans.Order;

/**
 *
 * @author luotao
 */
public class QOrder extends Order {

    private String custName;
    private String cellPhoneNbr;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCellPhoneNbr() {
        return cellPhoneNbr;
    }

    public void setCellPhoneNbr(String cellPhoneNbr) {
        this.cellPhoneNbr = cellPhoneNbr;
    }

}
