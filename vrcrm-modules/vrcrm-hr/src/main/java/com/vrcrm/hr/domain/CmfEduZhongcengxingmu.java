package com.vrcrm.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 中层干部测评项目明细对象 cmf_edu_zhongcengxingmu
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduZhongcengxingmu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projects;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long scoreinvalue;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setProjects(String projects) 
    {
        this.projects = projects;
    }

    public String getProjects() 
    {
        return projects;
    }
    public void setScoreinvalue(Long scoreinvalue) 
    {
        this.scoreinvalue = scoreinvalue;
    }

    public Long getScoreinvalue() 
    {
        return scoreinvalue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projects", getProjects())
            .append("scoreinvalue", getScoreinvalue())
            .toString();
    }
}
