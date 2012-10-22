package mysqlibatis2.pojo;

import java.io.Serializable;
import java.util.Date;

public class Trade implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Integer id;

	private String myaccount;

	/**
	 * 对方账户
	 */
	private String otheraccount;

	/**
	 * 交易类型：1汇入；2转出
	 */
	private String type;

	/**
	 * 交易金额
	 */
	private Double balance;

	/**
	 * 交易时间
	 */
	private Date time;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * @return 主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	public String getMyaccount() {
		return myaccount;
	}

	public void setMyaccount(String myaccount) {
		this.myaccount = myaccount;
	}

	/**
	 * @return 对方账户
	 */
	public String getOtheraccount() {
		return otheraccount;
	}

	/**
	 * @param otheraccount
	 *            对方账户
	 */
	public void setOtheraccount(String otheraccount) {
		this.otheraccount = otheraccount;
	}

	/**
	 * @return 交易类型：1汇入；2转出
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            交易类型：1汇入；2转出
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return 交易金额
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            交易金额
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * @return 交易时间
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time
	 *            交易时间
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return 备注
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
}