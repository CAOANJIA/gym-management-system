package com.milotnt.pojo;

public class Equipment {

//    private Integer eqId;
//    private String eqName;
//    private String eqIns;
//    private String eqNumber;
//    private String insertTime;
    private Integer eqId;
    private String eqName;
    private String eqIns;
    private String eqNumber;
    private String insertTime;
    private String updateTime;
    private String expiryTime;
    private String instruction;
    private String remarks;

    public Equipment() {
    }

    public Equipment(Integer eqId, String eqName, String eqIns, String eqNumber, String insertTime, String updateTime, String expiryTime, String instruction, String remarks) {
        this.eqId = eqId;
        this.eqName = eqName;
        this.eqIns = eqIns;
        this.eqNumber = eqNumber;
        this.insertTime = insertTime;
        this.updateTime = updateTime;
        this.expiryTime = expiryTime;
        this.instruction = instruction;
        this.remarks = remarks;
    }

    public Integer getEqId() {
        return eqId;
    }

    public void setEqId(Integer eqId) {
        this.eqId = eqId;
    }

    public String getEqName() {
        return eqName;
    }

    public void setEqName(String eqName) {
        this.eqName = eqName;
    }

    public String getEqIns() {
        return eqIns;
    }

    public void setEqIns(String eqIns) {
        this.eqIns = eqIns;
    }

    public String getEqNumber() {
        return eqNumber;
    }

    public void setEqNumber(String eqNumber) {
        this.eqNumber = eqNumber;
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

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "eqId=" + eqId +
                ", eqName='" + eqName + '\'' +
                ", eqIns='" + eqIns + '\'' +
                ", eqNumber='" + eqNumber + '\'' +
                ", insertTime='" + insertTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", expiryTime='" + expiryTime + '\'' +
                ", instruction='" + instruction + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
