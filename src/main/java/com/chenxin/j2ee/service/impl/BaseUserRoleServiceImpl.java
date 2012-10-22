package com.chenxin.j2ee.service.impl;

import com.chenxin.j2ee.dao.BaseUserRoleMapper;
import com.chenxin.j2ee.pojo.BaseUserRole;
import com.chenxin.j2ee.pojo.Criteria;
import com.chenxin.j2ee.service.BaseUserRoleService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUserRoleServiceImpl implements BaseUserRoleService {
    @Autowired
    private BaseUserRoleMapper baseUserRoleMapper;

    private static final Logger logger = LoggerFactory.getLogger(BaseUserRoleServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.baseUserRoleMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public BaseUserRole selectByPrimaryKey(Integer userRoleId) {
        return this.baseUserRoleMapper.selectByPrimaryKey(userRoleId);
    }

    public List<BaseUserRole> selectByExample(Criteria example) {
        return this.baseUserRoleMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer userRoleId) {
        return this.baseUserRoleMapper.deleteByPrimaryKey(userRoleId);
    }

    public int updateByPrimaryKeySelective(BaseUserRole record) {
        return this.baseUserRoleMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BaseUserRole record) {
        return this.baseUserRoleMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.baseUserRoleMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(BaseUserRole record, Criteria example) {
        return this.baseUserRoleMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(BaseUserRole record, Criteria example) {
        return this.baseUserRoleMapper.updateByExample(record, example.getCondition());
    }

    public int insert(BaseUserRole record) {
        return this.baseUserRoleMapper.insert(record);
    }

    public int insertSelective(BaseUserRole record) {
        return this.baseUserRoleMapper.insertSelective(record);
    }
}