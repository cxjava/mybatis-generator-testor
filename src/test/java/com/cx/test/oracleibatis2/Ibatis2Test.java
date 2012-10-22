package com.cx.test.oracleibatis2;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import oracleibatis2.dao.TradeDAO;
import oracleibatis2.pojo.Criteria;
import oracleibatis2.pojo.Trade;

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
@ContextConfiguration(locations = { "classpath:/config/spring-oracleibatis2.xml" })
@TransactionConfiguration(defaultRollback = true)
public class Ibatis2Test extends AbstractTransactionalJUnit4SpringContextTests {
	private static final Logger logger = LoggerFactory.getLogger(Ibatis2Test.class);

	@Override
	@Resource(name = "oracleDataSource")
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Autowired
	TradeDAO tradeDao;

	@Test
	public void countByExample() {
		int a = tradeDao.countByExample(new Criteria());
		logger.info("TestcountByExample() - int a=" + a);
		assertEquals(2, a);
	}

	@Test
	public void deleteByExample() {
		Criteria example = new Criteria();
		example.put("balance",123);
		int result = tradeDao.deleteByExample(example);
		assertEquals(1, result);
		int a = tradeDao.countByExample(new Criteria());
		assertEquals(1, a);
	}

	@Test
	public void deleteByPrimaryKey() {
		int result = tradeDao.deleteByPrimaryKey("1");
		assertEquals(1, result);
		int a = tradeDao.countByExample(new Criteria());
		assertEquals(1, a);
	}

	@Test
	public void insert() {
		tradeDao.insert(getTrade().get(0));

		int a = tradeDao.countByExample(new Criteria());
		assertEquals(3, a);
	}

	@Test
	public void insertSelective() {
		Trade trade1=getTrade().get(0);
		Trade trade2=getTrade().get(1);
		trade1.setId(null);
		trade2.setId(null);
		tradeDao.insertSelective(trade1);

		logger.info(trade1.getId());
		tradeDao.insertSelective(trade2);
		logger.info(trade2.getId());
		
		int a = tradeDao.countByExample(new Criteria());
		assertEquals(4, a);
	}

	@Test
	public void selectByExample() {
		Criteria example = new Criteria();
		example.put("balance", 123);
		example.setOracleStart(0);
		example.setOracleEnd(10);
		List<Trade> list = tradeDao.selectByExample(example);
		assertEquals("1", list.get(0).getId());
	}

	@Test
	public void selectByPrimaryKey() {
		Trade trade = tradeDao.selectByPrimaryKey("1");
		assertEquals("abc", trade.getMyaccount());
	}

	@Test
	public void updateByExampleSelective() {
		Criteria example = new Criteria();
		example.put("balance", 123);
		Trade trade = new Trade();
		trade.setBalance(new BigDecimal(12));
		trade.setMyaccount("110");
		int result = tradeDao.updateByExampleSelective(trade, example);
		assertEquals(1, result);

		trade = tradeDao.selectByPrimaryKey("1");
		assertEquals("110", trade.getMyaccount());
	}

	@Test
	public void updateByExample() {
		Criteria example = new Criteria();
		example.put("balance", 123);
		Trade trade = new Trade();
		trade.setId("1");
		trade.setBalance(new BigDecimal(123));
		trade.setMyaccount("110");
		int result = tradeDao.updateByExample(trade, example);
		assertEquals(1, result);

		trade = tradeDao.selectByPrimaryKey("1");
		assertEquals("110", trade.getMyaccount());
		assertEquals(null, trade.getRemark());
	}

	@Test
	public void updateByPrimaryKeySelective() {
		Trade trade = new Trade();
		trade.setId("1");
		trade.setBalance(new BigDecimal(123));
		trade.setMyaccount("110");
		int result = tradeDao.updateByPrimaryKeySelective(trade);
		assertEquals(1, result);

		trade = tradeDao.selectByPrimaryKey("1");
		assertEquals("110", trade.getMyaccount());
	}

	@Test
	public void updateByPrimaryKey() {
		Trade trade = new Trade();
		trade.setId("1");
		trade.setBalance(new BigDecimal(123));
		trade.setMyaccount("110");
		int result = tradeDao.updateByPrimaryKey(trade);
		assertEquals(1, result);

		trade = tradeDao.selectByPrimaryKey("1");
		assertEquals("110", trade.getMyaccount());
		assertEquals(null, trade.getRemark());
	}

	public List<Trade> getTrade() {
		List<Trade> list = new ArrayList<Trade>();
		for (int i = 0; i < 2; i++) {
			Trade trade = new Trade();
			trade.setId(i * 100l+"");
			trade.setBalance(new BigDecimal(i*3));
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
