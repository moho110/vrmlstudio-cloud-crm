package com.vrcrm.political.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 办公用品列表对象 cmf_officeproduct
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfOfficeproduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String officename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String officeno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String officetype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String specsize;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String unit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long quantity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String warehouseinfo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal totalcount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String brand;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String savedplace;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setOfficename(String officename) 
    {
        this.officename = officename;
    }

    public String getOfficename() 
    {
        return officename;
    }
    public void setOfficeno(String officeno) 
    {
        this.officeno = officeno;
    }

    public String getOfficeno() 
    {
        return officeno;
    }
    public void setOfficetype(String officetype) 
    {
        this.officetype = officetype;
    }

    public String getOfficetype() 
    {
        return officetype;
    }
    public void setSpecsize(String specsize) 
    {
        this.specsize = specsize;
    }

    public String getSpecsize() 
    {
        return specsize;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setWarehouseinfo(String warehouseinfo) 
    {
        this.warehouseinfo = warehouseinfo;
    }

    public String getWarehouseinfo() 
    {
        return warehouseinfo;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setTotalcount(BigDecimal totalcount) 
    {
        this.totalcount = totalcount;
    }

    public BigDecimal getTotalcount() 
    {
        return totalcount;
    }
    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }
    public void setSavedplace(String savedplace) 
    {
        this.savedplace = savedplace;
    }

    public String getSavedplace() 
    {
        return savedplace;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("officename", getOfficename())
            .append("officeno", getOfficeno())
            .append("officetype", getOfficetype())
            .append("specsize", getSpecsize())
            .append("unit", getUnit())
            .append("quantity", getQuantity())
            .append("warehouseinfo", getWarehouseinfo())
            .append("price", getPrice())
            .append("totalcount", getTotalcount())
            .append("brand", getBrand())
            .append("savedplace", getSavedplace())
            .append("memo", getMemo())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
