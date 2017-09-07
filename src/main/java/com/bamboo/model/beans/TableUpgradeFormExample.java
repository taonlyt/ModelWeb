package com.bamboo.model.beans;

import java.util.ArrayList;
import java.util.List;

public class TableUpgradeFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TableUpgradeFormExample() {
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

        public Criteria andUpgradeIdIsNull() {
            addCriterion("UPGRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdIsNotNull() {
            addCriterion("UPGRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdEqualTo(Integer value) {
            addCriterion("UPGRADE_ID =", value, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdNotEqualTo(Integer value) {
            addCriterion("UPGRADE_ID <>", value, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdGreaterThan(Integer value) {
            addCriterion("UPGRADE_ID >", value, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPGRADE_ID >=", value, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdLessThan(Integer value) {
            addCriterion("UPGRADE_ID <", value, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("UPGRADE_ID <=", value, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdIn(List<Integer> values) {
            addCriterion("UPGRADE_ID in", values, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdNotIn(List<Integer> values) {
            addCriterion("UPGRADE_ID not in", values, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdBetween(Integer value1, Integer value2) {
            addCriterion("UPGRADE_ID between", value1, value2, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andUpgradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UPGRADE_ID not between", value1, value2, "upgradeId");
            return (Criteria) this;
        }

        public Criteria andReqCodeIsNull() {
            addCriterion("REQ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReqCodeIsNotNull() {
            addCriterion("REQ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReqCodeEqualTo(String value) {
            addCriterion("REQ_CODE =", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeNotEqualTo(String value) {
            addCriterion("REQ_CODE <>", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeGreaterThan(String value) {
            addCriterion("REQ_CODE >", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_CODE >=", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeLessThan(String value) {
            addCriterion("REQ_CODE <", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeLessThanOrEqualTo(String value) {
            addCriterion("REQ_CODE <=", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeLike(String value) {
            addCriterion("REQ_CODE like", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeNotLike(String value) {
            addCriterion("REQ_CODE not like", value, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeIn(List<String> values) {
            addCriterion("REQ_CODE in", values, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeNotIn(List<String> values) {
            addCriterion("REQ_CODE not in", values, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeBetween(String value1, String value2) {
            addCriterion("REQ_CODE between", value1, value2, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqCodeNotBetween(String value1, String value2) {
            addCriterion("REQ_CODE not between", value1, value2, "reqCode");
            return (Criteria) this;
        }

        public Criteria andReqNameIsNull() {
            addCriterion("REQ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReqNameIsNotNull() {
            addCriterion("REQ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReqNameEqualTo(String value) {
            addCriterion("REQ_NAME =", value, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameNotEqualTo(String value) {
            addCriterion("REQ_NAME <>", value, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameGreaterThan(String value) {
            addCriterion("REQ_NAME >", value, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_NAME >=", value, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameLessThan(String value) {
            addCriterion("REQ_NAME <", value, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameLessThanOrEqualTo(String value) {
            addCriterion("REQ_NAME <=", value, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameLike(String value) {
            addCriterion("REQ_NAME like", value, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameNotLike(String value) {
            addCriterion("REQ_NAME not like", value, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameIn(List<String> values) {
            addCriterion("REQ_NAME in", values, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameNotIn(List<String> values) {
            addCriterion("REQ_NAME not in", values, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameBetween(String value1, String value2) {
            addCriterion("REQ_NAME between", value1, value2, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqNameNotBetween(String value1, String value2) {
            addCriterion("REQ_NAME not between", value1, value2, "reqName");
            return (Criteria) this;
        }

        public Criteria andReqTypeIsNull() {
            addCriterion("REQ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReqTypeIsNotNull() {
            addCriterion("REQ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReqTypeEqualTo(String value) {
            addCriterion("REQ_TYPE =", value, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeNotEqualTo(String value) {
            addCriterion("REQ_TYPE <>", value, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeGreaterThan(String value) {
            addCriterion("REQ_TYPE >", value, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_TYPE >=", value, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeLessThan(String value) {
            addCriterion("REQ_TYPE <", value, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeLessThanOrEqualTo(String value) {
            addCriterion("REQ_TYPE <=", value, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeLike(String value) {
            addCriterion("REQ_TYPE like", value, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeNotLike(String value) {
            addCriterion("REQ_TYPE not like", value, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeIn(List<String> values) {
            addCriterion("REQ_TYPE in", values, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeNotIn(List<String> values) {
            addCriterion("REQ_TYPE not in", values, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeBetween(String value1, String value2) {
            addCriterion("REQ_TYPE between", value1, value2, "reqType");
            return (Criteria) this;
        }

        public Criteria andReqTypeNotBetween(String value1, String value2) {
            addCriterion("REQ_TYPE not between", value1, value2, "reqType");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileIsNull() {
            addCriterion("UPGRADE_PKG_FILE is null");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileIsNotNull() {
            addCriterion("UPGRADE_PKG_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileEqualTo(String value) {
            addCriterion("UPGRADE_PKG_FILE =", value, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileNotEqualTo(String value) {
            addCriterion("UPGRADE_PKG_FILE <>", value, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileGreaterThan(String value) {
            addCriterion("UPGRADE_PKG_FILE >", value, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileGreaterThanOrEqualTo(String value) {
            addCriterion("UPGRADE_PKG_FILE >=", value, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileLessThan(String value) {
            addCriterion("UPGRADE_PKG_FILE <", value, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileLessThanOrEqualTo(String value) {
            addCriterion("UPGRADE_PKG_FILE <=", value, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileLike(String value) {
            addCriterion("UPGRADE_PKG_FILE like", value, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileNotLike(String value) {
            addCriterion("UPGRADE_PKG_FILE not like", value, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileIn(List<String> values) {
            addCriterion("UPGRADE_PKG_FILE in", values, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileNotIn(List<String> values) {
            addCriterion("UPGRADE_PKG_FILE not in", values, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileBetween(String value1, String value2) {
            addCriterion("UPGRADE_PKG_FILE between", value1, value2, "upgradePkgFile");
            return (Criteria) this;
        }

        public Criteria andUpgradePkgFileNotBetween(String value1, String value2) {
            addCriterion("UPGRADE_PKG_FILE not between", value1, value2, "upgradePkgFile");
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