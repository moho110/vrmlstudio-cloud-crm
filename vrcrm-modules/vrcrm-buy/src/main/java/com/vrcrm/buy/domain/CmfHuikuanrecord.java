package com.vrcrm.buy.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 汇款记录对象 cmf_huikuanrecord
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfHuikuanrecord extends BaseEntity
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
    private Long qici;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date paydate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long jine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long ifkaipiao;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long accountid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beizhu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long guanlianplanid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long oddment;
    private Date createtime;

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
    public void setQici(Long qici) 
    {
        this.qici = qici;
    }

    public Long getQici() 
    {
        return qici;
    }
    public void setPaydate(Date paydate) 
    {
        this.paydate = paydate;
    }

    public Date getPaydate() 
    {
        return paydate;
    }
    public void setJine(Long jine) 
    {
        this.jine = jine;
    }

    public Long getJine() 
    {
        return jine;
    }
    public void setIfkaipiao(Long ifkaipiao) 
    {
        this.ifkaipiao = ifkaipiao;
    }

    public Long getIfkaipiao() 
    {
        return ifkaipiao;
    }
    public void setAccountid(Long accountid) 
    {
        this.accountid = accountid;
    }

    public Long getAccountid() 
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
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setGuanlianplanid(Long guanlianplanid) 
    {
        this.guanlianplanid = guanlianplanid;
    }

    public Long getGuanlianplanid() 
    {
        return guanlianplanid;
    }
    public void setOddment(Long oddment) 
    {
        this.oddment = oddment;
    }

    public Long getOddment() 
    {
        return oddment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerid", getCustomerid())
            .append("dingdanbillid", getDingdanbillid())
            .append("qici", getQici())
            .append("paydate", getPaydate())
            .append("jine", getJine())
            .append("ifkaipiao", getIfkaipiao())
            .append("accountid", getAccountid())
            .append("beizhu", getBeizhu())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("guanlianplanid", getGuanlianplanid())
            .append("oddment", getOddment())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
