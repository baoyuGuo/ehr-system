package com.ehr.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EhrSsRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EhrSsRecordsExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEpayIsNull() {
            addCriterion("epay is null");
            return (Criteria) this;
        }

        public Criteria andEpayIsNotNull() {
            addCriterion("epay is not null");
            return (Criteria) this;
        }

        public Criteria andEpayEqualTo(Float value) {
            addCriterion("epay =", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayNotEqualTo(Float value) {
            addCriterion("epay <>", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayGreaterThan(Float value) {
            addCriterion("epay >", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayGreaterThanOrEqualTo(Float value) {
            addCriterion("epay >=", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayLessThan(Float value) {
            addCriterion("epay <", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayLessThanOrEqualTo(Float value) {
            addCriterion("epay <=", value, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayIn(List<Float> values) {
            addCriterion("epay in", values, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayNotIn(List<Float> values) {
            addCriterion("epay not in", values, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayBetween(Float value1, Float value2) {
            addCriterion("epay between", value1, value2, "epay");
            return (Criteria) this;
        }

        public Criteria andEpayNotBetween(Float value1, Float value2) {
            addCriterion("epay not between", value1, value2, "epay");
            return (Criteria) this;
        }

        public Criteria andCpayIsNull() {
            addCriterion("cpay is null");
            return (Criteria) this;
        }

        public Criteria andCpayIsNotNull() {
            addCriterion("cpay is not null");
            return (Criteria) this;
        }

        public Criteria andCpayEqualTo(Integer value) {
            addCriterion("cpay =", value, "cpay");
            return (Criteria) this;
        }

        public Criteria andCpayNotEqualTo(Integer value) {
            addCriterion("cpay <>", value, "cpay");
            return (Criteria) this;
        }

        public Criteria andCpayGreaterThan(Integer value) {
            addCriterion("cpay >", value, "cpay");
            return (Criteria) this;
        }

        public Criteria andCpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpay >=", value, "cpay");
            return (Criteria) this;
        }

        public Criteria andCpayLessThan(Integer value) {
            addCriterion("cpay <", value, "cpay");
            return (Criteria) this;
        }

        public Criteria andCpayLessThanOrEqualTo(Integer value) {
            addCriterion("cpay <=", value, "cpay");
            return (Criteria) this;
        }

        public Criteria andCpayIn(List<Integer> values) {
            addCriterion("cpay in", values, "cpay");
            return (Criteria) this;
        }

        public Criteria andCpayNotIn(List<Integer> values) {
            addCriterion("cpay not in", values, "cpay");
            return (Criteria) this;
        }

        public Criteria andCpayBetween(Integer value1, Integer value2) {
            addCriterion("cpay between", value1, value2, "cpay");
            return (Criteria) this;
        }

        public Criteria andCpayNotBetween(Integer value1, Integer value2) {
            addCriterion("cpay not between", value1, value2, "cpay");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNull() {
            addCriterion("enumber is null");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNotNull() {
            addCriterion("enumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnumberEqualTo(String value) {
            addCriterion("enumber =", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotEqualTo(String value) {
            addCriterion("enumber <>", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThan(String value) {
            addCriterion("enumber >", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThanOrEqualTo(String value) {
            addCriterion("enumber >=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThan(String value) {
            addCriterion("enumber <", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThanOrEqualTo(String value) {
            addCriterion("enumber <=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLike(String value) {
            addCriterion("enumber like", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotLike(String value) {
            addCriterion("enumber not like", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberIn(List<String> values) {
            addCriterion("enumber in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotIn(List<String> values) {
            addCriterion("enumber not in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberBetween(String value1, String value2) {
            addCriterion("enumber between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotBetween(String value1, String value2) {
            addCriterion("enumber not between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andContractnumIsNull() {
            addCriterion("contractnum is null");
            return (Criteria) this;
        }

        public Criteria andContractnumIsNotNull() {
            addCriterion("contractnum is not null");
            return (Criteria) this;
        }

        public Criteria andContractnumEqualTo(String value) {
            addCriterion("contractnum =", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumNotEqualTo(String value) {
            addCriterion("contractnum <>", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumGreaterThan(String value) {
            addCriterion("contractnum >", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumGreaterThanOrEqualTo(String value) {
            addCriterion("contractnum >=", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumLessThan(String value) {
            addCriterion("contractnum <", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumLessThanOrEqualTo(String value) {
            addCriterion("contractnum <=", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumLike(String value) {
            addCriterion("contractnum like", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumNotLike(String value) {
            addCriterion("contractnum not like", value, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumIn(List<String> values) {
            addCriterion("contractnum in", values, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumNotIn(List<String> values) {
            addCriterion("contractnum not in", values, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumBetween(String value1, String value2) {
            addCriterion("contractnum between", value1, value2, "contractnum");
            return (Criteria) this;
        }

        public Criteria andContractnumNotBetween(String value1, String value2) {
            addCriterion("contractnum not between", value1, value2, "contractnum");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate not between", value1, value2, "createdate");
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