package com.milotnt.pojo;

/**
 * @author ZhangMing [1157038410@qq.com]
 * @date 2021/8/10
 */
public class Coach {

    private Integer trId;
    private String trName;
    private String trGender;
    private String introduction;
    private Integer trAc;
    private String trPw;
    private String trPh;
    private String insertTime;
    private String updateTime;
    private String remarks;

    public Coach(Integer trId, String trName, String trGender, String introduction, Integer trAc, String trPw, String trPh, String insertTime, String updateTime, String remarks) {
        this.trId = trId;
        this.trName = trName;
        this.trGender = trGender;
        this.introduction = introduction;
        this.trAc = trAc;
        this.trPw = trPw;
        this.trPh = trPh;
        this.insertTime = insertTime;
        this.updateTime = updateTime;
        this.remarks = remarks;
    }

    public Coach() {
    }

    public Integer getTrId() {
        return trId;
    }

    public void setTrId(Integer trId) {
        this.trId = trId;
    }

    public String getTrName() {
        return trName;
    }

    public void setTrName(String trName) {
        this.trName = trName;
    }

    public String getTrGender() {
        return trGender;
    }

    public void setTrGender(String trGender) {
        this.trGender = trGender;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getTrAc() {
        return trAc;
    }

    public void setTrAc(Integer trAc) {
        this.trAc = trAc;
    }

    public String getTrPw() {
        return trPw;
    }

    public void setTrPw(String trPw) {
        this.trPw = trPw;
    }

    public String getTrPh() {
        return trPh;
    }

    public void setTrPh(String trPh) {
        this.trPh = trPh;
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
        return "Coach{" +
                "trId=" + trId +
                ", trName='" + trName + '\'' +
                ", trGender='" + trGender + '\'' +
                ", introduction='" + introduction + '\'' +
                ", trAc='" + trAc + '\'' +
                ", trPw='" + trPw + '\'' +
                ", trPh='" + trPh + '\'' +
                ", insertTime='" + insertTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }


//    public Integer getEmployeeAccount() {
//        return employeeAccount;
//    }
//
//    public void setEmployeeAccount(Integer employeeAccount) {
//        this.employeeAccount = employeeAccount;
//    }
//
//    public String getEmployeeName() {
//        return employeeName;
//    }
//
//    public void setEmployeeName(String employeeName) {
//        this.employeeName = employeeName;
//    }
//
//    public String getEmployeeGender() {
//        return employeeGender;
//    }
//
//    public void setEmployeeGender(String employeeGender) {
//        this.employeeGender = employeeGender;
//    }
//
//    public Integer getEmployeeAge() {
//        return employeeAge;
//    }
//
//    public void setEmployeeAge(Integer employeeAge) {
//        this.employeeAge = employeeAge;
//    }
//
//    public String getEntryTime() {
//        return entryTime;
//    }
//
//    public void setEntryTime(String entryTime) {
//        this.entryTime = entryTime;
//    }
//
//    public String getStaff() {
//        return staff;
//    }
//
//    public void setStaff(String staff) {
//        this.staff = staff;
//    }
//
//    public String getEmployeeMessage() {
//        return employeeMessage;
//    }
//
//    public void setEmployeeMessage(String employeeMessage) {
//        this.employeeMessage = employeeMessage;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                ", employeeAccount=" + employeeAccount +
//                ", employeeName='" + employeeName + '\'' +
//                ", employeeGender='" + employeeGender + '\'' +
//                ", employeeAge=" + employeeAge +
//                ", entryTime='" + entryTime + '\'' +
//                ", staff='" + staff + '\'' +
//                ", employeeMessage='" + employeeMessage + '\'' +
//                '}';
//    }
}
