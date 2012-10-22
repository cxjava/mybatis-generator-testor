package com.chenxin.j2ee.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * 公用条件查询类
 */
public class Criteria {
    /**
     * 存放条件查询值
     */
    private Map<String, Object> condition;

    /**
     * 是否相异
     */
    protected boolean distinct;

    /**
     * 排序字段
     */
    protected String orderByClause;

    /**
     * 每页大小，即mysql中的length
     */
    private Integer limit;

    /**
     * 开始行数，即mysql中的offset
     */
    private Integer start;

    protected Criteria(Criteria example) {
        this.orderByClause = example.orderByClause;
        this.condition = example.condition;
        this.distinct = example.distinct;
        this.limit = example.limit;
        this.start = example.start;
    }

    public Criteria() {
        this.condition = new HashMap<String, Object>();
    }

    public void clear() {
        this.condition.clear();
        this.orderByClause = null;
        this.distinct = false;
        this.limit=null;
        this.start=null;
    }

    /**
     * @param condition 
	 *            查询的条件名称
	 * @param value
	 *            查询的值
     */
    public Criteria put(String condition, Object value) {
        this.condition.put(condition, value);
        return (Criteria) this;
    }

    /**
     * @param orderByClause 
	 *            排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @param distinct 
	 *            是否相异
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public void setCondition(Map<String, Object> condition) {
        this.condition = condition;
    }

    public Map<String, Object> getCondition() {
        return condition;
    }

    /**
     * @param limit 
	 *            每页大小，即mysql中的length
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @param start 
	 *            开始行数，即mysql中的offset
     */
    public void setStart(Integer start) {
        this.start = start;
    }
}