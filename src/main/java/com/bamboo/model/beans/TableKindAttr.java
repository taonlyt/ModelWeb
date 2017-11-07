package com.bamboo.model.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class TableKindAttr extends TableKindAttrKey implements Serializable {
    private String attrName;

    /**
     * 数据库类型属性默认值
     */
    private String attrValue;

    private static final long serialVersionUID = 1L;

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}