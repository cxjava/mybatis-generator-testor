package com.chenxin.j2ee.pojo;

import java.io.Serializable;

public class BasePermission implements Serializable {
    private static final long serialVersionUID = 267011072387400686L;

    /**
     * 许可ID
     */
    private Integer permissionId;

    /**
     * 许可名称
     */
    private String permissionName;

    /**
     * 许可值
     */
    private String permissionValue;

    /**
     * 模块ID
     */
    private Integer moduleId;

    /**
     * @return 许可ID
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * @param permissionId 
	 *            许可ID
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * @return 许可名称
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * @param permissionName 
	 *            许可名称
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    /**
     * @return 许可值
     */
    public String getPermissionValue() {
        return permissionValue;
    }

    /**
     * @param permissionValue 
	 *            许可值
     */
    public void setPermissionValue(String permissionValue) {
        this.permissionValue = permissionValue;
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