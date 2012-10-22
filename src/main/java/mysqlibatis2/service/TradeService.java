package mysqlibatis2.service;

import java.util.List;
import mysqlibatis2.pojo.Criteria;
import mysqlibatis2.pojo.Trade;

public interface TradeService {
	int countByExample(Criteria example);

	Trade selectByPrimaryKey(Integer id);

	List<Trade> selectByExample(Criteria example);

	int deleteByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Trade record);

	int updateByPrimaryKey(Trade record);

	int deleteByExample(Criteria example);

	int updateByExampleSelective(Trade record, Criteria example);

	int updateByExample(Trade record, Criteria example);

	Integer insert(Trade record);

	Integer insertSelective(Trade record);
}