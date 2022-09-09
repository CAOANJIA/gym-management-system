package com.milotnt.pojo;

public class ClassOrder {

    private Integer appId;
    private Integer courseId;
    private Integer trId;
    private Integer userId;
    private String classBegin;
    private String classEnd;

    @Override
    public String toString() {
        return "ClassOrder{" +
                "appId=" + appId +
                ", courseId=" + courseId +
                ", trId='" + trId + '\'' +
                ", userId=" + userId +
                ", classBegin='" + classBegin + '\'' +
                ", classEnd='" + classEnd + '\'' +
                '}';
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTrId() {
        return trId;
    }

    public void setTrId(Integer trId) {
        this.trId = trId;
    }

    public ClassOrder(Integer courseId, Integer trId, Integer userId, String classBegin, String classEnd) {
        this.courseId = courseId;
        this.trId = trId;
        this.userId = userId;
        this.classBegin = classBegin;
        this.classEnd = classEnd;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getClassBegin() {
        return classBegin;
    }

    public void setClassBegin(String classBegin) {
        this.classBegin = classBegin;
    }

    public String getClassEnd() {
        return classEnd;
    }

    public void setClassEnd(String classEnd) {
        this.classEnd = classEnd;
    }
}
