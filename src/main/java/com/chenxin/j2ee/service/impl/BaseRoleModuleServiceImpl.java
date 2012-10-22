package com.chenxin.j2ee.service.impl;

import com.chenxin.j2ee.dao.BaseRoleModuleMapper;
import com.chenxin.j2ee.pojo.BaseRoleModule;
import com.chenxin.j2ee.pojo.Criteria;
import com.chenxin.j2ee.service.BaseRoleModuleService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseRoleModuleServiceImpl implements BaseRoleModuleService {
    @Autowired
    private BaseRoleModuleMapper baseRoleModuleMapper;

    private static final Logger logger = LoggerFactory.getLogger(BaseRoleModuleServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.baseRoleModuleMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public BaseRoleModule selectByPrimaryKey(Integer roleModuleId) {
        return this.baseRoleModuleMapper.selectByPrimaryKey(roleModuleId);
    }

    public List<BaseRoleModule> selectByExample(Criteria example) {
        return this.baseRoleModuleMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer roleModuleId) {
        return this.baseRoleModuleMapper.deleteByPrimaryKey(roleModuleId);
    }

    public int updateByPrimaryKeySelective(BaseRoleModule record) {
        return this.baseRoleModuleMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BaseRoleModule record) {
        return this.baseRoleModuleMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.baseRoleModuleMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(BaseRoleModule record, Criteria example) {
        return this.baseRoleModuleMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(BaseRoleModule record, Criteria example) {
        return this.baseRoleModuleMapper.updateByExample(record, example.getCondition());
    }

    public int insert(BaseRoleModule record) {
        return this.baseRoleModuleMapper.insert(record);
    }

    public int insertSelective(BaseRoleModule record) {
        return this.baseRoleModuleMapper.insertSelective(record);
    }
}