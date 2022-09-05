package com.milotnt.pojo;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/10
 */
public class Member {

    private Integer memberAccount;
    private String memberPassword;
    private String memberName;
    private String memberGender;
    private Integer memberAge;
    private Integer memberHeight;
    private Integer memberWeight;
    private Long memberPhone;
    private String cardTime;
    private Integer cardClass;
    private Integer cardNextClass;

    public Integer getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(Integer memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public Integer getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }

    public Integer getMemberHeight() {
        return memberHeight;
    }

    public void setMemberHeight(Integer memberHeight) {
        this.memberHeight = memberHeight;
    }

    public Integer getMemberWeight() {
        return memberWeight;
    }

    public void setMemberWeight(Integer memberWeight) {
        this.memberWeight = memberWeight;
    }

    public Long getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(Long memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getCardTime() {
        return cardTime;
    }

    public void setCardTime(String cardTime) {
        this.cardTime = cardTime;
    }

    public Integer getCardClass() {
        return cardClass;
    }

    public void setCardClass(Integer cardClass) {
        this.cardClass = cardClass;
    }

    public Integer getCardNextClass() {
        return cardNextClass;
    }

    public void setCardNextClass(Integer cardNextClass) {
        this.cardNextClass = cardNextClass;
    }

    @Override
    public String toString() {
        return "Member{" +
                ", memberAccount=" + memberAccount +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberGender='" + memberGender + '\'' +
                ", memberAge=" + memberAge +
                ", memberHeight=" + memberHeight +
                ", memberWeight=" + memberWeight +
                ", memberPhone=" + memberPhone +
                ", cardTime='" + cardTime + '\'' +
                ", cardClass=" + cardClass +
                ", cardNextClass=" + cardNextClass +
                '}';
    }

//    private Integer userId;
//    private String userName;
//    private String userGender;
//    private String userAc;
//    private String userPw;
//    private String userPh;
//    private Integer userPt; //余额
//    private String insertTime;
//    private String updateTime;
//    private String startTime;
//    private String endTime;
//    private String remarks;
//
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserGender() {
//        return userGender;
//    }
//
//    public void setUserGender(String userGender) {
//        this.userGender = userGender;
//    }
//
//    public String getUserAc() {
//        return userAc;
//    }
//
//    public void setUserAc(String userAc) {
//        this.userAc = userAc;
//    }
//
//    public String getUserPw() {
//        return userPw;
//    }
//
//    public void setUserPw(String userPw) {
//        this.userPw = userPw;
//    }
//
//    public String getUserPh() {
//        return userPh;
//    }
//
//    public void setUserPh(String userPh) {
//        this.userPh = userPh;
//    }
//
//    public Integer getUserPt() {
//        return userPt;
//    }
//
//    public void setUserPt(Integer userPt) {
//        this.userPt = userPt;
//    }
//
//    public String getInsertTime() {
//        return insertTime;
//    }
//
//    public void setInsertTime(String insertTime) {
//        this.insertTime = insertTime;
//    }
//
//    public String getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(String updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    public String getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(String startTime) {
//        this.startTime = startTime;
//    }
//
//    public String getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(String endTime) {
//        this.endTime = endTime;
//    }
//
//    public String getRemarks() {
//        return remarks;
//    }
//
//    public void setRemarks(String remarks) {
//        this.remarks = remarks;
//    }
//
//    @Override
//    public String toString() {
//        return "Member{" +
//                "userId=" + userId +
//                ", userName='" + userName + '\'' +
//                ", userGender='" + userGender + '\'' +
//                ", userAc='" + userAc + '\'' +
//                ", userPw='" + userPw + '\'' +
//                ", userPh='" + userPh + '\'' +
//                ", userPt=" + userPt +
//                ", insertTime='" + insertTime + '\'' +
//                ", updateTime='" + updateTime + '\'' +
//                ", startTime='" + startTime + '\'' +
//                ", endTime='" + endTime + '\'' +
//                ", remarks='" + remarks + '\'' +
//                '}';
//    }
}
