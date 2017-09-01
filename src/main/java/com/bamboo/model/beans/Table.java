package com.bamboo.model.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Table implements Serializable {
    /**
     * 表ID
     */
    private Integer tableId;

    /**
     * 表名称
     */
    private String tableName;

    /**
     * 表中文名称
     */
    private String tableNameCn;

    /**
     * 数据库类型
     */
    private String dbType;

    private String creator;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableNameCn() {
        return tableNameCn;
    }

    public void setTableNameCn(String tableNameCn) {
        this.tableNameCn = tableNameCn;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}