package com.ehr.pojo;

import java.util.Date;

public class EhrSsRecords {
    private Integer id;

    private String type;

    private Float epay;

    private Integer cpay;

    private String enumber;

    private String ename;

    private String contractnum;

    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Float getEpay() {
        return epay;
    }

    public void setEpay(Float epay) {
        this.epay = epay;
    }

    public Integer getCpay() {
        return cpay;
    }

    public void setCpay(Integer cpay) {
        this.cpay = cpay;
    }

    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber == null ? null : enumber.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getContractnum() {
        return contractnum;
    }

    public void setContractnum(String contractnum) {
        this.contractnum = contractnum == null ? null : contractnum.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}