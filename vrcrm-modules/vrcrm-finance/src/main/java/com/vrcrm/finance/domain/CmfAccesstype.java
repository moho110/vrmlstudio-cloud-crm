package com.vrcrm.finance.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 帐户操作类型对象 cmf_accesstype
 * 
 * @author VRer
 * @date 2022-04-13
 */
public class CmfAccesstype extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long parent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long inout;

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
    public void setParent(Long parent) 
    {
        this.parent = parent;
    }

    public Long getParent() 
    {
        return parent;
    }
    public void setInout(Long inout) 
    {
        this.inout = inout;
    }

    public Long getInout() 
    {
        return inout;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("parent", getParent())
            .append("inout", getInout())
            .toString();
    }
}
