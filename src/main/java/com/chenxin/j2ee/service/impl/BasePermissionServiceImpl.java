package com.chenxin.j2ee.service.impl;

import com.chenxin.j2ee.dao.BasePermissionMapper;
import com.chenxin.j2ee.pojo.BasePermission;
import com.chenxin.j2ee.pojo.Criteria;
import com.chenxin.j2ee.service.BasePermissionService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasePermissionServiceImpl implements BasePermissionService {
    @Autowired
    private BasePermissionMapper basePermissionMapper;

    private static final Logger logger = LoggerFactory.getLogger(BasePermissionServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.basePermissionMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public BasePermission selectByPrimaryKey(Integer permissionId) {
        return this.basePermissionMapper.selectByPrimaryKey(permissionId);
    }

    public List<BasePermission> selectByExample(Criteria example) {
        return this.basePermissionMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer permissionId) {
        return this.basePermissionMapper.deleteByPrimaryKey(permissionId);
    }

    public int updateByPrimaryKeySelective(BasePermission record) {
        return this.basePermissionMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BasePermission record) {
        return this.basePermissionMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.basePermissionMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(BasePermission record, Criteria example) {
        return this.basePermissionMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(BasePermission record, Criteria example) {
        return this.basePermissionMapper.updateByExample(record, example.getCondition());
    }

    public int insert(BasePermission record) {
        return this.basePermissionMapper.insert(record);
    }

    public int insertSelective(BasePermission record) {
        return this.basePermissionMapper.insertSelective(record);
    }
}