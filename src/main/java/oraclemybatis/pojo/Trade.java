package oraclemybatis.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ORACLE交易表
 */
public class Trade implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 我的帐户
	 */
	private String myaccount;

	private String remark;

	/**
	 * 金额
	 */
	private String type;

	private Date time;

	/**
	 * 备注
	 */
	private String otheraccount;

	/**
	 * 时间
	 */
	private BigDecimal balance;

	/**
	 * @return 主键
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            主键
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return 我的帐户
	 */
	public String getMyaccount() {
		return myaccount;
	}

	/**
	 * @param myaccount
	 *            我的帐户
	 */
	public void setMyaccount(String myaccount) {
		this.myaccount = myaccount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return 金额
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            金额
	 */
	public void setType(String type) {
		this.type = type;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return 备注
	 */
	public String getOtheraccount() {
		return otheraccount;
	}

	/**
	 * @param otheraccount
	 *            备注
	 */
	public void setOtheraccount(String otheraccount) {
		this.otheraccount = otheraccount;
	}

	/**
	 * @return 时间
	 */
	public BigDecimal getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            时间
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}