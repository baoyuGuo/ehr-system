package com.ehr.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EhrPoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EhrPoolExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberIsNull() {
            addCriterion("identityNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberIsNotNull() {
            addCriterion("identityNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberEqualTo(String value) {
            addCriterion("identityNumber =", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotEqualTo(String value) {
            addCriterion("identityNumber <>", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberGreaterThan(String value) {
            addCriterion("identityNumber >", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberGreaterThanOrEqualTo(String value) {
            addCriterion("identityNumber >=", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberLessThan(String value) {
            addCriterion("identityNumber <", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberLessThanOrEqualTo(String value) {
            addCriterion("identityNumber <=", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberLike(String value) {
            addCriterion("identityNumber like", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotLike(String value) {
            addCriterion("identityNumber not like", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberIn(List<String> values) {
            addCriterion("identityNumber in", values, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotIn(List<String> values) {
            addCriterion("identityNumber not in", values, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberBetween(String value1, String value2) {
            addCriterion("identityNumber between", value1, value2, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotBetween(String value1, String value2) {
            addCriterion("identityNumber not between", value1, value2, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andEducationbgIsNull() {
            addCriterion("educationBg is null");
            return (Criteria) this;
        }

        public Criteria andEducationbgIsNotNull() {
            addCriterion("educationBg is not null");
            return (Criteria) this;
        }

        public Criteria andEducationbgEqualTo(String value) {
            addCriterion("educationBg =", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgNotEqualTo(String value) {
            addCriterion("educationBg <>", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgGreaterThan(String value) {
            addCriterion("educationBg >", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgGreaterThanOrEqualTo(String value) {
            addCriterion("educationBg >=", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgLessThan(String value) {
            addCriterion("educationBg <", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgLessThanOrEqualTo(String value) {
            addCriterion("educationBg <=", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgLike(String value) {
            addCriterion("educationBg like", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgNotLike(String value) {
            addCriterion("educationBg not like", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgIn(List<String> values) {
            addCriterion("educationBg in", values, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgNotIn(List<String> values) {
            addCriterion("educationBg not in", values, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgBetween(String value1, String value2) {
            addCriterion("educationBg between", value1, value2, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgNotBetween(String value1, String value2) {
            addCriterion("educationBg not between", value1, value2, "educationbg");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolIsNull() {
            addCriterion("graduatedSchool is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolIsNotNull() {
            addCriterion("graduatedSchool is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolEqualTo(String value) {
            addCriterion("graduatedSchool =", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolNotEqualTo(String value) {
            addCriterion("graduatedSchool <>", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolGreaterThan(String value) {
            addCriterion("graduatedSchool >", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduatedSchool >=", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolLessThan(String value) {
            addCriterion("graduatedSchool <", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolLessThanOrEqualTo(String value) {
            addCriterion("graduatedSchool <=", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolLike(String value) {
            addCriterion("graduatedSchool like", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolNotLike(String value) {
            addCriterion("graduatedSchool not like", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolIn(List<String> values) {
            addCriterion("graduatedSchool in", values, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolNotIn(List<String> values) {
            addCriterion("graduatedSchool not in", values, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolBetween(String value1, String value2) {
            addCriterion("graduatedSchool between", value1, value2, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolNotBetween(String value1, String value2) {
            addCriterion("graduatedSchool not between", value1, value2, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andGraduationdateIsNull() {
            addCriterion("graduationDate is null");
            return (Criteria) this;
        }

        public Criteria andGraduationdateIsNotNull() {
            addCriterion("graduationDate is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationdateEqualTo(Date value) {
            addCriterionForJDBCDate("graduationDate =", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("graduationDate <>", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateGreaterThan(Date value) {
            addCriterionForJDBCDate("graduationDate >", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduationDate >=", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateLessThan(Date value) {
            addCriterionForJDBCDate("graduationDate <", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduationDate <=", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateIn(List<Date> values) {
            addCriterionForJDBCDate("graduationDate in", values, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("graduationDate not in", values, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduationDate between", value1, value2, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduationDate not between", value1, value2, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("filepath is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("filepath is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("filepath =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("filepath <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("filepath >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("filepath >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("filepath <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("filepath <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("filepath like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("filepath not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("filepath in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("filepath not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("filepath between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("filepath not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andGetwayIsNull() {
            addCriterion("getway is null");
            return (Criteria) this;
        }

        public Criteria andGetwayIsNotNull() {
            addCriterion("getway is not null");
            return (Criteria) this;
        }

        public Criteria andGetwayEqualTo(String value) {
            addCriterion("getway =", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayNotEqualTo(String value) {
            addCriterion("getway <>", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayGreaterThan(String value) {
            addCriterion("getway >", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayGreaterThanOrEqualTo(String value) {
            addCriterion("getway >=", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayLessThan(String value) {
            addCriterion("getway <", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayLessThanOrEqualTo(String value) {
            addCriterion("getway <=", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayLike(String value) {
            addCriterion("getway like", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayNotLike(String value) {
            addCriterion("getway not like", value, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayIn(List<String> values) {
            addCriterion("getway in", values, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayNotIn(List<String> values) {
            addCriterion("getway not in", values, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayBetween(String value1, String value2) {
            addCriterion("getway between", value1, value2, "getway");
            return (Criteria) this;
        }

        public Criteria andGetwayNotBetween(String value1, String value2) {
            addCriterion("getway not between", value1, value2, "getway");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}