package com.ehr.pojo;

import java.util.Date;

public class EhrDimission {
    private String enumber;

    private String type;

    private Date start;

    private String description;

    private String filepath;

    private String marks;

    private String edname;

    private String ename;

    private String gone;

    private Date gzjz;

    private Integer deleteconstract;

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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
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

    public String getGone() {
        return gone;
    }

    public void setGone(String gone) {
        this.gone = gone == null ? null : gone.trim();
    }

    public Date getGzjz() {
        return gzjz;
    }

    public void setGzjz(Date gzjz) {
        this.gzjz = gzjz;
    }

    public Integer getDeleteconstract() {
        return deleteconstract;
    }

    public void setDeleteconstract(Integer deleteconstract) {
        this.deleteconstract = deleteconstract;
    }

    public String getUserdefined() {
        return userdefined;
    }

    public void setUserdefined(String userdefined) {
        this.userdefined = userdefined == null ? null : userdefined.trim();
    }
}