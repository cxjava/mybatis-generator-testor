package com.chenxin.j2ee.service.impl;

import com.chenxin.j2ee.dao.BaseUsersMapper;
import com.chenxin.j2ee.pojo.BaseUsers;
import com.chenxin.j2ee.pojo.Criteria;
import com.chenxin.j2ee.service.BaseUsersService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUsersServiceImpl implements BaseUsersService {
    @Autowired
    private BaseUsersMapper baseUsersMapper;

    private static final Logger logger = LoggerFactory.getLogger(BaseUsersServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.baseUsersMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public BaseUsers selectByPrimaryKey(Integer userId) {
        return this.baseUsersMapper.selectByPrimaryKey(userId);
    }

    public List<BaseUsers> selectByExample(Criteria example) {
        return this.baseUsersMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer userId) {
        return this.baseUsersMapper.deleteByPrimaryKey(userId);
    }

    public int updateByPrimaryKeySelective(BaseUsers record) {
        return this.baseUsersMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BaseUsers record) {
        return this.baseUsersMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.baseUsersMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(BaseUsers record, Criteria example) {
        return this.baseUsersMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(BaseUsers record, Criteria example) {
        return this.baseUsersMapper.updateByExample(record, example.getCondition());
    }

    public int insert(BaseUsers record) {
        return this.baseUsersMapper.insert(record);
    }

    public int insertSelective(BaseUsers record) {
        return this.baseUsersMapper.insertSelective(record);
    }
}