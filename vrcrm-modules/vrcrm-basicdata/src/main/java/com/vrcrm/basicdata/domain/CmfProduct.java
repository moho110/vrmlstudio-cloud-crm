package com.vrcrm.basicdata.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 产品对象 cmf_product
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String measureid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String standard;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long producttype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal storemin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal storemax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sellprice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productcn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sellprice2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sellprice3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fileaddress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String oldproductid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ifkucun;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String relatefiles;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplyid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String hascolor;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sellprice4;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setProductname(String productname) 
    {
        this.productname = productname;
    }

    public String getProductname() 
    {
        return productname;
    }
    public void setMeasureid(String measureid) 
    {
        this.measureid = measureid;
    }

    public String getMeasureid() 
    {
        return measureid;
    }
    public void setMode(String mode) 
    {
        this.mode = mode;
    }

    public String getMode() 
    {
        return mode;
    }
    public void setStandard(String standard) 
    {
        this.standard = standard;
    }

    public String getStandard() 
    {
        return standard;
    }
    public void setProducttype(Long producttype) 
    {
        this.producttype = producttype;
    }

    public Long getProducttype() 
    {
        return producttype;
    }
    public void setStoremin(BigDecimal storemin) 
    {
        this.storemin = storemin;
    }

    public BigDecimal getStoremin() 
    {
        return storemin;
    }
    public void setStoremax(BigDecimal storemax) 
    {
        this.storemax = storemax;
    }

    public BigDecimal getStoremax() 
    {
        return storemax;
    }
    public void setUserFlag(String userFlag) 
    {
        this.userFlag = userFlag;
    }

    public String getUserFlag() 
    {
        return userFlag;
    }
    public void setSellprice(Long sellprice) 
    {
        this.sellprice = sellprice;
    }

    public Long getSellprice() 
    {
        return sellprice;
    }
    public void setProductcn(String productcn) 
    {
        this.productcn = productcn;
    }

    public String getProductcn() 
    {
        return productcn;
    }
    public void setSellprice2(Long sellprice2) 
    {
        this.sellprice2 = sellprice2;
    }

    public Long getSellprice2() 
    {
        return sellprice2;
    }
    public void setSellprice3(Long sellprice3) 
    {
        this.sellprice3 = sellprice3;
    }

    public Long getSellprice3() 
    {
        return sellprice3;
    }
    public void setFileaddress(String fileaddress) 
    {
        this.fileaddress = fileaddress;
    }

    public String getFileaddress() 
    {
        return fileaddress;
    }
    public void setOldproductid(String oldproductid) 
    {
        this.oldproductid = oldproductid;
    }

    public String getOldproductid() 
    {
        return oldproductid;
    }
    public void setIfkucun(String ifkucun) 
    {
        this.ifkucun = ifkucun;
    }

    public String getIfkucun() 
    {
        return ifkucun;
    }
    public void setRelatefiles(String relatefiles) 
    {
        this.relatefiles = relatefiles;
    }

    public String getRelatefiles() 
    {
        return relatefiles;
    }
    public void setSupplyid(String supplyid) 
    {
        this.supplyid = supplyid;
    }

    public String getSupplyid() 
    {
        return supplyid;
    }
    public void setHascolor(String hascolor) 
    {
        this.hascolor = hascolor;
    }

    public String getHascolor() 
    {
        return hascolor;
    }
    public void setSellprice4(Long sellprice4) 
    {
        this.sellprice4 = sellprice4;
    }

    public Long getSellprice4() 
    {
        return sellprice4;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productname", getProductname())
            .append("measureid", getMeasureid())
            .append("mode", getMode())
            .append("standard", getStandard())
            .append("producttype", getProducttype())
            .append("storemin", getStoremin())
            .append("storemax", getStoremax())
            .append("userFlag", getUserFlag())
            .append("sellprice", getSellprice())
            .append("productcn", getProductcn())
            .append("sellprice2", getSellprice2())
            .append("sellprice3", getSellprice3())
            .append("fileaddress", getFileaddress())
            .append("oldproductid", getOldproductid())
            .append("ifkucun", getIfkucun())
            .append("relatefiles", getRelatefiles())
            .append("supplyid", getSupplyid())
            .append("hascolor", getHascolor())
            .append("sellprice4", getSellprice4())
            .toString();
    }
}
