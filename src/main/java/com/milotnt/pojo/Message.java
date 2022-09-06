package com.milotnt.pojo;

public class Message {
    private Integer cmId;
    private Integer cmUserId;
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

    public Integer getCmUserId() {
        return cmUserId;
    }

    public void setCmUserId(Integer cmUserId) {
        this.cmUserId = cmUserId;
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
                ", cmUserId=" + cmUserId +
                ", cmContent='" + cmContent + '\'' +
                ", insertTime='" + insertTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
