package com.bamboo.model.beans;

import java.util.ArrayList;
import java.util.List;

public class TableFieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TableFieldExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTableIdIsNull() {
            addCriterion("TABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("TABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(Integer value) {
            addCriterion("TABLE_ID =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(Integer value) {
            addCriterion("TABLE_ID <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(Integer value) {
            addCriterion("TABLE_ID >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TABLE_ID >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(Integer value) {
            addCriterion("TABLE_ID <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("TABLE_ID <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<Integer> values) {
            addCriterion("TABLE_ID in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<Integer> values) {
            addCriterion("TABLE_ID not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(Integer value1, Integer value2) {
            addCriterion("TABLE_ID between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TABLE_ID not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNull() {
            addCriterion("FIELD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("FIELD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("FIELD_NAME =", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("FIELD_NAME <>", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("FIELD_NAME >", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME >=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("FIELD_NAME <", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME <=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("FIELD_NAME like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("FIELD_NAME not like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("FIELD_NAME in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("FIELD_NAME not in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("FIELD_NAME between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("FIELD_NAME not between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldSeqIsNull() {
            addCriterion("FIELD_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFieldSeqIsNotNull() {
            addCriterion("FIELD_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFieldSeqEqualTo(Integer value) {
            addCriterion("FIELD_SEQ =", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqNotEqualTo(Integer value) {
            addCriterion("FIELD_SEQ <>", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqGreaterThan(Integer value) {
            addCriterion("FIELD_SEQ >", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIELD_SEQ >=", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqLessThan(Integer value) {
            addCriterion("FIELD_SEQ <", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqLessThanOrEqualTo(Integer value) {
            addCriterion("FIELD_SEQ <=", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqIn(List<Integer> values) {
            addCriterion("FIELD_SEQ in", values, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqNotIn(List<Integer> values) {
            addCriterion("FIELD_SEQ not in", values, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_SEQ between", value1, value2, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_SEQ not between", value1, value2, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnIsNull() {
            addCriterion("FIELD_NAME_CN is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnIsNotNull() {
            addCriterion("FIELD_NAME_CN is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnEqualTo(String value) {
            addCriterion("FIELD_NAME_CN =", value, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnNotEqualTo(String value) {
            addCriterion("FIELD_NAME_CN <>", value, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnGreaterThan(String value) {
            addCriterion("FIELD_NAME_CN >", value, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME_CN >=", value, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnLessThan(String value) {
            addCriterion("FIELD_NAME_CN <", value, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnLessThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME_CN <=", value, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnLike(String value) {
            addCriterion("FIELD_NAME_CN like", value, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnNotLike(String value) {
            addCriterion("FIELD_NAME_CN not like", value, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnIn(List<String> values) {
            addCriterion("FIELD_NAME_CN in", values, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnNotIn(List<String> values) {
            addCriterion("FIELD_NAME_CN not in", values, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnBetween(String value1, String value2) {
            addCriterion("FIELD_NAME_CN between", value1, value2, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldNameCnNotBetween(String value1, String value2) {
            addCriterion("FIELD_NAME_CN not between", value1, value2, "fieldNameCn");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeIsNull() {
            addCriterion("FIELD_DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeIsNotNull() {
            addCriterion("FIELD_DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeEqualTo(String value) {
            addCriterion("FIELD_DATA_TYPE =", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotEqualTo(String value) {
            addCriterion("FIELD_DATA_TYPE <>", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeGreaterThan(String value) {
            addCriterion("FIELD_DATA_TYPE >", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_DATA_TYPE >=", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeLessThan(String value) {
            addCriterion("FIELD_DATA_TYPE <", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeLessThanOrEqualTo(String value) {
            addCriterion("FIELD_DATA_TYPE <=", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeLike(String value) {
            addCriterion("FIELD_DATA_TYPE like", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotLike(String value) {
            addCriterion("FIELD_DATA_TYPE not like", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeIn(List<String> values) {
            addCriterion("FIELD_DATA_TYPE in", values, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotIn(List<String> values) {
            addCriterion("FIELD_DATA_TYPE not in", values, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeBetween(String value1, String value2) {
            addCriterion("FIELD_DATA_TYPE between", value1, value2, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotBetween(String value1, String value2) {
            addCriterion("FIELD_DATA_TYPE not between", value1, value2, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldCommentIsNull() {
            addCriterion("FIELD_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andFieldCommentIsNotNull() {
            addCriterion("FIELD_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andFieldCommentEqualTo(String value) {
            addCriterion("FIELD_COMMENT =", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentNotEqualTo(String value) {
            addCriterion("FIELD_COMMENT <>", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentGreaterThan(String value) {
            addCriterion("FIELD_COMMENT >", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_COMMENT >=", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentLessThan(String value) {
            addCriterion("FIELD_COMMENT <", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentLessThanOrEqualTo(String value) {
            addCriterion("FIELD_COMMENT <=", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentLike(String value) {
            addCriterion("FIELD_COMMENT like", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentNotLike(String value) {
            addCriterion("FIELD_COMMENT not like", value, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentIn(List<String> values) {
            addCriterion("FIELD_COMMENT in", values, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentNotIn(List<String> values) {
            addCriterion("FIELD_COMMENT not in", values, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentBetween(String value1, String value2) {
            addCriterion("FIELD_COMMENT between", value1, value2, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldCommentNotBetween(String value1, String value2) {
            addCriterion("FIELD_COMMENT not between", value1, value2, "fieldComment");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeIsNull() {
            addCriterion("FIELD_SECURITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeIsNotNull() {
            addCriterion("FIELD_SECURITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeEqualTo(String value) {
            addCriterion("FIELD_SECURITY_TYPE =", value, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeNotEqualTo(String value) {
            addCriterion("FIELD_SECURITY_TYPE <>", value, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeGreaterThan(String value) {
            addCriterion("FIELD_SECURITY_TYPE >", value, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_SECURITY_TYPE >=", value, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeLessThan(String value) {
            addCriterion("FIELD_SECURITY_TYPE <", value, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeLessThanOrEqualTo(String value) {
            addCriterion("FIELD_SECURITY_TYPE <=", value, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeLike(String value) {
            addCriterion("FIELD_SECURITY_TYPE like", value, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeNotLike(String value) {
            addCriterion("FIELD_SECURITY_TYPE not like", value, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeIn(List<String> values) {
            addCriterion("FIELD_SECURITY_TYPE in", values, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeNotIn(List<String> values) {
            addCriterion("FIELD_SECURITY_TYPE not in", values, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeBetween(String value1, String value2) {
            addCriterion("FIELD_SECURITY_TYPE between", value1, value2, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSecurityTypeNotBetween(String value1, String value2) {
            addCriterion("FIELD_SECURITY_TYPE not between", value1, value2, "fieldSecurityType");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelIsNull() {
            addCriterion("FIELD_SENSITIVE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelIsNotNull() {
            addCriterion("FIELD_SENSITIVE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelEqualTo(String value) {
            addCriterion("FIELD_SENSITIVE_LEVEL =", value, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelNotEqualTo(String value) {
            addCriterion("FIELD_SENSITIVE_LEVEL <>", value, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelGreaterThan(String value) {
            addCriterion("FIELD_SENSITIVE_LEVEL >", value, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_SENSITIVE_LEVEL >=", value, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelLessThan(String value) {
            addCriterion("FIELD_SENSITIVE_LEVEL <", value, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelLessThanOrEqualTo(String value) {
            addCriterion("FIELD_SENSITIVE_LEVEL <=", value, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelLike(String value) {
            addCriterion("FIELD_SENSITIVE_LEVEL like", value, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelNotLike(String value) {
            addCriterion("FIELD_SENSITIVE_LEVEL not like", value, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelIn(List<String> values) {
            addCriterion("FIELD_SENSITIVE_LEVEL in", values, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelNotIn(List<String> values) {
            addCriterion("FIELD_SENSITIVE_LEVEL not in", values, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelBetween(String value1, String value2) {
            addCriterion("FIELD_SENSITIVE_LEVEL between", value1, value2, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldSensitiveLevelNotBetween(String value1, String value2) {
            addCriterion("FIELD_SENSITIVE_LEVEL not between", value1, value2, "fieldSensitiveLevel");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeIsNull() {
            addCriterion("FIELD_FUZZY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeIsNotNull() {
            addCriterion("FIELD_FUZZY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeEqualTo(String value) {
            addCriterion("FIELD_FUZZY_CODE =", value, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeNotEqualTo(String value) {
            addCriterion("FIELD_FUZZY_CODE <>", value, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeGreaterThan(String value) {
            addCriterion("FIELD_FUZZY_CODE >", value, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_FUZZY_CODE >=", value, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeLessThan(String value) {
            addCriterion("FIELD_FUZZY_CODE <", value, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeLessThanOrEqualTo(String value) {
            addCriterion("FIELD_FUZZY_CODE <=", value, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeLike(String value) {
            addCriterion("FIELD_FUZZY_CODE like", value, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeNotLike(String value) {
            addCriterion("FIELD_FUZZY_CODE not like", value, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeIn(List<String> values) {
            addCriterion("FIELD_FUZZY_CODE in", values, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeNotIn(List<String> values) {
            addCriterion("FIELD_FUZZY_CODE not in", values, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeBetween(String value1, String value2) {
            addCriterion("FIELD_FUZZY_CODE between", value1, value2, "fieldFuzzyCode");
            return (Criteria) this;
        }

        public Criteria andFieldFuzzyCodeNotBetween(String value1, String value2) {
            addCriterion("FIELD_FUZZY_CODE not between", value1, value2, "fieldFuzzyCode");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}