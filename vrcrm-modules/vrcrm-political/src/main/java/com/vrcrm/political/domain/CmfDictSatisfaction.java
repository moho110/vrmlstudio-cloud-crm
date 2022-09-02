package com.vrcrm.political.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 满意度对象 cmf_dict_satisfaction
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfDictSatisfaction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String satisfaction;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pyCode;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setSatisfaction(String satisfaction) 
    {
        this.satisfaction = satisfaction;
    }

    public String getSatisfaction() 
    {
        return satisfaction;
    }
    public void setPyCode(String pyCode) 
    {
        this.pyCode = pyCode;
    }

    public String getPyCode() 
    {
        return pyCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("satisfaction", getSatisfaction())
            .append("pyCode", getPyCode())
            .toString();
    }
}
