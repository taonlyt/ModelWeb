package com.bamboo.model.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class TableUpgradeForm implements Serializable {
    /**
     * 升级唯一标识
     */
    private Integer upgradeId;

    /**
     * 需求编号
     */
    private String reqCode;

    /**
     * 需求名称
     */
    private String reqName;

    /**
     * 需求类型
     */
    private String reqType;

    /**
     * 升级包路径
     */
    private String upgradePkgFile;

    private static final long serialVersionUID = 1L;

    public Integer getUpgradeId() {
        return upgradeId;
    }

    public void setUpgradeId(Integer upgradeId) {
        this.upgradeId = upgradeId;
    }

    public String getReqCode() {
        return reqCode;
    }

    public void setReqCode(String reqCode) {
        this.reqCode = reqCode;
    }

    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getUpgradePkgFile() {
        return upgradePkgFile;
    }

    public void setUpgradePkgFile(String upgradePkgFile) {
        this.upgradePkgFile = upgradePkgFile;
    }
}