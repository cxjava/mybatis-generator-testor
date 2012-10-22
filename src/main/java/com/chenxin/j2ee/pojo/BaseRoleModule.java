package com.chenxin.j2ee.pojo;

import java.io.Serializable;

public class BaseRoleModule implements Serializable {
    private static final long serialVersionUID = 695123385894459383L;

    /**
     * 角色模块ID
     */
    private Integer roleModuleId;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 模块ID
     */
    private Integer moduleId;

    /**
     * @return 角色模块ID
     */
    public Integer getRoleModuleId() {
        return roleModuleId;
    }

    /**
     * @param roleModuleId 
	 *            角色模块ID
     */
    public void setRoleModuleId(Integer roleModuleId) {
        this.roleModuleId = roleModuleId;
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

    /**
     * @return 模块ID
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * @param moduleId 
	 *            模块ID
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }
}