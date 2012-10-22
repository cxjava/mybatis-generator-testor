package com.chenxin.j2ee.service;

import com.chenxin.j2ee.pojo.BasePermission;
import com.chenxin.j2ee.pojo.Criteria;
import java.util.List;

public interface BasePermissionService {
    int countByExample(Criteria example);

    BasePermission selectByPrimaryKey(Integer permissionId);

    List<BasePermission> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(BasePermission record);

    int updateByPrimaryKey(BasePermission record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(BasePermission record, Criteria example);

    int updateByExample(BasePermission record, Criteria example);

    int insert(BasePermission record);

    int insertSelective(BasePermission record);
}