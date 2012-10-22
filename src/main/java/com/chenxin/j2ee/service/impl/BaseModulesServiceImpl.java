package com.chenxin.j2ee.service.impl;

import com.chenxin.j2ee.dao.BaseModulesMapper;
import com.chenxin.j2ee.pojo.BaseModules;
import com.chenxin.j2ee.pojo.Criteria;
import com.chenxin.j2ee.service.BaseModulesService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseModulesServiceImpl implements BaseModulesService {
    @Autowired
    private BaseModulesMapper baseModulesMapper;

    private static final Logger logger = LoggerFactory.getLogger(BaseModulesServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.baseModulesMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public BaseModules selectByPrimaryKey(Integer moduleId) {
        return this.baseModulesMapper.selectByPrimaryKey(moduleId);
    }

    public List<BaseModules> selectByExample(Criteria example) {
        return this.baseModulesMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer moduleId) {
        return this.baseModulesMapper.deleteByPrimaryKey(moduleId);
    }

    public int updateByPrimaryKeySelective(BaseModules record) {
        return this.baseModulesMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BaseModules record) {
        return this.baseModulesMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.baseModulesMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(BaseModules record, Criteria example) {
        return this.baseModulesMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(BaseModules record, Criteria example) {
        return this.baseModulesMapper.updateByExample(record, example.getCondition());
    }

    public int insert(BaseModules record) {
        return this.baseModulesMapper.insert(record);
    }

    public int insertSelective(BaseModules record) {
        return this.baseModulesMapper.insertSelective(record);
    }
}