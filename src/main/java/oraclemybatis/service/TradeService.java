package oraclemybatis.service;

import java.util.List;
import oraclemybatis.pojo.Criteria;
import oraclemybatis.pojo.Trade;

public interface TradeService {
	int countByExample(Criteria example);

	Trade selectByPrimaryKey(String id);

	List<Trade> selectByExample(Criteria example);

	int deleteByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Trade record);

	int updateByPrimaryKey(Trade record);

	int deleteByExample(Criteria example);

	int updateByExampleSelective(Trade record, Criteria example);

	int updateByExample(Trade record, Criteria example);

	int insert(Trade record);

	int insertSelective(Trade record);
}