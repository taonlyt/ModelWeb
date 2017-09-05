/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.model.dto;

import com.bamboo.model.beans.Table;
import com.bamboo.model.beans.TableField;
import com.bamboo.model.beans.TableKindAttr;
import java.util.List;

/**
 *
 * @author luotao
 */
public class TableDTO {

    private Table table;
    private List<TableKindAttr> kindAttrs;
    private List<TableField> tableFields;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public List<TableKindAttr> getKindAttrs() {
        return kindAttrs;
    }

    public void setKindAttrs(List<TableKindAttr> kindAttrs) {
        this.kindAttrs = kindAttrs;
    }

    public List<TableField> getTableFields() {
        return tableFields;
    }

    public void setTableFields(List<TableField> tableFields) {
        this.tableFields = tableFields;
    }
    
    
}
