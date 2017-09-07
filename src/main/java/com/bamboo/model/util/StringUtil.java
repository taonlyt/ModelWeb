/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bamboo.model.util;

/**
 *
 * @author luotao
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String trim(String str) {
        return (str == null || str.trim().length() == 0) ? null : str;
    }
}
