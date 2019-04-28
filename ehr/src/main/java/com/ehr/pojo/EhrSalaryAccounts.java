package com.ehr.pojo;

public class EhrSalaryAccounts {
    private Integer id;

    //基本工资
    private String basicwage;
    //工号 
    private String enumber;
    //岗位工资
    private String gwgz;
    //工龄工资
    private String glgz;
    //岗位津贴
    private Float gwjt;
    //话费补贴
    private Float hfbt;
    //餐费补贴
    private Float cfbt;
    //交通补贴
    private Float jtbt;
    //全勤奖金
    private Float qqjj;
    //其他奖金
    private Float qtjj;
    //保险代扣
    private Float bxdk;
    //餐费代扣
    private Float cfdk;
    //其他代扣
    private Float qtdk;
    //绩效工资
    private Float jxgz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBasicwage() {
        return basicwage;
    }

    public void setBasicwage(String basicwage) {
        this.basicwage = basicwage == null ? null : basicwage.trim();
    }

    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber == null ? null : enumber.trim();
    }

    public String getGwgz() {
        return gwgz;
    }

    public void setGwgz(String gwgz) {
        this.gwgz = gwgz == null ? null : gwgz.trim();
    }

    public String getGlgz() {
        return glgz;
    }

    public void setGlgz(String glgz) {
        this.glgz = glgz == null ? null : glgz.trim();
    }

    public Float getGwjt() {
        return gwjt;
    }

    public void setGwjt(Float gwjt) {
        this.gwjt = gwjt;
    }

    public Float getHfbt() {
        return hfbt;
    }

    public void setHfbt(Float hfbt) {
        this.hfbt = hfbt;
    }

    public Float getCfbt() {
        return cfbt;
    }

    public void setCfbt(Float cfbt) {
        this.cfbt = cfbt;
    }

    public Float getJtbt() {
        return jtbt;
    }

    public void setJtbt(Float jtbt) {
        this.jtbt = jtbt;
    }

    public Float getQqjj() {
        return qqjj;
    }

    public void setQqjj(Float qqjj) {
        this.qqjj = qqjj;
    }

    public Float getQtjj() {
        return qtjj;
    }

    public void setQtjj(Float qtjj) {
        this.qtjj = qtjj;
    }

    public Float getBxdk() {
        return bxdk;
    }

    public void setBxdk(Float bxdk) {
        this.bxdk = bxdk;
    }

    public Float getCfdk() {
        return cfdk;
    }

    public void setCfdk(Float cfdk) {
        this.cfdk = cfdk;
    }

    public Float getQtdk() {
        return qtdk;
    }

    public void setQtdk(Float qtdk) {
        this.qtdk = qtdk;
    }

    public Float getJxgz() {
        return jxgz;
    }

    public void setJxgz(Float jxgz) {
        this.jxgz = jxgz;
    }
}