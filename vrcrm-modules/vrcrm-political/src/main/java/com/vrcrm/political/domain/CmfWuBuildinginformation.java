package com.vrcrm.political.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 房产信息对象 cmf_wu_buildinginformation
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfWuBuildinginformation extends BaseEntity
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
    private String buildinglocate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String unit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String buildingstruct;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String finishdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiaofudate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String usein;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String area;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String salednum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rentnum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String builder;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String optmanage;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String areaname;
    private Date createtime;

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
    public void setBuildinglocate(String buildinglocate) 
    {
        this.buildinglocate = buildinglocate;
    }

    public String getBuildinglocate() 
    {
        return buildinglocate;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setBuildingstruct(String buildingstruct) 
    {
        this.buildingstruct = buildingstruct;
    }

    public String getBuildingstruct() 
    {
        return buildingstruct;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setSum(String sum) 
    {
        this.sum = sum;
    }

    public String getSum() 
    {
        return sum;
    }
    public void setStartdate(String startdate) 
    {
        this.startdate = startdate;
    }

    public String getStartdate() 
    {
        return startdate;
    }
    public void setFinishdate(String finishdate) 
    {
        this.finishdate = finishdate;
    }

    public String getFinishdate() 
    {
        return finishdate;
    }
    public void setJiaofudate(String jiaofudate) 
    {
        this.jiaofudate = jiaofudate;
    }

    public String getJiaofudate() 
    {
        return jiaofudate;
    }
    public void setUsein(String usein) 
    {
        this.usein = usein;
    }

    public String getUsein() 
    {
        return usein;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setSalednum(String salednum) 
    {
        this.salednum = salednum;
    }

    public String getSalednum() 
    {
        return salednum;
    }
    public void setRentnum(String rentnum) 
    {
        this.rentnum = rentnum;
    }

    public String getRentnum() 
    {
        return rentnum;
    }
    public void setBuilder(String builder) 
    {
        this.builder = builder;
    }

    public String getBuilder() 
    {
        return builder;
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
    public void setOptmanage(String optmanage) 
    {
        this.optmanage = optmanage;
    }

    public String getOptmanage() 
    {
        return optmanage;
    }
    public void setAreaname(String areaname) 
    {
        this.areaname = areaname;
    }

    public String getAreaname() 
    {
        return areaname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("buildingno", getBuildingno())
            .append("buildingname", getBuildingname())
            .append("buildinglocate", getBuildinglocate())
            .append("unit", getUnit())
            .append("buildingstruct", getBuildingstruct())
            .append("type", getType())
            .append("sum", getSum())
            .append("startdate", getStartdate())
            .append("finishdate", getFinishdate())
            .append("jiaofudate", getJiaofudate())
            .append("usein", getUsein())
            .append("area", getArea())
            .append("salednum", getSalednum())
            .append("rentnum", getRentnum())
            .append("builder", getBuilder())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .append("memo", getMemo())
            .append("optmanage", getOptmanage())
            .append("areaname", getAreaname())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
