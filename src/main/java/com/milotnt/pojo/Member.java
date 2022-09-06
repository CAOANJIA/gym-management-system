package com.milotnt.pojo;


public class Member {

    private Integer userAc;
    private String userPw;
    private String userName;
    private String userGender;
    private Long userPh;
    private Integer userPt;
    private String insertTime;
    private  String updateTime;
    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userAc=" + userAc +
                ", userPw='" + userPw + '\'' +
                ", userName='" + userName + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userPh=" + userPh +
                ", userPt=" + userPt +
                ", remarks='" + remarks + '\'' +
                ", insertTime='" + insertTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }

    public int getUserPt() {
        return userPt;
    }

    public void setUserPt(int userPt) {
        this.userPt = userPt;
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
