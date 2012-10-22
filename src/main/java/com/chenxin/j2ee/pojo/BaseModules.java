package com.chenxin.j2ee.pojo;

import java.io.Serializable;

public class BaseModules implements Serializable {
    private static final long serialVersionUID = 454976140038548730L;

    /**
     * 模块ID
     */
    private Integer moduleId;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 模块URL
     */
    private String moduleUrl;

    /**
     * 父模块ID
     */
    private Integer parentId;

    /**
     * 叶子节点(0:树枝节点;1:叶子节点)
     */
    private Integer leaf;

    /**
     * 展开状态(1:展开;0:收缩)
     */
    private Integer expanded;

    /**
     * 显示顺序
     */
    private Integer displayIndex;

    /**
     * 是否显示 0:否 1:是
     */
    private Integer isDisplay;

    /**
     * 模块英文名称
     */
    private String enModuleName;

    /**
     * 图标或者样式
     */
    private String iconCss;

    /**
     * 节点说明
     */
    private String information;

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

    /**
     * @return 模块名称
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * @param moduleName 
	 *            模块名称
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * @return 模块URL
     */
    public String getModuleUrl() {
        return moduleUrl;
    }

    /**
     * @param moduleUrl 
	 *            模块URL
     */
    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    /**
     * @return 父模块ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId 
	 *            父模块ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return 叶子节点(0:树枝节点;1:叶子节点)
     */
    public Integer getLeaf() {
        return leaf;
    }

    /**
     * @param leaf 
	 *            叶子节点(0:树枝节点;1:叶子节点)
     */
    public void setLeaf(Integer leaf) {
        this.leaf = leaf;
    }

    /**
     * @return 展开状态(1:展开;0:收缩)
     */
    public Integer getExpanded() {
        return expanded;
    }

    /**
     * @param expanded 
	 *            展开状态(1:展开;0:收缩)
     */
    public void setExpanded(Integer expanded) {
        this.expanded = expanded;
    }

    /**
     * @return 显示顺序
     */
    public Integer getDisplayIndex() {
        return displayIndex;
    }

    /**
     * @param displayIndex 
	 *            显示顺序
     */
    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
    }

    /**
     * @return 是否显示 0:否 1:是
     */
    public Integer getIsDisplay() {
        return isDisplay;
    }

    /**
     * @param isDisplay 
	 *            是否显示 0:否 1:是
     */
    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    /**
     * @return 模块英文名称
     */
    public String getEnModuleName() {
        return enModuleName;
    }

    /**
     * @param enModuleName 
	 *            模块英文名称
     */
    public void setEnModuleName(String enModuleName) {
        this.enModuleName = enModuleName;
    }

    /**
     * @return 图标或者样式
     */
    public String getIconCss() {
        return iconCss;
    }

    /**
     * @param iconCss 
	 *            图标或者样式
     */
    public void setIconCss(String iconCss) {
        this.iconCss = iconCss;
    }

    /**
     * @return 节点说明
     */
    public String getInformation() {
        return information;
    }

    /**
     * @param information 
	 *            节点说明
     */
    public void setInformation(String information) {
        this.information = information;
    }
}