package com.bamboo.model.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class TableAttr extends TableAttrKey implements Serializable {
    private String attrValue;

    private static final long serialVersionUID = 1L;

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}