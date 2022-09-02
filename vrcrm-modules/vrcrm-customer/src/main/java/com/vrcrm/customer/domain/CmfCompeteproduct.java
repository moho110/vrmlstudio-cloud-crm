package com.vrcrm.customer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 竞争对手对象 cmf_competeproduct
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfCompeteproduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String customerid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String infofrom;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String comproduct;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String compname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String compexcel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String compdefect;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String compprice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fileaddress;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setCustomerid(String customerid) 
    {
        this.customerid = customerid;
    }

    public String getCustomerid() 
    {
        return customerid;
    }
    public void setProductid(String productid) 
    {
        this.productid = productid;
    }

    public String getProductid() 
    {
        return productid;
    }
    public void setInfofrom(String infofrom) 
    {
        this.infofrom = infofrom;
    }

    public String getInfofrom() 
    {
        return infofrom;
    }
    public void setComproduct(String comproduct) 
    {
        this.comproduct = comproduct;
    }

    public String getComproduct() 
    {
        return comproduct;
    }
    public void setCompname(String compname) 
    {
        this.compname = compname;
    }

    public String getCompname() 
    {
        return compname;
    }
    public void setCompexcel(String compexcel) 
    {
        this.compexcel = compexcel;
    }

    public String getCompexcel() 
    {
        return compexcel;
    }
    public void setCompdefect(String compdefect) 
    {
        this.compdefect = compdefect;
    }

    public String getCompdefect() 
    {
        return compdefect;
    }
    public void setCompprice(String compprice) 
    {
        this.compprice = compprice;
    }

    public String getCompprice() 
    {
        return compprice;
    }
    public void setUserFlag(String userFlag) 
    {
        this.userFlag = userFlag;
    }

    public String getUserFlag() 
    {
        return userFlag;
    }
    public void setFileaddress(String fileaddress) 
    {
        this.fileaddress = fileaddress;
    }

    public String getFileaddress() 
    {
        return fileaddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("customerid", getCustomerid())
            .append("productid", getProductid())
            .append("infofrom", getInfofrom())
            .append("comproduct", getComproduct())
            .append("compname", getCompname())
            .append("compexcel", getCompexcel())
            .append("compdefect", getCompdefect())
            .append("compprice", getCompprice())
            .append("userFlag", getUserFlag())
            .append("fileaddress", getFileaddress())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
