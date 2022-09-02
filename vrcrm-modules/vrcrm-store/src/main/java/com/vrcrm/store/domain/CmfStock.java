package com.vrcrm.store.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 仓库管理对象 cmf_stock
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfStock extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String isclock;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String leverno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String costtype;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setUserFlag(String userFlag) 
    {
        this.userFlag = userFlag;
    }

    public String getUserFlag() 
    {
        return userFlag;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setIsclock(String isclock) 
    {
        this.isclock = isclock;
    }

    public String getIsclock() 
    {
        return isclock;
    }
    public void setLeverno(String leverno) 
    {
        this.leverno = leverno;
    }

    public String getLeverno() 
    {
        return leverno;
    }
    public void setCosttype(String costtype) 
    {
        this.costtype = costtype;
    }

    public String getCosttype() 
    {
        return costtype;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("userFlag", getUserFlag())
            .append("userId", getUserId())
            .append("isclock", getIsclock())
            .append("leverno", getLeverno())
            .append("costtype", getCosttype())
            .toString();
    }
}
