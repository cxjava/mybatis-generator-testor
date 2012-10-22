package com.chenxin.j2ee.service;

import com.chenxin.j2ee.pojo.BaseModules;
import com.chenxin.j2ee.pojo.Criteria;
import java.util.List;

public interface BaseModulesService {
    int countByExample(Criteria example);

    BaseModules selectByPrimaryKey(Integer moduleId);

    List<BaseModules> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer moduleId);

    int updateByPrimaryKeySelective(BaseModules record);

    int updateByPrimaryKey(BaseModules record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(BaseModules record, Criteria example);

    int updateByExample(BaseModules record, Criteria example);

    int insert(BaseModules record);

    int insertSelective(BaseModules record);
}