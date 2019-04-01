package mybatis.generate.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionLogsecureExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    public TransactionLogsecureExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
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
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
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

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdIsNull() {
            addCriterion("from_wallet_id is null");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdIsNotNull() {
            addCriterion("from_wallet_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdEqualTo(Long value) {
            addCriterion("from_wallet_id =", value, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdNotEqualTo(Long value) {
            addCriterion("from_wallet_id <>", value, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdGreaterThan(Long value) {
            addCriterion("from_wallet_id >", value, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdGreaterThanOrEqualTo(Long value) {
            addCriterion("from_wallet_id >=", value, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdLessThan(Long value) {
            addCriterion("from_wallet_id <", value, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdLessThanOrEqualTo(Long value) {
            addCriterion("from_wallet_id <=", value, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdIn(List<Long> values) {
            addCriterion("from_wallet_id in", values, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdNotIn(List<Long> values) {
            addCriterion("from_wallet_id not in", values, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdBetween(Long value1, Long value2) {
            addCriterion("from_wallet_id between", value1, value2, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andFromWalletIdNotBetween(Long value1, Long value2) {
            addCriterion("from_wallet_id not between", value1, value2, "fromWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdIsNull() {
            addCriterion("to_wallet_id is null");
            return (Criteria) this;
        }

        public Criteria andToWalletIdIsNotNull() {
            addCriterion("to_wallet_id is not null");
            return (Criteria) this;
        }

        public Criteria andToWalletIdEqualTo(Long value) {
            addCriterion("to_wallet_id =", value, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdNotEqualTo(Long value) {
            addCriterion("to_wallet_id <>", value, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdGreaterThan(Long value) {
            addCriterion("to_wallet_id >", value, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdGreaterThanOrEqualTo(Long value) {
            addCriterion("to_wallet_id >=", value, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdLessThan(Long value) {
            addCriterion("to_wallet_id <", value, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdLessThanOrEqualTo(Long value) {
            addCriterion("to_wallet_id <=", value, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdIn(List<Long> values) {
            addCriterion("to_wallet_id in", values, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdNotIn(List<Long> values) {
            addCriterion("to_wallet_id not in", values, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdBetween(Long value1, Long value2) {
            addCriterion("to_wallet_id between", value1, value2, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andToWalletIdNotBetween(Long value1, Long value2) {
            addCriterion("to_wallet_id not between", value1, value2, "toWalletId");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNull() {
            addCriterion("asset_name is null");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNotNull() {
            addCriterion("asset_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNameEqualTo(String value) {
            addCriterion("asset_name =", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotEqualTo(String value) {
            addCriterion("asset_name <>", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThan(String value) {
            addCriterion("asset_name >", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThanOrEqualTo(String value) {
            addCriterion("asset_name >=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThan(String value) {
            addCriterion("asset_name <", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThanOrEqualTo(String value) {
            addCriterion("asset_name <=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLike(String value) {
            addCriterion("asset_name like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotLike(String value) {
            addCriterion("asset_name not like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameIn(List<String> values) {
            addCriterion("asset_name in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotIn(List<String> values) {
            addCriterion("asset_name not in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameBetween(String value1, String value2) {
            addCriterion("asset_name between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotBetween(String value1, String value2) {
            addCriterion("asset_name not between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetQtyIsNull() {
            addCriterion("asset_qty is null");
            return (Criteria) this;
        }

        public Criteria andAssetQtyIsNotNull() {
            addCriterion("asset_qty is not null");
            return (Criteria) this;
        }

        public Criteria andAssetQtyEqualTo(Integer value) {
            addCriterion("asset_qty =", value, "assetQty");
            return (Criteria) this;
        }

        public Criteria andAssetQtyNotEqualTo(Integer value) {
            addCriterion("asset_qty <>", value, "assetQty");
            return (Criteria) this;
        }

        public Criteria andAssetQtyGreaterThan(Integer value) {
            addCriterion("asset_qty >", value, "assetQty");
            return (Criteria) this;
        }

        public Criteria andAssetQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("asset_qty >=", value, "assetQty");
            return (Criteria) this;
        }

        public Criteria andAssetQtyLessThan(Integer value) {
            addCriterion("asset_qty <", value, "assetQty");
            return (Criteria) this;
        }

        public Criteria andAssetQtyLessThanOrEqualTo(Integer value) {
            addCriterion("asset_qty <=", value, "assetQty");
            return (Criteria) this;
        }

        public Criteria andAssetQtyIn(List<Integer> values) {
            addCriterion("asset_qty in", values, "assetQty");
            return (Criteria) this;
        }

        public Criteria andAssetQtyNotIn(List<Integer> values) {
            addCriterion("asset_qty not in", values, "assetQty");
            return (Criteria) this;
        }

        public Criteria andAssetQtyBetween(Integer value1, Integer value2) {
            addCriterion("asset_qty between", value1, value2, "assetQty");
            return (Criteria) this;
        }

        public Criteria andAssetQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("asset_qty not between", value1, value2, "assetQty");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transaction_logsecure
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transaction_logsecure
     *
     * @mbg.generated
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