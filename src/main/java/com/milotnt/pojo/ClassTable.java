package com.milotnt.pojo;

public class ClassTable {

    private Integer courseId;
    private String courseName;
    private Integer trId;
    private String courseBegin;
    private String courseEnd;
    private Integer coursePrice;
    private Integer eqId;
    private String insertTime;
    private String updateTime;
    private String remarks;

    public Integer getcourseId() { return courseId; }
    public void setcourseId(Integer courseId) { this.courseId = courseId; }

    public String getcourseName() { return courseName; }
    public void setcourseName(String courseName) { this.courseName = courseName; }

    public Integer gettrId() { return trId; }
    public void settrId(Integer trId) { this.trId = trId; }

    public String getcourseBegin() { return courseBegin; }
    public void setcourseBegin(String courseBegin) { this.courseBegin = courseBegin; }

    public String getcourseEnd() { return courseEnd; }
    public void setcourseEnd(String courseEnd) { this.courseEnd = courseEnd; }

    public Integer getcoursePrice() { return coursePrice; }
    public void setcoursePrice(Integer coursePrice) { this.coursePrice = coursePrice; }

    public Integer geteqId() { return eqId; }
    public void seteqId(Integer eqId) { this.eqId = eqId; }

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
        return "ClassTable{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", trId='" + trId + '\'' +
                ", courseBegin='" + courseBegin + '\'' +
                ", courseEnd='" + courseEnd + '\'' +
                ", coursePrice='" + coursePrice + '\'' +
                ", eqId='" + eqId + '\'' +
                ", insertTime='" + insertTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
