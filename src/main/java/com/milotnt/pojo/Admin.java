package com.milotnt.pojo;


public class Admin {

    private Integer admId;
    private String admName;
    private Long admAc;
    private String admPw;
    private String admRo;
    private Boolean admSt;
    private String insertTime;
    private String updateTime;
    private String remarks;

    @Override
    public String toString() {
        return "Admin{" +
                "admId=" + admId +
                ", admName='" + admName + '\'' +
                ", admAc=" + admAc +
                ", admPw='" + admPw + '\'' +
                ", admRo='" + admRo + '\'' +
                ", admSt=" + admSt +
                ", insertTime='" + insertTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Integer getAdmId() {
        return admId;
    }

    public void setAdmId(Integer admId) {
        this.admId = admId;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }

    public Long getAdmAc() {
        return admAc;
    }

    public void setAdmAc(Long admAc) {
        this.admAc = admAc;
    }

    public String getAdmPw() {
        return admPw;
    }

    public void setAdmPw(String admPw) {
        this.admPw = admPw;
    }

    public String getAdmRo() {
        return admRo;
    }

    public void setAdmRo(String admRo) {
        this.admRo = admRo;
    }

    public Boolean getAdmSt() {
        return admSt;
    }

    public void setAdmSt(Boolean admSt) {
        this.admSt = admSt;
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
}
