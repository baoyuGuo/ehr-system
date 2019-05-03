package com.ehr.pojo;

public class EhrDepartment {
    private Integer id;

    private String text;

    private String state;

    private String code;

    private Integer pid;

    private Integer empsize;

    private String marks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getEmpsize() {
        return empsize;
    }

    public void setEmpsize(Integer empsize) {
        this.empsize = empsize;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks == null ? null : marks.trim();
    }
}