package com.vrcrm.buy.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 采购计划对象 cmf_buyplanmain
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfBuyplanmain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhuti;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplyid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String linkman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date caigoudate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long storeid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date daohuodate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String danhao;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalmoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String guanliandingdan;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String guanliankehu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beizhu;

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
    private BigDecimal paymoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long rukumoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long shoupiaomoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long ifpay;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long shoupiaostate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long oddment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer userFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long accountid;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setZhuti(String zhuti) 
    {
        this.zhuti = zhuti;
    }

    public String getZhuti() 
    {
        return zhuti;
    }
    public void setSupplyid(String supplyid) 
    {
        this.supplyid = supplyid;
    }

    public String getSupplyid() 
    {
        return supplyid;
    }
    public void setLinkman(String linkman) 
    {
        this.linkman = linkman;
    }

    public String getLinkman() 
    {
        return linkman;
    }
    public void setCaigoudate(Date caigoudate) 
    {
        this.caigoudate = caigoudate;
    }

    public Date getCaigoudate() 
    {
        return caigoudate;
    }
    public void setStoreid(Long storeid) 
    {
        this.storeid = storeid;
    }

    public Long getStoreid() 
    {
        return storeid;
    }
    public void setDaohuodate(Date daohuodate) 
    {
        this.daohuodate = daohuodate;
    }

    public Date getDaohuodate() 
    {
        return daohuodate;
    }
    public void setDanhao(String danhao) 
    {
        this.danhao = danhao;
    }

    public String getDanhao() 
    {
        return danhao;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setTotalmoney(Long totalmoney) 
    {
        this.totalmoney = totalmoney;
    }

    public Long getTotalmoney() 
    {
        return totalmoney;
    }
    public void setGuanliandingdan(String guanliandingdan) 
    {
        this.guanliandingdan = guanliandingdan;
    }

    public String getGuanliandingdan() 
    {
        return guanliandingdan;
    }
    public void setGuanliankehu(String guanliankehu) 
    {
        this.guanliankehu = guanliankehu;
    }

    public String getGuanliankehu() 
    {
        return guanliankehu;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
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
    public void setPaymoney(BigDecimal paymoney) 
    {
        this.paymoney = paymoney;
    }

    public BigDecimal getPaymoney() 
    {
        return paymoney;
    }
    public void setState(Long state) 
    {
        this.state = state;
    }

    public Long getState() 
    {
        return state;
    }
    public void setRukumoney(Long rukumoney) 
    {
        this.rukumoney = rukumoney;
    }

    public Long getRukumoney() 
    {
        return rukumoney;
    }
    public void setShoupiaomoney(Long shoupiaomoney) 
    {
        this.shoupiaomoney = shoupiaomoney;
    }

    public Long getShoupiaomoney() 
    {
        return shoupiaomoney;
    }
    public void setIfpay(Long ifpay) 
    {
        this.ifpay = ifpay;
    }

    public Long getIfpay() 
    {
        return ifpay;
    }
    public void setShoupiaostate(Long shoupiaostate) 
    {
        this.shoupiaostate = shoupiaostate;
    }

    public Long getShoupiaostate() 
    {
        return shoupiaostate;
    }
    public void setOddment(Long oddment) 
    {
        this.oddment = oddment;
    }

    public Long getOddment() 
    {
        return oddment;
    }
    public void setUserFlag(Integer userFlag) 
    {
        this.userFlag = userFlag;
    }

    public Integer getUserFlag() 
    {
        return userFlag;
    }
    public void setAccountid(Long accountid) 
    {
        this.accountid = accountid;
    }

    public Long getAccountid() 
    {
        return accountid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zhuti", getZhuti())
            .append("supplyid", getSupplyid())
            .append("linkman", getLinkman())
            .append("caigoudate", getCaigoudate())
            .append("storeid", getStoreid())
            .append("daohuodate", getDaohuodate())
            .append("danhao", getDanhao())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("totalmoney", getTotalmoney())
            .append("guanliandingdan", getGuanliandingdan())
            .append("guanliankehu", getGuanliankehu())
            .append("beizhu", getBeizhu())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .append("paymoney", getPaymoney())
            .append("state", getState())
            .append("rukumoney", getRukumoney())
            .append("shoupiaomoney", getShoupiaomoney())
            .append("ifpay", getIfpay())
            .append("shoupiaostate", getShoupiaostate())
            .append("oddment", getOddment())
            .append("userFlag", getUserFlag())
            .append("accountid", getAccountid())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
