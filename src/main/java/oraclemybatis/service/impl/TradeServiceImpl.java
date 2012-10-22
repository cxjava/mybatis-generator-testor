package oraclemybatis.service.impl;

import java.util.List;
import oraclemybatis.dao.TradeMapper;
import oraclemybatis.pojo.Criteria;
import oraclemybatis.pojo.Trade;
import oraclemybatis.service.TradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeServiceImpl implements TradeService {
	@Autowired
	private TradeMapper tradeMapper;

	private static final Logger logger = LoggerFactory.getLogger(TradeServiceImpl.class);

	public int countByExample(Criteria example) {
		int count = this.tradeMapper.countByExample(example);
		logger.debug("count: {}", count);
		return count;
	}

	public Trade selectByPrimaryKey(String id) {
		return this.tradeMapper.selectByPrimaryKey(id);
	}

	public List<Trade> selectByExample(Criteria example) {
		return this.tradeMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		return this.tradeMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Trade record) {
		return this.tradeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Trade record) {
		return this.tradeMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(Criteria example) {
		return this.tradeMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Trade record, Criteria example) {
		return this.tradeMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Trade record, Criteria example) {
		return this.tradeMapper.updateByExample(record, example);
	}

	public int insert(Trade record) {
		return this.tradeMapper.insert(record);
	}

	public int insertSelective(Trade record) {
		return this.tradeMapper.insertSelective(record);
	}
}