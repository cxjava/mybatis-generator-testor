package com.chenxin.j2ee.pojo;

import java.io.Serializable;

public class BaseUserRole implements Serializable {
    private static final long serialVersionUID = 536959797038170263L;

    /**
     * 用户角色ID
     */
    private Integer userRoleId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * @return 用户角色ID
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * @param userRoleId 
	 *            用户角色ID
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * @return 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId 
	 *            用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return 角色ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId 
	 *            角色ID
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}