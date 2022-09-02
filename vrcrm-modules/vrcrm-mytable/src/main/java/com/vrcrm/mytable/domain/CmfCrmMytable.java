package com.vrcrm.mytable.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 桌面模块表对象 cmf_crm_mytable
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfCrmMytable extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 模块编号 */
    @Excel(name = "模块编号")
    private String moduleid;

    /** 模块名称 */
    @Excel(name = "模块名称")
    private String modulename;

    /** 模块位置 */
    @Excel(name = "模块位置")
    private String moduleposition;

    /** 模块属性 */
    @Excel(name = "模块属性")
    private String moduleattr;

    /** 显示行数 */
    @Excel(name = "显示行数")
    private String displaylinenumber;

    /** 滚动显示 */
    @Excel(name = "滚动显示")
    private String scrolldisplay;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creator;

    /** 备注 */
    @Excel(name = "备注")
    private String memo;
    private Date createtime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setModuleid(String moduleid) 
    {
        this.moduleid = moduleid;
    }

    public String getModuleid() 
    {
        return moduleid;
    }
    public void setModulename(String modulename) 
    {
        this.modulename = modulename;
    }

    public String getModulename() 
    {
        return modulename;
    }
    public void setModuleposition(String moduleposition) 
    {
        this.moduleposition = moduleposition;
    }

    public String getModuleposition() 
    {
        return moduleposition;
    }
    public void setModuleattr(String moduleattr) 
    {
        this.moduleattr = moduleattr;
    }

    public String getModuleattr() 
    {
        return moduleattr;
    }
    public void setDisplaylinenumber(String displaylinenumber) 
    {
        this.displaylinenumber = displaylinenumber;
    }

    public String getDisplaylinenumber() 
    {
        return displaylinenumber;
    }
    public void setScrolldisplay(String scrolldisplay) 
    {
        this.scrolldisplay = scrolldisplay;
    }

    public String getScrolldisplay() 
    {
        return scrolldisplay;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("moduleid", getModuleid())
            .append("modulename", getModulename())
            .append("moduleposition", getModuleposition())
            .append("moduleattr", getModuleattr())
            .append("displaylinenumber", getDisplaylinenumber())
            .append("scrolldisplay", getScrolldisplay())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .append("memo", getMemo())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
