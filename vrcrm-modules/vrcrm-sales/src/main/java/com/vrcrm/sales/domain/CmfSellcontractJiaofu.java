package com.vrcrm.sales.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 销售合同交付管理对象 cmf_sellcontract_jiaofu
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSellcontractJiaofu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String customerid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String hetongid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long planid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jieshouren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date jiaofudate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beizhu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beiyong1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beiyong2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beiyong3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal jine;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCustomerid(String customerid) 
    {
        this.customerid = customerid;
    }

    public String getCustomerid() 
    {
        return customerid;
    }
    public void setHetongid(String hetongid) 
    {
        this.hetongid = hetongid;
    }

    public String getHetongid() 
    {
        return hetongid;
    }
    public void setProductid(String productid) 
    {
        this.productid = productid;
    }

    public String getProductid() 
    {
        return productid;
    }
    public void setPlanid(Long planid) 
    {
        this.planid = planid;
    }

    public Long getPlanid() 
    {
        return planid;
    }
    public void setNum(Long num) 
    {
        this.num = num;
    }

    public Long getNum() 
    {
        return num;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setJieshouren(String jieshouren) 
    {
        this.jieshouren = jieshouren;
    }

    public String getJieshouren() 
    {
        return jieshouren;
    }
    public void setJiaofudate(Date jiaofudate) 
    {
        this.jiaofudate = jiaofudate;
    }

    public Date getJiaofudate() 
    {
        return jiaofudate;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setBeiyong1(String beiyong1) 
    {
        this.beiyong1 = beiyong1;
    }

    public String getBeiyong1() 
    {
        return beiyong1;
    }
    public void setBeiyong2(String beiyong2) 
    {
        this.beiyong2 = beiyong2;
    }

    public String getBeiyong2() 
    {
        return beiyong2;
    }
    public void setBeiyong3(String beiyong3) 
    {
        this.beiyong3 = beiyong3;
    }

    public String getBeiyong3() 
    {
        return beiyong3;
    }
    public void setJine(BigDecimal jine) 
    {
        this.jine = jine;
    }

    public BigDecimal getJine() 
    {
        return jine;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerid", getCustomerid())
            .append("hetongid", getHetongid())
            .append("productid", getProductid())
            .append("planid", getPlanid())
            .append("num", getNum())
            .append("price", getPrice())
            .append("jieshouren", getJieshouren())
            .append("jiaofudate", getJiaofudate())
            .append("beizhu", getBeizhu())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .append("jine", getJine())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
