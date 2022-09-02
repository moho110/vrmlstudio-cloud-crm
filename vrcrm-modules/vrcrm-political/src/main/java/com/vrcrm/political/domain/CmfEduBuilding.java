package com.vrcrm.political.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 教学楼对象 cmf_edu_building
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduBuilding extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String buildingno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String buildingname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setBuildingno(String buildingno) 
    {
        this.buildingno = buildingno;
    }

    public String getBuildingno() 
    {
        return buildingno;
    }
    public void setBuildingname(String buildingname) 
    {
        this.buildingname = buildingname;
    }

    public String getBuildingname() 
    {
        return buildingname;
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
            .append("buildingno", getBuildingno())
            .append("buildingname", getBuildingname())
            .append("memo", getMemo())
            .toString();
    }
}
