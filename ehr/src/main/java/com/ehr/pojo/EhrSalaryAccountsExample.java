package com.ehr.pojo;

import java.util.ArrayList;
import java.util.List;

public class EhrSalaryAccountsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EhrSalaryAccountsExample() {
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

        public Criteria andBasicwageIsNull() {
            addCriterion("basicwage is null");
            return (Criteria) this;
        }

        public Criteria andBasicwageIsNotNull() {
            addCriterion("basicwage is not null");
            return (Criteria) this;
        }

        public Criteria andBasicwageEqualTo(String value) {
            addCriterion("basicwage =", value, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageNotEqualTo(String value) {
            addCriterion("basicwage <>", value, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageGreaterThan(String value) {
            addCriterion("basicwage >", value, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageGreaterThanOrEqualTo(String value) {
            addCriterion("basicwage >=", value, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageLessThan(String value) {
            addCriterion("basicwage <", value, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageLessThanOrEqualTo(String value) {
            addCriterion("basicwage <=", value, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageLike(String value) {
            addCriterion("basicwage like", value, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageNotLike(String value) {
            addCriterion("basicwage not like", value, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageIn(List<String> values) {
            addCriterion("basicwage in", values, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageNotIn(List<String> values) {
            addCriterion("basicwage not in", values, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageBetween(String value1, String value2) {
            addCriterion("basicwage between", value1, value2, "basicwage");
            return (Criteria) this;
        }

        public Criteria andBasicwageNotBetween(String value1, String value2) {
            addCriterion("basicwage not between", value1, value2, "basicwage");
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

        public Criteria andGwgzIsNull() {
            addCriterion("gwgz is null");
            return (Criteria) this;
        }

        public Criteria andGwgzIsNotNull() {
            addCriterion("gwgz is not null");
            return (Criteria) this;
        }

        public Criteria andGwgzEqualTo(String value) {
            addCriterion("gwgz =", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzNotEqualTo(String value) {
            addCriterion("gwgz <>", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzGreaterThan(String value) {
            addCriterion("gwgz >", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzGreaterThanOrEqualTo(String value) {
            addCriterion("gwgz >=", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzLessThan(String value) {
            addCriterion("gwgz <", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzLessThanOrEqualTo(String value) {
            addCriterion("gwgz <=", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzLike(String value) {
            addCriterion("gwgz like", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzNotLike(String value) {
            addCriterion("gwgz not like", value, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzIn(List<String> values) {
            addCriterion("gwgz in", values, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzNotIn(List<String> values) {
            addCriterion("gwgz not in", values, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzBetween(String value1, String value2) {
            addCriterion("gwgz between", value1, value2, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGwgzNotBetween(String value1, String value2) {
            addCriterion("gwgz not between", value1, value2, "gwgz");
            return (Criteria) this;
        }

        public Criteria andGlgzIsNull() {
            addCriterion("glgz is null");
            return (Criteria) this;
        }

        public Criteria andGlgzIsNotNull() {
            addCriterion("glgz is not null");
            return (Criteria) this;
        }

        public Criteria andGlgzEqualTo(String value) {
            addCriterion("glgz =", value, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzNotEqualTo(String value) {
            addCriterion("glgz <>", value, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzGreaterThan(String value) {
            addCriterion("glgz >", value, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzGreaterThanOrEqualTo(String value) {
            addCriterion("glgz >=", value, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzLessThan(String value) {
            addCriterion("glgz <", value, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzLessThanOrEqualTo(String value) {
            addCriterion("glgz <=", value, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzLike(String value) {
            addCriterion("glgz like", value, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzNotLike(String value) {
            addCriterion("glgz not like", value, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzIn(List<String> values) {
            addCriterion("glgz in", values, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzNotIn(List<String> values) {
            addCriterion("glgz not in", values, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzBetween(String value1, String value2) {
            addCriterion("glgz between", value1, value2, "glgz");
            return (Criteria) this;
        }

        public Criteria andGlgzNotBetween(String value1, String value2) {
            addCriterion("glgz not between", value1, value2, "glgz");
            return (Criteria) this;
        }

        public Criteria andGwjtIsNull() {
            addCriterion("gwjt is null");
            return (Criteria) this;
        }

        public Criteria andGwjtIsNotNull() {
            addCriterion("gwjt is not null");
            return (Criteria) this;
        }

        public Criteria andGwjtEqualTo(Float value) {
            addCriterion("gwjt =", value, "gwjt");
            return (Criteria) this;
        }

        public Criteria andGwjtNotEqualTo(Float value) {
            addCriterion("gwjt <>", value, "gwjt");
            return (Criteria) this;
        }

        public Criteria andGwjtGreaterThan(Float value) {
            addCriterion("gwjt >", value, "gwjt");
            return (Criteria) this;
        }

        public Criteria andGwjtGreaterThanOrEqualTo(Float value) {
            addCriterion("gwjt >=", value, "gwjt");
            return (Criteria) this;
        }

        public Criteria andGwjtLessThan(Float value) {
            addCriterion("gwjt <", value, "gwjt");
            return (Criteria) this;
        }

        public Criteria andGwjtLessThanOrEqualTo(Float value) {
            addCriterion("gwjt <=", value, "gwjt");
            return (Criteria) this;
        }

        public Criteria andGwjtIn(List<Float> values) {
            addCriterion("gwjt in", values, "gwjt");
            return (Criteria) this;
        }

        public Criteria andGwjtNotIn(List<Float> values) {
            addCriterion("gwjt not in", values, "gwjt");
            return (Criteria) this;
        }

        public Criteria andGwjtBetween(Float value1, Float value2) {
            addCriterion("gwjt between", value1, value2, "gwjt");
            return (Criteria) this;
        }

        public Criteria andGwjtNotBetween(Float value1, Float value2) {
            addCriterion("gwjt not between", value1, value2, "gwjt");
            return (Criteria) this;
        }

        public Criteria andHfbtIsNull() {
            addCriterion("hfbt is null");
            return (Criteria) this;
        }

        public Criteria andHfbtIsNotNull() {
            addCriterion("hfbt is not null");
            return (Criteria) this;
        }

        public Criteria andHfbtEqualTo(Float value) {
            addCriterion("hfbt =", value, "hfbt");
            return (Criteria) this;
        }

        public Criteria andHfbtNotEqualTo(Float value) {
            addCriterion("hfbt <>", value, "hfbt");
            return (Criteria) this;
        }

        public Criteria andHfbtGreaterThan(Float value) {
            addCriterion("hfbt >", value, "hfbt");
            return (Criteria) this;
        }

        public Criteria andHfbtGreaterThanOrEqualTo(Float value) {
            addCriterion("hfbt >=", value, "hfbt");
            return (Criteria) this;
        }

        public Criteria andHfbtLessThan(Float value) {
            addCriterion("hfbt <", value, "hfbt");
            return (Criteria) this;
        }

        public Criteria andHfbtLessThanOrEqualTo(Float value) {
            addCriterion("hfbt <=", value, "hfbt");
            return (Criteria) this;
        }

        public Criteria andHfbtIn(List<Float> values) {
            addCriterion("hfbt in", values, "hfbt");
            return (Criteria) this;
        }

        public Criteria andHfbtNotIn(List<Float> values) {
            addCriterion("hfbt not in", values, "hfbt");
            return (Criteria) this;
        }

        public Criteria andHfbtBetween(Float value1, Float value2) {
            addCriterion("hfbt between", value1, value2, "hfbt");
            return (Criteria) this;
        }

        public Criteria andHfbtNotBetween(Float value1, Float value2) {
            addCriterion("hfbt not between", value1, value2, "hfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtIsNull() {
            addCriterion("cfbt is null");
            return (Criteria) this;
        }

        public Criteria andCfbtIsNotNull() {
            addCriterion("cfbt is not null");
            return (Criteria) this;
        }

        public Criteria andCfbtEqualTo(Float value) {
            addCriterion("cfbt =", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtNotEqualTo(Float value) {
            addCriterion("cfbt <>", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtGreaterThan(Float value) {
            addCriterion("cfbt >", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtGreaterThanOrEqualTo(Float value) {
            addCriterion("cfbt >=", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtLessThan(Float value) {
            addCriterion("cfbt <", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtLessThanOrEqualTo(Float value) {
            addCriterion("cfbt <=", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtIn(List<Float> values) {
            addCriterion("cfbt in", values, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtNotIn(List<Float> values) {
            addCriterion("cfbt not in", values, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtBetween(Float value1, Float value2) {
            addCriterion("cfbt between", value1, value2, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtNotBetween(Float value1, Float value2) {
            addCriterion("cfbt not between", value1, value2, "cfbt");
            return (Criteria) this;
        }

        public Criteria andJtbtIsNull() {
            addCriterion("jtbt is null");
            return (Criteria) this;
        }

        public Criteria andJtbtIsNotNull() {
            addCriterion("jtbt is not null");
            return (Criteria) this;
        }

        public Criteria andJtbtEqualTo(Float value) {
            addCriterion("jtbt =", value, "jtbt");
            return (Criteria) this;
        }

        public Criteria andJtbtNotEqualTo(Float value) {
            addCriterion("jtbt <>", value, "jtbt");
            return (Criteria) this;
        }

        public Criteria andJtbtGreaterThan(Float value) {
            addCriterion("jtbt >", value, "jtbt");
            return (Criteria) this;
        }

        public Criteria andJtbtGreaterThanOrEqualTo(Float value) {
            addCriterion("jtbt >=", value, "jtbt");
            return (Criteria) this;
        }

        public Criteria andJtbtLessThan(Float value) {
            addCriterion("jtbt <", value, "jtbt");
            return (Criteria) this;
        }

        public Criteria andJtbtLessThanOrEqualTo(Float value) {
            addCriterion("jtbt <=", value, "jtbt");
            return (Criteria) this;
        }

        public Criteria andJtbtIn(List<Float> values) {
            addCriterion("jtbt in", values, "jtbt");
            return (Criteria) this;
        }

        public Criteria andJtbtNotIn(List<Float> values) {
            addCriterion("jtbt not in", values, "jtbt");
            return (Criteria) this;
        }

        public Criteria andJtbtBetween(Float value1, Float value2) {
            addCriterion("jtbt between", value1, value2, "jtbt");
            return (Criteria) this;
        }

        public Criteria andJtbtNotBetween(Float value1, Float value2) {
            addCriterion("jtbt not between", value1, value2, "jtbt");
            return (Criteria) this;
        }

        public Criteria andQqjjIsNull() {
            addCriterion("qqjj is null");
            return (Criteria) this;
        }

        public Criteria andQqjjIsNotNull() {
            addCriterion("qqjj is not null");
            return (Criteria) this;
        }

        public Criteria andQqjjEqualTo(Float value) {
            addCriterion("qqjj =", value, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQqjjNotEqualTo(Float value) {
            addCriterion("qqjj <>", value, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQqjjGreaterThan(Float value) {
            addCriterion("qqjj >", value, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQqjjGreaterThanOrEqualTo(Float value) {
            addCriterion("qqjj >=", value, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQqjjLessThan(Float value) {
            addCriterion("qqjj <", value, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQqjjLessThanOrEqualTo(Float value) {
            addCriterion("qqjj <=", value, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQqjjIn(List<Float> values) {
            addCriterion("qqjj in", values, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQqjjNotIn(List<Float> values) {
            addCriterion("qqjj not in", values, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQqjjBetween(Float value1, Float value2) {
            addCriterion("qqjj between", value1, value2, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQqjjNotBetween(Float value1, Float value2) {
            addCriterion("qqjj not between", value1, value2, "qqjj");
            return (Criteria) this;
        }

        public Criteria andQtjjIsNull() {
            addCriterion("qtjj is null");
            return (Criteria) this;
        }

        public Criteria andQtjjIsNotNull() {
            addCriterion("qtjj is not null");
            return (Criteria) this;
        }

        public Criteria andQtjjEqualTo(Float value) {
            addCriterion("qtjj =", value, "qtjj");
            return (Criteria) this;
        }

        public Criteria andQtjjNotEqualTo(Float value) {
            addCriterion("qtjj <>", value, "qtjj");
            return (Criteria) this;
        }

        public Criteria andQtjjGreaterThan(Float value) {
            addCriterion("qtjj >", value, "qtjj");
            return (Criteria) this;
        }

        public Criteria andQtjjGreaterThanOrEqualTo(Float value) {
            addCriterion("qtjj >=", value, "qtjj");
            return (Criteria) this;
        }

        public Criteria andQtjjLessThan(Float value) {
            addCriterion("qtjj <", value, "qtjj");
            return (Criteria) this;
        }

        public Criteria andQtjjLessThanOrEqualTo(Float value) {
            addCriterion("qtjj <=", value, "qtjj");
            return (Criteria) this;
        }

        public Criteria andQtjjIn(List<Float> values) {
            addCriterion("qtjj in", values, "qtjj");
            return (Criteria) this;
        }

        public Criteria andQtjjNotIn(List<Float> values) {
            addCriterion("qtjj not in", values, "qtjj");
            return (Criteria) this;
        }

        public Criteria andQtjjBetween(Float value1, Float value2) {
            addCriterion("qtjj between", value1, value2, "qtjj");
            return (Criteria) this;
        }

        public Criteria andQtjjNotBetween(Float value1, Float value2) {
            addCriterion("qtjj not between", value1, value2, "qtjj");
            return (Criteria) this;
        }

        public Criteria andBxdkIsNull() {
            addCriterion("bxdk is null");
            return (Criteria) this;
        }

        public Criteria andBxdkIsNotNull() {
            addCriterion("bxdk is not null");
            return (Criteria) this;
        }

        public Criteria andBxdkEqualTo(Float value) {
            addCriterion("bxdk =", value, "bxdk");
            return (Criteria) this;
        }

        public Criteria andBxdkNotEqualTo(Float value) {
            addCriterion("bxdk <>", value, "bxdk");
            return (Criteria) this;
        }

        public Criteria andBxdkGreaterThan(Float value) {
            addCriterion("bxdk >", value, "bxdk");
            return (Criteria) this;
        }

        public Criteria andBxdkGreaterThanOrEqualTo(Float value) {
            addCriterion("bxdk >=", value, "bxdk");
            return (Criteria) this;
        }

        public Criteria andBxdkLessThan(Float value) {
            addCriterion("bxdk <", value, "bxdk");
            return (Criteria) this;
        }

        public Criteria andBxdkLessThanOrEqualTo(Float value) {
            addCriterion("bxdk <=", value, "bxdk");
            return (Criteria) this;
        }

        public Criteria andBxdkIn(List<Float> values) {
            addCriterion("bxdk in", values, "bxdk");
            return (Criteria) this;
        }

        public Criteria andBxdkNotIn(List<Float> values) {
            addCriterion("bxdk not in", values, "bxdk");
            return (Criteria) this;
        }

        public Criteria andBxdkBetween(Float value1, Float value2) {
            addCriterion("bxdk between", value1, value2, "bxdk");
            return (Criteria) this;
        }

        public Criteria andBxdkNotBetween(Float value1, Float value2) {
            addCriterion("bxdk not between", value1, value2, "bxdk");
            return (Criteria) this;
        }

        public Criteria andCfdkIsNull() {
            addCriterion("cfdk is null");
            return (Criteria) this;
        }

        public Criteria andCfdkIsNotNull() {
            addCriterion("cfdk is not null");
            return (Criteria) this;
        }

        public Criteria andCfdkEqualTo(Float value) {
            addCriterion("cfdk =", value, "cfdk");
            return (Criteria) this;
        }

        public Criteria andCfdkNotEqualTo(Float value) {
            addCriterion("cfdk <>", value, "cfdk");
            return (Criteria) this;
        }

        public Criteria andCfdkGreaterThan(Float value) {
            addCriterion("cfdk >", value, "cfdk");
            return (Criteria) this;
        }

        public Criteria andCfdkGreaterThanOrEqualTo(Float value) {
            addCriterion("cfdk >=", value, "cfdk");
            return (Criteria) this;
        }

        public Criteria andCfdkLessThan(Float value) {
            addCriterion("cfdk <", value, "cfdk");
            return (Criteria) this;
        }

        public Criteria andCfdkLessThanOrEqualTo(Float value) {
            addCriterion("cfdk <=", value, "cfdk");
            return (Criteria) this;
        }

        public Criteria andCfdkIn(List<Float> values) {
            addCriterion("cfdk in", values, "cfdk");
            return (Criteria) this;
        }

        public Criteria andCfdkNotIn(List<Float> values) {
            addCriterion("cfdk not in", values, "cfdk");
            return (Criteria) this;
        }

        public Criteria andCfdkBetween(Float value1, Float value2) {
            addCriterion("cfdk between", value1, value2, "cfdk");
            return (Criteria) this;
        }

        public Criteria andCfdkNotBetween(Float value1, Float value2) {
            addCriterion("cfdk not between", value1, value2, "cfdk");
            return (Criteria) this;
        }

        public Criteria andQtdkIsNull() {
            addCriterion("qtdk is null");
            return (Criteria) this;
        }

        public Criteria andQtdkIsNotNull() {
            addCriterion("qtdk is not null");
            return (Criteria) this;
        }

        public Criteria andQtdkEqualTo(Float value) {
            addCriterion("qtdk =", value, "qtdk");
            return (Criteria) this;
        }

        public Criteria andQtdkNotEqualTo(Float value) {
            addCriterion("qtdk <>", value, "qtdk");
            return (Criteria) this;
        }

        public Criteria andQtdkGreaterThan(Float value) {
            addCriterion("qtdk >", value, "qtdk");
            return (Criteria) this;
        }

        public Criteria andQtdkGreaterThanOrEqualTo(Float value) {
            addCriterion("qtdk >=", value, "qtdk");
            return (Criteria) this;
        }

        public Criteria andQtdkLessThan(Float value) {
            addCriterion("qtdk <", value, "qtdk");
            return (Criteria) this;
        }

        public Criteria andQtdkLessThanOrEqualTo(Float value) {
            addCriterion("qtdk <=", value, "qtdk");
            return (Criteria) this;
        }

        public Criteria andQtdkIn(List<Float> values) {
            addCriterion("qtdk in", values, "qtdk");
            return (Criteria) this;
        }

        public Criteria andQtdkNotIn(List<Float> values) {
            addCriterion("qtdk not in", values, "qtdk");
            return (Criteria) this;
        }

        public Criteria andQtdkBetween(Float value1, Float value2) {
            addCriterion("qtdk between", value1, value2, "qtdk");
            return (Criteria) this;
        }

        public Criteria andQtdkNotBetween(Float value1, Float value2) {
            addCriterion("qtdk not between", value1, value2, "qtdk");
            return (Criteria) this;
        }

        public Criteria andJxgzIsNull() {
            addCriterion("jxgz is null");
            return (Criteria) this;
        }

        public Criteria andJxgzIsNotNull() {
            addCriterion("jxgz is not null");
            return (Criteria) this;
        }

        public Criteria andJxgzEqualTo(Float value) {
            addCriterion("jxgz =", value, "jxgz");
            return (Criteria) this;
        }

        public Criteria andJxgzNotEqualTo(Float value) {
            addCriterion("jxgz <>", value, "jxgz");
            return (Criteria) this;
        }

        public Criteria andJxgzGreaterThan(Float value) {
            addCriterion("jxgz >", value, "jxgz");
            return (Criteria) this;
        }

        public Criteria andJxgzGreaterThanOrEqualTo(Float value) {
            addCriterion("jxgz >=", value, "jxgz");
            return (Criteria) this;
        }

        public Criteria andJxgzLessThan(Float value) {
            addCriterion("jxgz <", value, "jxgz");
            return (Criteria) this;
        }

        public Criteria andJxgzLessThanOrEqualTo(Float value) {
            addCriterion("jxgz <=", value, "jxgz");
            return (Criteria) this;
        }

        public Criteria andJxgzIn(List<Float> values) {
            addCriterion("jxgz in", values, "jxgz");
            return (Criteria) this;
        }

        public Criteria andJxgzNotIn(List<Float> values) {
            addCriterion("jxgz not in", values, "jxgz");
            return (Criteria) this;
        }

        public Criteria andJxgzBetween(Float value1, Float value2) {
            addCriterion("jxgz between", value1, value2, "jxgz");
            return (Criteria) this;
        }

        public Criteria andJxgzNotBetween(Float value1, Float value2) {
            addCriterion("jxgz not between", value1, value2, "jxgz");
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