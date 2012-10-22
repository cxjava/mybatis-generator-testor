package mysqlibatis2.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.util.List;
import mysqlibatis2.pojo.Criteria;
import mysqlibatis2.pojo.Trade;
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
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject("trade.countByExample", example);
		return count;
	}

	public int deleteByExample(Criteria example) {
		int rows = getSqlMapClientTemplate().delete("trade.deleteByExample", example);
		return rows;
	}

	public int deleteByPrimaryKey(Integer id) {
		Trade _key = new Trade();
		_key.setId(id);
		int rows = getSqlMapClientTemplate().delete("trade.deleteByPrimaryKey", _key);
		return rows;
	}

	public Integer insert(Trade record) {
		Object newKey = getSqlMapClientTemplate().insert("trade.insert", record);
		return (Integer) newKey;
	}

	public Integer insertSelective(Trade record) {
		Object newKey = getSqlMapClientTemplate().insert("trade.insertSelective", record);
		return (Integer) newKey;
	}

	@SuppressWarnings("unchecked")
	public List<Trade> selectByExample(Criteria example) {
		List<Trade> list = getSqlMapClientTemplate().queryForList("trade.selectByExample", example);
		return list;
	}

	public Trade selectByPrimaryKey(Integer id) {
		Trade _key = new Trade();
		_key.setId(id);
		Trade record = (Trade) getSqlMapClientTemplate().queryForObject("trade.selectByPrimaryKey", _key);
		return record;
	}

	public int updateByExampleSelective(Trade record, Criteria example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("trade.updateByExampleSelective", parms);
		return rows;
	}

	public int updateByExample(Trade record, Criteria example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("trade.updateByExample", parms);
		return rows;
	}

	public int updateByPrimaryKeySelective(Trade record) {
		int rows = getSqlMapClientTemplate().update("trade.updateByPrimaryKeySelective", record);
		return rows;
	}

	public int updateByPrimaryKey(Trade record) {
		int rows = getSqlMapClientTemplate().update("trade.updateByPrimaryKey", record);
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