package com.vrcrm.basicdata.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 费用分类对象 cmf_feiyongclasse
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfFeiyongclasse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer kind;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setClassname(String classname) 
    {
        this.classname = classname;
    }

    public String getClassname() 
    {
        return classname;
    }
    public void setKind(Integer kind) 
    {
        this.kind = kind;
    }

    public Integer getKind() 
    {
        return kind;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("classname", getClassname())
            .append("kind", getKind())
            .toString();
    }
}
