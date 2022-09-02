package com.vrcrm.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 系统帮助对象 cmf_systemhelp
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSystemhelp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String systemhelpname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String text;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String integer;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setSystemhelpname(String systemhelpname) 
    {
        this.systemhelpname = systemhelpname;
    }

    public String getSystemhelpname() 
    {
        return systemhelpname;
    }
    public void setText(String text) 
    {
        this.text = text;
    }

    public String getText() 
    {
        return text;
    }
    public void setInteger(String integer) 
    {
        this.integer = integer;
    }

    public String getInteger() 
    {
        return integer;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("systemhelpname", getSystemhelpname())
            .append("text", getText())
            .append("integer", getInteger())
            .toString();
    }
}
