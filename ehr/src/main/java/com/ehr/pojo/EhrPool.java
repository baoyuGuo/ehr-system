package com.ehr.pojo;

import java.util.Date;

public class EhrPool {
    private Integer id;

    private String name;

    private String identitynumber;

    private String educationbg;

    private String graduatedschool;

    private String major;

    private Date graduationdate;

    private String email;

    private String telphone;

    private String filepath;

    private Float score;

    private String department;

    private String post;

    private String getway;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentitynumber() {
        return identitynumber;
    }

    public void setIdentitynumber(String identitynumber) {
        this.identitynumber = identitynumber == null ? null : identitynumber.trim();
    }

    public String getEducationbg() {
        return educationbg;
    }

    public void setEducationbg(String educationbg) {
        this.educationbg = educationbg == null ? null : educationbg.trim();
    }

    public String getGraduatedschool() {
        return graduatedschool;
    }

    public void setGraduatedschool(String graduatedschool) {
        this.graduatedschool = graduatedschool == null ? null : graduatedschool.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Date getGraduationdate() {
        return graduationdate;
    }

    public void setGraduationdate(Date graduationdate) {
        this.graduationdate = graduationdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getGetway() {
        return getway;
    }

    public void setGetway(String getway) {
        this.getway = getway == null ? null : getway.trim();
    }
}