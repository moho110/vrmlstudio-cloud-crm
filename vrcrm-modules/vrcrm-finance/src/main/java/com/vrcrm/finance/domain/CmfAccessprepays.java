package com.vrcrm.finance.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 预付款记录对象 cmf_accessprepays
 * 
 * @author VRer
 * @date 2022-04-13
 */
public class CmfAccessprepays extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplyid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long linkmanid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long curchuzhi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long jine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer opertype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long guanlianbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long billdeptid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String accountid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beizhu;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setSupplyid(String supplyid) 
    {
        this.supplyid = supplyid;
    }

    public String getSupplyid() 
    {
        return supplyid;
    }
    public void setLinkmanid(Long linkmanid) 
    {
        this.linkmanid = linkmanid;
    }

    public Long getLinkmanid() 
    {
        return linkmanid;
    }
    public void setCurchuzhi(Long curchuzhi) 
    {
        this.curchuzhi = curchuzhi;
    }

    public Long getCurchuzhi() 
    {
        return curchuzhi;
    }
    public void setJine(Long jine) 
    {
        this.jine = jine;
    }

    public Long getJine() 
    {
        return jine;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
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
    public void setBilldeptid(Long billdeptid) 
    {
        this.billdeptid = billdeptid;
    }

    public Long getBilldeptid() 
    {
        return billdeptid;
    }
    public void setAccountid(String accountid) 
    {
        this.accountid = accountid;
    }

    public String getAccountid() 
    {
        return accountid;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("supplyid", getSupplyid())
            .append("linkmanid", getLinkmanid())
            .append("curchuzhi", getCurchuzhi())
            .append("jine", getJine())
            .append("createman", getCreateman())
            .append("opertype", getOpertype())
            .append("guanlianbillid", getGuanlianbillid())
            .append("createtime", getCreatetime())
            .append("billdeptid", getBilldeptid())
            .append("accountid", getAccountid())
            .append("beizhu", getBeizhu())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
