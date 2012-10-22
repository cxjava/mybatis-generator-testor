package mysqlmybatis.dao;

import java.util.List;
import java.util.Map;
import mysqlmybatis.pojo.Criteria;
import mysqlmybatis.pojo.Trade;
import org.apache.ibatis.annotations.Param;

public interface TradeMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Trade record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Trade record);

    /**
     * 根据条件查询记录集
     */
    List<Trade> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    Trade selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") Trade record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") Trade record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Trade record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Trade record);
}