package com.milotnt.pojo;

public class Bill {
    private Integer rcId;
    private Integer userId;
    private String rcType;
    private Integer rcAmount;
    private String insertTime;
    private String updateTime;
    private String remarks;

    public Integer getRcAmount() {
        return rcAmount;
    }

    public void setRcAmount(Integer rcAmount) {
        this.rcAmount = rcAmount;
    }

    public Integer getRcId() {
        return rcId;
    }

    public void setRcId(Integer rcId) {
        this.rcId = rcId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRcType() {
        return rcType;
    }

    public void setRcType(String rcType) {
        this.rcType = rcType;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "rcId=" + rcId +
                ", userId=" + userId +
                ", rcType='" + rcType + '\'' +
                ", rcAmount='" + rcAmount + '\'' +
                ", insertTime='" + insertTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
