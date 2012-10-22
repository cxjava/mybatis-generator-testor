package mysqlibatis2.service.impl;

import java.util.List;
import mysqlibatis2.dao.TradeDAO;
import mysqlibatis2.pojo.Criteria;
import mysqlibatis2.pojo.Trade;
import mysqlibatis2.service.TradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeServiceImpl implements TradeService {
	@Autowired
	private TradeDAO tradeDAO;

	private static final Logger logger = LoggerFactory.getLogger(TradeServiceImpl.class);

	public int countByExample(Criteria example) {
		int count = this.tradeDAO.countByExample(example);
		logger.debug("count: {}", count);
		return count;
	}

	public Trade selectByPrimaryKey(Integer id) {
		return this.tradeDAO.selectByPrimaryKey(id);
	}

	public List<Trade> selectByExample(Criteria example) {
		return this.tradeDAO.selectByExample(example);
	}

	public int deleteByPrimaryKey(Integer id) {
		return this.tradeDAO.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Trade record) {
		return this.tradeDAO.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Trade record) {
		return this.tradeDAO.updateByPrimaryKey(record);
	}

	public int deleteByExample(Criteria example) {
		return this.tradeDAO.deleteByExample(example);
	}

	public int updateByExampleSelective(Trade record, Criteria example) {
		return this.tradeDAO.updateByExampleSelective(record, example);
	}

	public int updateByExample(Trade record, Criteria example) {
		return this.tradeDAO.updateByExample(record, example);
	}

	public Integer insert(Trade record) {
		return this.tradeDAO.insert(record);
	}

	public Integer insertSelective(Trade record) {
		return this.tradeDAO.insertSelective(record);
	}
}