package mysqlmybatis.service;

import java.util.List;
import mysqlmybatis.pojo.Criteria;
import mysqlmybatis.pojo.Trade;

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

    int insert(Trade record);

    int insertSelective(Trade record);
}