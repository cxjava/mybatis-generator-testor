package com.chenxin.j2ee.service;

import com.chenxin.j2ee.pojo.BaseUserRole;
import com.chenxin.j2ee.pojo.Criteria;
import java.util.List;

public interface BaseUserRoleService {
    int countByExample(Criteria example);

    BaseUserRole selectByPrimaryKey(Integer userRoleId);

    List<BaseUserRole> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer userRoleId);

    int updateByPrimaryKeySelective(BaseUserRole record);

    int updateByPrimaryKey(BaseUserRole record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(BaseUserRole record, Criteria example);

    int updateByExample(BaseUserRole record, Criteria example);

    int insert(BaseUserRole record);

    int insertSelective(BaseUserRole record);
}