package com.chenxin.j2ee.service;

import com.chenxin.j2ee.pojo.BaseRoleModule;
import com.chenxin.j2ee.pojo.Criteria;
import java.util.List;

public interface BaseRoleModuleService {
    int countByExample(Criteria example);

    BaseRoleModule selectByPrimaryKey(Integer roleModuleId);

    List<BaseRoleModule> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer roleModuleId);

    int updateByPrimaryKeySelective(BaseRoleModule record);

    int updateByPrimaryKey(BaseRoleModule record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(BaseRoleModule record, Criteria example);

    int updateByExample(BaseRoleModule record, Criteria example);

    int insert(BaseRoleModule record);

    int insertSelective(BaseRoleModule record);
}