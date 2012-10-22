package oracleibatis2.service;

import java.util.List;
import oracleibatis2.pojo.Criteria;
import oracleibatis2.pojo.Trade;

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

	String insert(Trade record);

	String insertSelective(Trade record);
}