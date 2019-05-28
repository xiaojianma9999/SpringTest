package com.xiaojianma.test.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    @JsonProperty("sNO")
    private String sno;
    private String name;
    private String sex;
    private String grade;
    private String school;

    private Additionalinfo additionalinfo;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", school='" + school + '\'' +
                ", additionalinfo=" + additionalinfo +
                '}';
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Additionalinfo getAdditionalinfo() {
        return additionalinfo;
    }

    public void setAdditionalinfo(Additionalinfo additionalinfo) {
        this.additionalinfo = additionalinfo;
    }
}
