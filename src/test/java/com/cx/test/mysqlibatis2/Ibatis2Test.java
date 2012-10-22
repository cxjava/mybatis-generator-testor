package com.cx.test.mysqlibatis2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mysqlibatis2.dao.TradeDAO;
import mysqlibatis2.pojo.Criteria;
import mysqlibatis2.pojo.Trade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * mybatis测试类
 * 
 * @author cx
 * @date 2011-7-21 下午1:56:43
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/config/spring-mysqlibatis2.xml" })
@TransactionConfiguration(defaultRollback = true)
public class Ibatis2Test extends AbstractTransactionalJUnit4SpringContextTests {
	private static final Logger logger = LoggerFactory.getLogger(Ibatis2Test.class);

	@Override
	@Resource(name = "mysqlDataSource")
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Autowired
	TradeDAO mapper;

	@Test
	public void countByExample() {
		int a = mapper.countByExample(new Criteria());
		logger.info("TestcountByExample() - int a=" + a);
		assertEquals(30, a);
	}

	@Test
	public void deleteByExample() {
		Criteria example = new Criteria();
		example.put("balance", 20);
		int result = mapper.deleteByExample(example);
		assertEquals(1, result);
		int a = mapper.countByExample(new Criteria());
		assertEquals(29, a);
	}

	@Test
	public void deleteByPrimaryKey() {
		int result = mapper.deleteByPrimaryKey(1);
		assertEquals(1, result);
		int a = mapper.countByExample(new Criteria());
		assertEquals(29, a);
	}

	@Test
	public void insert() {
		mapper.insert(getTrade().get(0));

		int a = mapper.countByExample(new Criteria());
		assertEquals(31, a);
	}

	@Test
	public void insertSelective() {
		mapper.insertSelective(getTrade().get(0));

//		mapper.insertSelective(getTrade().get(1));

		int a = mapper.countByExample(new Criteria());
		assertEquals(31, a);
	}

	@Test
	public void selectByExample() {
		Criteria example = new Criteria();
		example.put("balance", 20);
		example.setMysqlLength(20);
		example.setMysqlOffset(0);
		List<Trade> list = mapper.selectByExample(example);
		assertEquals(6, list.get(0).getId().intValue());
	}

	@Test
	public void selectByPrimaryKey() {
		Trade trade = mapper.selectByPrimaryKey(6);
		assertEquals("620105200901220002", trade.getMyaccount());
	}

	@Test
	public void updateByExampleSelective() {
		Criteria example = new Criteria();
		example.put("balance", 20);
		Trade trade = new Trade();
		trade.setBalance(11d);
		trade.setMyaccount("110");
		int result = mapper.updateByExampleSelective(trade, example);
		assertEquals(1, result);

		trade = mapper.selectByPrimaryKey(6);
		assertEquals("110", trade.getMyaccount());
	}

	@Test
	public void updateByExample() {
		Criteria example = new Criteria();
		example.put("balance", 20);
		Trade trade = new Trade();
		trade.setId(6);
		trade.setBalance(11d);
		trade.setMyaccount("110");
		int result = mapper.updateByExample(trade, example);
		assertEquals(1, result);

		trade = mapper.selectByPrimaryKey(6);
		assertEquals("110", trade.getMyaccount());
		assertEquals(null, trade.getRemark());
	}

	@Test
	public void updateByPrimaryKeySelective() {
		Trade trade = new Trade();
		trade.setId(6);
		trade.setBalance(11d);
		trade.setMyaccount("110");
		int result = mapper.updateByPrimaryKeySelective(trade);
		assertEquals(1, result);

		trade = mapper.selectByPrimaryKey(6);
		assertEquals("110", trade.getMyaccount());
	}

	@Test
	public void updateByPrimaryKey() {
		Trade trade = new Trade();
		trade.setId(6);
		trade.setBalance(11d);
		trade.setMyaccount("110");
		int result = mapper.updateByPrimaryKey(trade);
		assertEquals(1, result);

		trade = mapper.selectByPrimaryKey(6);
		assertEquals("110", trade.getMyaccount());
		assertEquals(null, trade.getRemark());
	}

	public List<Trade> getTrade() {
		List<Trade> list = new ArrayList<Trade>();
		for (int i = 0; i < 2; i++) {
			Trade trade = new Trade();
			trade.setId(i * 100);
			trade.setBalance(i * 3D);
			trade.setMyaccount("myaccount" + i);
			trade.setOtheraccount("otheraccount" + i);
			trade.setRemark("remark" + i);
			trade.setTime(new Date());
			trade.setType("type" + i);
			list.add(trade);
		}
		return list;
	}
}
