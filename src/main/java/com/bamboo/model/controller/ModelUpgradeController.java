/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.model.controller;

import com.bamboo.model.beans.TableField;
import com.bamboo.model.beans.TableUpgradeForm;
import com.bamboo.model.dao.TableUpgradeFormDao;
import com.bamboo.model.dto.QTableUpgradeForm;
import com.bamboo.common.beans.TableList;
import com.bamboo.model.util.StringUtil;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author luotao
 */
@Controller
public class ModelUpgradeController {

    protected Logger logger = Logger.getLogger(ModelUpgradeController.class);

    @Resource
    private TableUpgradeFormDao tableUpgradeFormDao;

    @RequestMapping(value = "/queryUpgradeForm.do", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public TableList queryTableAndFiled(HttpServletRequest request, HttpSession session) {
        String reqCode = request.getParameter("reqCode");
        String reqName = request.getParameter("reqName");
        String limit = request.getParameter("limit");
        String offset = request.getParameter("offset");
        
        QTableUpgradeForm queryParams = new QTableUpgradeForm();
        
        queryParams.setReqCode(StringUtil.trim(reqCode));
        queryParams.setReqName(StringUtil.trim(reqName));
       
        queryParams.setLimit(Integer.parseInt(limit));
        queryParams.setOffset(Integer.parseInt(offset));
        
        TableList tablelist = new TableList();
        long total = tableUpgradeFormDao.countByQTableUpgradeForm(queryParams);
        List<TableUpgradeForm> tableFields = tableUpgradeFormDao.selectByQTableUpgradeForm(queryParams);
        tablelist.setRows(tableFields);
        tablelist.setTotal(Integer.parseInt(String.valueOf(total)));
        return tablelist;
    }
}
