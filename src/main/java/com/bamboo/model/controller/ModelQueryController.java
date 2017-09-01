/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.model.controller;

import com.bamboo.model.beans.TableField;
import com.bamboo.model.beans.TableFieldExample;
import com.bamboo.model.beans.TableFieldExample.Criteria;
import com.bamboo.model.dao.TableFieldDao;
import com.bamboo.model.dto.TableList;
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
public class ModelQueryController {

    protected Logger logger = Logger.getLogger(ModelQueryController.class);

    @Resource
    private TableFieldDao tableFieldDao;

    @RequestMapping(value = "/tablelist.do", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public TableList queryTableAndFiled(HttpServletRequest request, HttpSession session) {
        String tableName = request.getParameter("modelName");
        String limit = request.getParameter("limit");
        String offset = request.getParameter("offset");
        String fieldName = request.getParameter("fieldName");
        String fieldNameZh = request.getParameter("fieldNameZh");
        TableFieldExample example = new TableFieldExample();
        Criteria criteria = example.createCriteria();
        if (tableName != null && tableName.trim().length() > 0) {
            criteria.andTableNameLike("CONCAT(CONCAT('%','"+tableName+"'),'%')");
        }
        if (fieldName != null && fieldName.trim().length() > 0) {
            criteria.andFieldNameLike("CONCAT(CONCAT('%','"+fieldName+"'),'%')");
        }
        if (fieldNameZh != null && fieldNameZh.trim().length() > 0) {

            criteria.andFieldNameCnLike("CONCAT(CONCAT('%','"+fieldNameZh+"'),'%')");
        }
        example.setLimit(Integer.parseInt(limit));
        example.setOffset(Integer.parseInt(offset));
        TableList tablelist = new TableList();
        List<TableField> tableFields = tableFieldDao.selectByExample(example);
        tablelist.setRows(tableFields);
        tablelist.setTotal(tableFields.size());
        return tablelist;
    }
}
