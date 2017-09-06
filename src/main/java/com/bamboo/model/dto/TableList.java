/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.model.dto;

import java.util.List;

/**
 *
 * @author luotao
 */
public class TableList {

    /**
     * 总记录数
     */
    private int total;
    /**
     * 当前页记录
     */
    private List rows;

    public void setTotal(int total) {
        this.total = total;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public List getRows() {
        return rows;
    }

}
