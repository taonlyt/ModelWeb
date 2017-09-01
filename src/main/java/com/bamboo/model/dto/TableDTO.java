/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.model.dto;

import com.bamboo.model.beans.Table;
import com.bamboo.model.beans.TableField;

/**
 *
 * @author luotao
 */
public class TableDTO {

    private Table table;
    private TableField tableFields;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public TableField getTableFields() {
        return tableFields;
    }

    public void setTableFields(TableField tableFields) {
        this.tableFields = tableFields;
    }
    
}
