package com.chenxin.j2ee.service;

import com.chenxin.j2ee.pojo.BaseRoles;
import com.chenxin.j2ee.pojo.Criteria;
import java.util.List;

public interface BaseRolesService {
    int countByExample(Criteria example);

    BaseRoles selectByPrimaryKey(Integer roleId);

    List<BaseRoles> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(BaseRoles record);

    int updateByPrimaryKey(BaseRoles record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(BaseRoles record, Criteria example);

    int updateByExample(BaseRoles record, Criteria example);

    int insert(BaseRoles record);

    int insertSelective(BaseRoles record);
}