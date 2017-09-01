package com.bamboo.model.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class TableAttrKey implements Serializable {
    private Integer tableId;

    private String attrId;

    private static final long serialVersionUID = 1L;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }
}