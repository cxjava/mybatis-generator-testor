package com.chenxin.j2ee.service.impl;

import com.chenxin.j2ee.dao.BaseRolesMapper;
import com.chenxin.j2ee.pojo.BaseRoles;
import com.chenxin.j2ee.pojo.Criteria;
import com.chenxin.j2ee.service.BaseRolesService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseRolesServiceImpl implements BaseRolesService {
    @Autowired
    private BaseRolesMapper baseRolesMapper;

    private static final Logger logger = LoggerFactory.getLogger(BaseRolesServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.baseRolesMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public BaseRoles selectByPrimaryKey(Integer roleId) {
        return this.baseRolesMapper.selectByPrimaryKey(roleId);
    }

    public List<BaseRoles> selectByExample(Criteria example) {
        return this.baseRolesMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer roleId) {
        return this.baseRolesMapper.deleteByPrimaryKey(roleId);
    }

    public int updateByPrimaryKeySelective(BaseRoles record) {
        return this.baseRolesMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BaseRoles record) {
        return this.baseRolesMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.baseRolesMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(BaseRoles record, Criteria example) {
        return this.baseRolesMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(BaseRoles record, Criteria example) {
        return this.baseRolesMapper.updateByExample(record, example.getCondition());
    }

    public int insert(BaseRoles record) {
        return this.baseRolesMapper.insert(record);
    }

    public int insertSelective(BaseRoles record) {
        return this.baseRolesMapper.insertSelective(record);
    }
}