package com.vrcrm.political.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 宿舍楼对象 cmf_dorm_building
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfDormBuilding extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String buildingname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String buildingsum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long floornumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String masterteacherone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long manageboundaryone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String masterteachertwo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String manageboundarytwo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String masterteacherthree;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String manageboundarythree;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String masterteacherfour;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String manageboundaryfour;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stusex;

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
    public void setBuildingname(String buildingname) 
    {
        this.buildingname = buildingname;
    }

    public String getBuildingname() 
    {
        return buildingname;
    }
    public void setBuildingsum(String buildingsum) 
    {
        this.buildingsum = buildingsum;
    }

    public String getBuildingsum() 
    {
        return buildingsum;
    }
    public void setFloornumber(Long floornumber) 
    {
        this.floornumber = floornumber;
    }

    public Long getFloornumber() 
    {
        return floornumber;
    }
    public void setMasterteacherone(String masterteacherone) 
    {
        this.masterteacherone = masterteacherone;
    }

    public String getMasterteacherone() 
    {
        return masterteacherone;
    }
    public void setManageboundaryone(Long manageboundaryone) 
    {
        this.manageboundaryone = manageboundaryone;
    }

    public Long getManageboundaryone() 
    {
        return manageboundaryone;
    }
    public void setMasterteachertwo(String masterteachertwo) 
    {
        this.masterteachertwo = masterteachertwo;
    }

    public String getMasterteachertwo() 
    {
        return masterteachertwo;
    }
    public void setManageboundarytwo(String manageboundarytwo) 
    {
        this.manageboundarytwo = manageboundarytwo;
    }

    public String getManageboundarytwo() 
    {
        return manageboundarytwo;
    }
    public void setMasterteacherthree(String masterteacherthree) 
    {
        this.masterteacherthree = masterteacherthree;
    }

    public String getMasterteacherthree() 
    {
        return masterteacherthree;
    }
    public void setManageboundarythree(String manageboundarythree) 
    {
        this.manageboundarythree = manageboundarythree;
    }

    public String getManageboundarythree() 
    {
        return manageboundarythree;
    }
    public void setMasterteacherfour(String masterteacherfour) 
    {
        this.masterteacherfour = masterteacherfour;
    }

    public String getMasterteacherfour() 
    {
        return masterteacherfour;
    }
    public void setManageboundaryfour(String manageboundaryfour) 
    {
        this.manageboundaryfour = manageboundaryfour;
    }

    public String getManageboundaryfour() 
    {
        return manageboundaryfour;
    }
    public void setStusex(String stusex) 
    {
        this.stusex = stusex;
    }

    public String getStusex() 
    {
        return stusex;
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
            .append("buildingname", getBuildingname())
            .append("buildingsum", getBuildingsum())
            .append("floornumber", getFloornumber())
            .append("masterteacherone", getMasterteacherone())
            .append("manageboundaryone", getManageboundaryone())
            .append("masterteachertwo", getMasterteachertwo())
            .append("manageboundarytwo", getManageboundarytwo())
            .append("masterteacherthree", getMasterteacherthree())
            .append("manageboundarythree", getManageboundarythree())
            .append("masterteacherfour", getMasterteacherfour())
            .append("manageboundaryfour", getManageboundaryfour())
            .append("stusex", getStusex())
            .append("memo", getMemo())
            .toString();
    }
}
