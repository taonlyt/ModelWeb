/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.order.controller;

import com.bamboo.order.dto.PurchasedProduct;
import com.bamboo.order.dto.QOrderParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author luotao
 */
@Controller
public class ShoppingCartController {

    @RequestMapping(value = "/aaaaa.do", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String queryOrder(@RequestParam PurchasedProduct purchasedProduct, HttpServletRequest request, HttpSession session) {
        System.out.println("ffffff:" + purchasedProduct.getCustPhone());
        return "";
    }
}
