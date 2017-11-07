package com.bamboo.model.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class TableKindAttrKey implements Serializable {
    private String dbType;

    private String attrId;

    private static final long serialVersionUID = 1L;

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }
}