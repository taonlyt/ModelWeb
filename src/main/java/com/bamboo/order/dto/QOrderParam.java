/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.order.dto;

/**
 *
 * @author luotao
 */
public class QOrderParam {

    private String orderId;
    
    private String cellPhoneNbr;

    private Integer limit;
    private Integer offset;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    
    public String getCellPhoneNbr() {
        return cellPhoneNbr;
    }

    public void setCellPhoneNbr(String cellPhoneNbr) {
        this.cellPhoneNbr = cellPhoneNbr;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
