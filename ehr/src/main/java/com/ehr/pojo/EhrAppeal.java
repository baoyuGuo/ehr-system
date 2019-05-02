package com.ehr.pojo;

import java.util.Date;

public class EhrAppeal {
    private String enumber;

    private String type;

    private Date day;

    private String description;

    private String filepath;

    private String marks;

    private String edname;

    private String ename;

    private String userdefined;

    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber == null ? null : enumber.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks == null ? null : marks.trim();
    }

    public String getEdname() {
        return edname;
    }

    public void setEdname(String edname) {
        this.edname = edname == null ? null : edname.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getUserdefined() {
        return userdefined;
    }

    public void setUserdefined(String userdefined) {
        this.userdefined = userdefined == null ? null : userdefined.trim();
    }
}