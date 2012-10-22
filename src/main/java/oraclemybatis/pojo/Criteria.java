package oraclemybatis.pojo;

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

	private Integer oracleStart;

	private Integer oracleEnd;

	protected Criteria(Criteria example) {
		this.orderByClause = example.orderByClause;
		this.condition = example.condition;
		this.distinct = example.distinct;
		this.oracleStart = example.oracleStart;
		this.oracleEnd = example.oracleEnd;
	}

	public Criteria() {
		condition = new HashMap<String, Object>();
	}

	public void clear() {
		condition.clear();
		orderByClause = null;
		distinct = false;
		this.oracleStart = null;
		this.oracleEnd = null;
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

	@Deprecated
	public void setCondition(Map<String, Object> condition) {
		this.condition = condition;
	}

	@Deprecated
	public Map<String, Object> getCondition() {
		return condition;
	}

	/**
	 * @param oracleStart
	 *            开始记录数
	 */
	public void setOracleStart(Integer oracleStart) {
		this.oracleStart = oracleStart;
	}

	/**
	 * @param oracleEnd
	 *            结束记录数
	 */
	public void setOracleEnd(Integer oracleEnd) {
		this.oracleEnd = oracleEnd;
	}
}