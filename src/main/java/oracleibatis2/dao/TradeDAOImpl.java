package oracleibatis2.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.util.List;
import oracleibatis2.pojo.Criteria;
import oracleibatis2.pojo.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class TradeDAOImpl extends SqlMapClientDaoSupport implements TradeDAO {

	@Autowired
	public TradeDAOImpl(SqlMapClient sqlMapClient) {
		super.setSqlMapClient(sqlMapClient);
	}

	public int countByExample(Criteria example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject("TRADE.countByExample", example);
		return count;
	}

	public int deleteByExample(Criteria example) {
		int rows = getSqlMapClientTemplate().delete("TRADE.deleteByExample", example);
		return rows;
	}

	public int deleteByPrimaryKey(String id) {
		Trade _key = new Trade();
		_key.setId(id);
		int rows = getSqlMapClientTemplate().delete("TRADE.deleteByPrimaryKey", _key);
		return rows;
	}

	public String insert(Trade record) {
		Object newKey = getSqlMapClientTemplate().insert("TRADE.insert", record);
		return (String) newKey;
	}

	public String insertSelective(Trade record) {
		Object newKey = getSqlMapClientTemplate().insert("TRADE.insertSelective", record);
		return (String) newKey;
	}

	@SuppressWarnings("unchecked")
	public List<Trade> selectByExample(Criteria example) {
		List<Trade> list = getSqlMapClientTemplate().queryForList("TRADE.selectByExample", example);
		return list;
	}

	public Trade selectByPrimaryKey(String id) {
		Trade _key = new Trade();
		_key.setId(id);
		Trade record = (Trade) getSqlMapClientTemplate().queryForObject("TRADE.selectByPrimaryKey", _key);
		return record;
	}

	public int updateByExampleSelective(Trade record, Criteria example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("TRADE.updateByExampleSelective", parms);
		return rows;
	}

	public int updateByExample(Trade record, Criteria example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("TRADE.updateByExample", parms);
		return rows;
	}

	public int updateByPrimaryKeySelective(Trade record) {
		int rows = getSqlMapClientTemplate().update("TRADE.updateByPrimaryKeySelective", record);
		return rows;
	}

	public int updateByPrimaryKey(Trade record) {
		int rows = getSqlMapClientTemplate().update("TRADE.updateByPrimaryKey", record);
		return rows;
	}

	protected static class UpdateByExampleParms extends Criteria {
		private Object record;

		public UpdateByExampleParms(Object record, Criteria example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}