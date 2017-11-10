package com.bamboo.cust.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Customer implements Serializable {
    /**
     * 客户标识
     */
    private String custId;

    /**
     * 客户姓名
     */
    private String custName;

    /**
     * 手机号码
     */
    private String cellPhoneNbr;

    /**
     * 创建时间
     */
    private Date createDate;

    private Integer custLevel;

    private static final long serialVersionUID = 1L;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(Integer custLevel) {
        this.custLevel = custLevel;
    }
}