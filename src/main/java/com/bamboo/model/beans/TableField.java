package com.bamboo.model.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class TableField extends TableFieldKey implements Serializable {
    private Integer fieldSeq;

    private String fieldNameCn;

    private String fieldDataType;

    private String fieldComment;

    /**
     * 安全分类
     */
    private String fieldSecurityType;

    /**
     * 安全等级
     */
    private String fieldSensitiveLevel;

    /**
     * 字段值模糊化编码，即脱敏ID。
     */
    private String fieldFuzzyCode;

    private static final long serialVersionUID = 1L;

    public Integer getFieldSeq() {
        return fieldSeq;
    }

    public void setFieldSeq(Integer fieldSeq) {
        this.fieldSeq = fieldSeq;
    }

    public String getFieldNameCn() {
        return fieldNameCn;
    }

    public void setFieldNameCn(String fieldNameCn) {
        this.fieldNameCn = fieldNameCn;
    }

    public String getFieldDataType() {
        return fieldDataType;
    }

    public void setFieldDataType(String fieldDataType) {
        this.fieldDataType = fieldDataType;
    }

    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
    }

    public String getFieldSecurityType() {
        return fieldSecurityType;
    }

    public void setFieldSecurityType(String fieldSecurityType) {
        this.fieldSecurityType = fieldSecurityType;
    }

    public String getFieldSensitiveLevel() {
        return fieldSensitiveLevel;
    }

    public void setFieldSensitiveLevel(String fieldSensitiveLevel) {
        this.fieldSensitiveLevel = fieldSensitiveLevel;
    }

    public String getFieldFuzzyCode() {
        return fieldFuzzyCode;
    }

    public void setFieldFuzzyCode(String fieldFuzzyCode) {
        this.fieldFuzzyCode = fieldFuzzyCode;
    }
}