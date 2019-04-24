package com.ehr.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EhrContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EhrContractExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cID like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cID not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNull() {
            addCriterion("eNumber is null");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNotNull() {
            addCriterion("eNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnumberEqualTo(Integer value) {
            addCriterion("eNumber =", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotEqualTo(Integer value) {
            addCriterion("eNumber <>", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThan(Integer value) {
            addCriterion("eNumber >", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("eNumber >=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThan(Integer value) {
            addCriterion("eNumber <", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThanOrEqualTo(Integer value) {
            addCriterion("eNumber <=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberIn(List<Integer> values) {
            addCriterion("eNumber in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotIn(List<Integer> values) {
            addCriterion("eNumber not in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberBetween(Integer value1, Integer value2) {
            addCriterion("eNumber between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("eNumber not between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("cType is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("cType is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("cType =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("cType <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("cType >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cType >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("cType <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("cType <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("cType like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("cType not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("cType in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("cType not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("cType between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("cType not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andEffecticedateIsNull() {
            addCriterion("effecticeDate is null");
            return (Criteria) this;
        }

        public Criteria andEffecticedateIsNotNull() {
            addCriterion("effecticeDate is not null");
            return (Criteria) this;
        }

        public Criteria andEffecticedateEqualTo(Date value) {
            addCriterionForJDBCDate("effecticeDate =", value, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andEffecticedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("effecticeDate <>", value, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andEffecticedateGreaterThan(Date value) {
            addCriterionForJDBCDate("effecticeDate >", value, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andEffecticedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("effecticeDate >=", value, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andEffecticedateLessThan(Date value) {
            addCriterionForJDBCDate("effecticeDate <", value, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andEffecticedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("effecticeDate <=", value, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andEffecticedateIn(List<Date> values) {
            addCriterionForJDBCDate("effecticeDate in", values, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andEffecticedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("effecticeDate not in", values, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andEffecticedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("effecticeDate between", value1, value2, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andEffecticedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("effecticeDate not between", value1, value2, "effecticedate");
            return (Criteria) this;
        }

        public Criteria andExpirydateIsNull() {
            addCriterion("expiryDate is null");
            return (Criteria) this;
        }

        public Criteria andExpirydateIsNotNull() {
            addCriterion("expiryDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpirydateEqualTo(Date value) {
            addCriterionForJDBCDate("expiryDate =", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expiryDate <>", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateGreaterThan(Date value) {
            addCriterionForJDBCDate("expiryDate >", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiryDate >=", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateLessThan(Date value) {
            addCriterionForJDBCDate("expiryDate <", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiryDate <=", value, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateIn(List<Date> values) {
            addCriterionForJDBCDate("expiryDate in", values, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expiryDate not in", values, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiryDate between", value1, value2, "expirydate");
            return (Criteria) this;
        }

        public Criteria andExpirydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiryDate not between", value1, value2, "expirydate");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNull() {
            addCriterion("cStatus is null");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNotNull() {
            addCriterion("cStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCstatusEqualTo(String value) {
            addCriterion("cStatus =", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotEqualTo(String value) {
            addCriterion("cStatus <>", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThan(String value) {
            addCriterion("cStatus >", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThanOrEqualTo(String value) {
            addCriterion("cStatus >=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThan(String value) {
            addCriterion("cStatus <", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThanOrEqualTo(String value) {
            addCriterion("cStatus <=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLike(String value) {
            addCriterion("cStatus like", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotLike(String value) {
            addCriterion("cStatus not like", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIn(List<String> values) {
            addCriterion("cStatus in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotIn(List<String> values) {
            addCriterion("cStatus not in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusBetween(String value1, String value2) {
            addCriterion("cStatus between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotBetween(String value1, String value2) {
            addCriterion("cStatus not between", value1, value2, "cstatus");
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