package com.milotnt.pojo;

public class Message {
    private Integer cmId;
    private Integer userId;
    private String cmContent;
    private String insertTime;
    private String updateTime;
    private String remarks;

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCmContent() {
        return cmContent;
    }

    public void setCmContent(String cmContent) {
        this.cmContent = cmContent;
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
        return "Message{" +
                "cmId=" + cmId +
                ", userId=" + userId +
                ", cmContent='" + cmContent + '\'' +
                ", insertTime='" + insertTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
