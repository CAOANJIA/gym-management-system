package com.milotnt.pojo;


public class Member {

    private Integer userId;
    private String userName;
    private String userGender;
    private Integer userAc;
    private String userPw;
    private Long userPh;
    private Integer userPt;
    private String insertTime;
    private String updateTime;
    private String startTime;
    private String endTime;

    @Override
    public String toString() {
        return "Member{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userAc=" + userAc +
                ", userPw='" + userPw + '\'' +
                ", userPh=" + userPh +
                ", userPt=" + userPt +
                ", insertTime='" + insertTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Integer getUserPt() {
        return userPt;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    private String remarks;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserPt(Integer userPt) {
        this.userPt = userPt;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setUserAc(Integer userAc) {
        this.userAc = userAc;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public void setUserPh(Long userPh) {
        this.userPh = userPh;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    public Integer getUserAc() {
        return userAc;
    }

    public String getUserPw() {
        return userPw;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public Long getUserPh() {
        return userPh;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }
}
