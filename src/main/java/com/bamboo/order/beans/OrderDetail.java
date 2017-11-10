package com.bamboo.order.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class OrderDetail implements Serializable {
    private String orderDetailId;

    private String orderId;

    private String productId;

    private BigDecimal orginalMoney;

    private BigDecimal discountMoney;

    private BigDecimal payedMoney;

    private String productDesc;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getOrginalMoney() {
        return orginalMoney;
    }

    public void setOrginalMoney(BigDecimal orginalMoney) {
        this.orginalMoney = orginalMoney;
    }

    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    public BigDecimal getPayedMoney() {
        return payedMoney;
    }

    public void setPayedMoney(BigDecimal payedMoney) {
        this.payedMoney = payedMoney;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}