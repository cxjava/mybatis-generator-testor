package com.chenxin.j2ee.service;

import com.chenxin.j2ee.pojo.BaseUsers;
import com.chenxin.j2ee.pojo.Criteria;
import java.util.List;

public interface BaseUsersService {
    int countByExample(Criteria example);

    BaseUsers selectByPrimaryKey(Integer userId);

    List<BaseUsers> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(BaseUsers record);

    int updateByPrimaryKey(BaseUsers record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(BaseUsers record, Criteria example);

    int updateByExample(BaseUsers record, Criteria example);

    int insert(BaseUsers record);

    int insertSelective(BaseUsers record);
}