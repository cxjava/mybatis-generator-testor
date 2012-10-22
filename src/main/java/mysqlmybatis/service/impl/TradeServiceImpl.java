package mysqlmybatis.service.impl;

import java.util.List;
import mysqlmybatis.dao.TradeMapper;
import mysqlmybatis.pojo.Criteria;
import mysqlmybatis.pojo.Trade;
import mysqlmybatis.service.TradeService;
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

    public Trade selectByPrimaryKey(Integer id) {
        return this.tradeMapper.selectByPrimaryKey(id);
    }

    public List<Trade> selectByExample(Criteria example) {
        return this.tradeMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
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
        return this.tradeMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(Trade record, Criteria example) {
        return this.tradeMapper.updateByExample(record, example.getCondition());
    }

    public int insert(Trade record) {
        return this.tradeMapper.insert(record);
    }

    public int insertSelective(Trade record) {
        return this.tradeMapper.insertSelective(record);
    }
}