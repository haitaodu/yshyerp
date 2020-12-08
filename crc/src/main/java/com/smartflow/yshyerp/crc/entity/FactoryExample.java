package com.smartflow.yshyerp.crc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FactoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Factory
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Factory
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Factory
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public FactoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Factory
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Factory
     *
     * @mbggenerated
     */
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFactorycodeIsNull() {
            addCriterion("FactoryCode is null");
            return (Criteria) this;
        }

        public Criteria andFactorycodeIsNotNull() {
            addCriterion("FactoryCode is not null");
            return (Criteria) this;
        }

        public Criteria andFactorycodeEqualTo(String value) {
            addCriterion("FactoryCode =", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeNotEqualTo(String value) {
            addCriterion("FactoryCode <>", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeGreaterThan(String value) {
            addCriterion("FactoryCode >", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeGreaterThanOrEqualTo(String value) {
            addCriterion("FactoryCode >=", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeLessThan(String value) {
            addCriterion("FactoryCode <", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeLessThanOrEqualTo(String value) {
            addCriterion("FactoryCode <=", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeLike(String value) {
            addCriterion("FactoryCode like", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeNotLike(String value) {
            addCriterion("FactoryCode not like", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeIn(List<String> values) {
            addCriterion("FactoryCode in", values, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeNotIn(List<String> values) {
            addCriterion("FactoryCode not in", values, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeBetween(String value1, String value2) {
            addCriterion("FactoryCode between", value1, value2, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeNotBetween(String value1, String value2) {
            addCriterion("FactoryCode not between", value1, value2, "factorycode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("CompanyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("CompanyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("CompanyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("CompanyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("CompanyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CompanyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("CompanyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("CompanyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("CompanyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("CompanyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("CompanyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("CompanyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("CreatorId is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("CreatorId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(Integer value) {
            addCriterion("CreatorId =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(Integer value) {
            addCriterion("CreatorId <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(Integer value) {
            addCriterion("CreatorId >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreatorId >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(Integer value) {
            addCriterion("CreatorId <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(Integer value) {
            addCriterion("CreatorId <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<Integer> values) {
            addCriterion("CreatorId in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<Integer> values) {
            addCriterion("CreatorId not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(Integer value1, Integer value2) {
            addCriterion("CreatorId between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("CreatorId not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeIsNull() {
            addCriterion("CreationDateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeIsNotNull() {
            addCriterion("CreationDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeEqualTo(Date value) {
            addCriterion("CreationDateTime =", value, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeNotEqualTo(Date value) {
            addCriterion("CreationDateTime <>", value, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeGreaterThan(Date value) {
            addCriterion("CreationDateTime >", value, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreationDateTime >=", value, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeLessThan(Date value) {
            addCriterion("CreationDateTime <", value, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreationDateTime <=", value, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeIn(List<Date> values) {
            addCriterion("CreationDateTime in", values, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeNotIn(List<Date> values) {
            addCriterion("CreationDateTime not in", values, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeBetween(Date value1, Date value2) {
            addCriterion("CreationDateTime between", value1, value2, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andCreationdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreationDateTime not between", value1, value2, "creationdatetime");
            return (Criteria) this;
        }

        public Criteria andEditoridIsNull() {
            addCriterion("EditorId is null");
            return (Criteria) this;
        }

        public Criteria andEditoridIsNotNull() {
            addCriterion("EditorId is not null");
            return (Criteria) this;
        }

        public Criteria andEditoridEqualTo(Integer value) {
            addCriterion("EditorId =", value, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditoridNotEqualTo(Integer value) {
            addCriterion("EditorId <>", value, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditoridGreaterThan(Integer value) {
            addCriterion("EditorId >", value, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("EditorId >=", value, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditoridLessThan(Integer value) {
            addCriterion("EditorId <", value, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditoridLessThanOrEqualTo(Integer value) {
            addCriterion("EditorId <=", value, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditoridIn(List<Integer> values) {
            addCriterion("EditorId in", values, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditoridNotIn(List<Integer> values) {
            addCriterion("EditorId not in", values, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditoridBetween(Integer value1, Integer value2) {
            addCriterion("EditorId between", value1, value2, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditoridNotBetween(Integer value1, Integer value2) {
            addCriterion("EditorId not between", value1, value2, "editorid");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeIsNull() {
            addCriterion("EditDateTime is null");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeIsNotNull() {
            addCriterion("EditDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeEqualTo(Date value) {
            addCriterion("EditDateTime =", value, "editdatetime");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeNotEqualTo(Date value) {
            addCriterion("EditDateTime <>", value, "editdatetime");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeGreaterThan(Date value) {
            addCriterion("EditDateTime >", value, "editdatetime");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EditDateTime >=", value, "editdatetime");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeLessThan(Date value) {
            addCriterion("EditDateTime <", value, "editdatetime");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("EditDateTime <=", value, "editdatetime");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeIn(List<Date> values) {
            addCriterion("EditDateTime in", values, "editdatetime");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeNotIn(List<Date> values) {
            addCriterion("EditDateTime not in", values, "editdatetime");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeBetween(Date value1, Date value2) {
            addCriterion("EditDateTime between", value1, value2, "editdatetime");
            return (Criteria) this;
        }

        public Criteria andEditdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("EditDateTime not between", value1, value2, "editdatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Factory
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Factory
     *
     * @mbggenerated
     */
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