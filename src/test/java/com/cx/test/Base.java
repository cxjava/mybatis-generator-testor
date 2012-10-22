package com.cx.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * 基本测试类
 * 
 * @author QQ:34847009
 * @date 2010-12-30 下午04:34:17
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext*.xml" })
@TransactionConfiguration(defaultRollback = true)
public class Base extends AbstractTransactionalJUnit4SpringContextTests {

}
