package com.vrcrm.basicdata.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 费用类型对象 cmf_feiyongtype
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfFeiyongtype extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String typename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long classid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer iflock;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTypename(String typename) 
    {
        this.typename = typename;
    }

    public String getTypename() 
    {
        return typename;
    }
    public void setClassid(Long classid) 
    {
        this.classid = classid;
    }

    public Long getClassid() 
    {
        return classid;
    }
    public void setIflock(Integer iflock) 
    {
        this.iflock = iflock;
    }

    public Integer getIflock() 
    {
        return iflock;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("typename", getTypename())
            .append("classid", getClassid())
            .append("iflock", getIflock())
            .toString();
    }
}
