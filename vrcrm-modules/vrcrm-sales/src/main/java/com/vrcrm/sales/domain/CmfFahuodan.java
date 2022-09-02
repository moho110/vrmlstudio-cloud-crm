package com.vrcrm.sales.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 发货单对象 cmf_fahuodan
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfFahuodan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long customerid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long dingdanbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fahuodan;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fahuoren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date fahuodate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shouhuoren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mailcode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fahuotype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long packages;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal weight;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal yunfei;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiesuantype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beizhu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalnum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalmoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String outtype;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCustomerid(Long customerid) 
    {
        this.customerid = customerid;
    }

    public Long getCustomerid() 
    {
        return customerid;
    }
    public void setDingdanbillid(Long dingdanbillid) 
    {
        this.dingdanbillid = dingdanbillid;
    }

    public Long getDingdanbillid() 
    {
        return dingdanbillid;
    }
    public void setFahuodan(String fahuodan) 
    {
        this.fahuodan = fahuodan;
    }

    public String getFahuodan() 
    {
        return fahuodan;
    }
    public void setFahuoren(String fahuoren) 
    {
        this.fahuoren = fahuoren;
    }

    public String getFahuoren() 
    {
        return fahuoren;
    }
    public void setFahuodate(Date fahuodate) 
    {
        this.fahuodate = fahuodate;
    }

    public Date getFahuodate() 
    {
        return fahuodate;
    }
    public void setShouhuoren(String shouhuoren) 
    {
        this.shouhuoren = shouhuoren;
    }

    public String getShouhuoren() 
    {
        return shouhuoren;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setMailcode(String mailcode) 
    {
        this.mailcode = mailcode;
    }

    public String getMailcode() 
    {
        return mailcode;
    }
    public void setFahuotype(String fahuotype) 
    {
        this.fahuotype = fahuotype;
    }

    public String getFahuotype() 
    {
        return fahuotype;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setPackages(Long packages)
    {
        this.packages = packages;
    }

    public Long getPackages()
    {
        return packages;
    }
    public void setWeight(BigDecimal weight) 
    {
        this.weight = weight;
    }

    public BigDecimal getWeight() 
    {
        return weight;
    }
    public void setYunfei(BigDecimal yunfei) 
    {
        this.yunfei = yunfei;
    }

    public BigDecimal getYunfei() 
    {
        return yunfei;
    }
    public void setJiesuantype(String jiesuantype) 
    {
        this.jiesuantype = jiesuantype;
    }

    public String getJiesuantype() 
    {
        return jiesuantype;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
    }
    public void setTotalnum(Long totalnum) 
    {
        this.totalnum = totalnum;
    }

    public Long getTotalnum() 
    {
        return totalnum;
    }
    public void setTotalmoney(Long totalmoney) 
    {
        this.totalmoney = totalmoney;
    }

    public Long getTotalmoney() 
    {
        return totalmoney;
    }
    public void setOuttype(String outtype) 
    {
        this.outtype = outtype;
    }

    public String getOuttype() 
    {
        return outtype;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerid", getCustomerid())
            .append("dingdanbillid", getDingdanbillid())
            .append("fahuodan", getFahuodan())
            .append("fahuoren", getFahuoren())
            .append("fahuodate", getFahuodate())
            .append("shouhuoren", getShouhuoren())
            .append("tel", getTel())
            .append("address", getAddress())
            .append("mailcode", getMailcode())
            .append("fahuotype", getFahuotype())
            .append("state", getState())
            .append("packages", getPackages())
            .append("weight", getWeight())
            .append("yunfei", getYunfei())
            .append("jiesuantype", getJiesuantype())
            .append("beizhu", getBeizhu())
            .append("totalnum", getTotalnum())
            .append("totalmoney", getTotalmoney())
            .append("outtype", getOuttype())
            .toString();
    }
}
