package com.chenxin.j2ee.dao;

import com.chenxin.j2ee.pojo.BasePermission;
import com.chenxin.j2ee.pojo.Criteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface BasePermissionMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer permissionId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(BasePermission record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(BasePermission record);

    /**
     * 根据条件查询记录集
     */
    List<BasePermission> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    BasePermission selectByPrimaryKey(Integer permissionId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") BasePermission record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") BasePermission record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(BasePermission record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(BasePermission record);
}