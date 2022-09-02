package com.vrcrm.finance.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 预收款记录对象 cmf_accesspreshou
 * 
 * @author VRer
 * @date 2022-04-13
 */
public class CmfAccesspreshou extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String customerid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String linkman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long curchuzhi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String accountid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long jine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer opertype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long guanlianbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beizhu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long billdeptid;
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
    public void setLinkman(String linkman) 
    {
        this.linkman = linkman;
    }

    public String getLinkman() 
    {
        return linkman;
    }
    public void setCurchuzhi(Long curchuzhi) 
    {
        this.curchuzhi = curchuzhi;
    }

    public Long getCurchuzhi() 
    {
        return curchuzhi;
    }
    public void setAccountid(String accountid) 
    {
        this.accountid = accountid;
    }

    public String getAccountid() 
    {
        return accountid;
    }
    public void setJine(Long jine) 
    {
        this.jine = jine;
    }

    public Long getJine() 
    {
        return jine;
    }
    public void setOpertype(Integer opertype) 
    {
        this.opertype = opertype;
    }

    public Integer getOpertype() 
    {
        return opertype;
    }
    public void setGuanlianbillid(Long guanlianbillid) 
    {
        this.guanlianbillid = guanlianbillid;
    }

    public Long getGuanlianbillid() 
    {
        return guanlianbillid;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
    }
    public void setBilldeptid(Long billdeptid) 
    {
        this.billdeptid = billdeptid;
    }

    public Long getBilldeptid() 
    {
        return billdeptid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerid", getCustomerid())
            .append("linkman", getLinkman())
            .append("curchuzhi", getCurchuzhi())
            .append("accountid", getAccountid())
            .append("jine", getJine())
            .append("opertype", getOpertype())
            .append("guanlianbillid", getGuanlianbillid())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("beizhu", getBeizhu())
            .append("billdeptid", getBilldeptid())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
