package com.vrcrm.sales.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 付款计划对象 cmf_fukuanplan
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfFukuanplan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long supplyid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long caigoubillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date plandate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long qici;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long jine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ifpay;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setSupplyid(Long supplyid) 
    {
        this.supplyid = supplyid;
    }

    public Long getSupplyid() 
    {
        return supplyid;
    }
    public void setCaigoubillid(Long caigoubillid) 
    {
        this.caigoubillid = caigoubillid;
    }

    public Long getCaigoubillid() 
    {
        return caigoubillid;
    }
    public void setPlandate(Date plandate) 
    {
        this.plandate = plandate;
    }

    public Date getPlandate() 
    {
        return plandate;
    }
    public void setQici(Long qici) 
    {
        this.qici = qici;
    }

    public Long getQici() 
    {
        return qici;
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
    public void setIfpay(String ifpay) 
    {
        this.ifpay = ifpay;
    }

    public String getIfpay() 
    {
        return ifpay;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("supplyid", getSupplyid())
            .append("caigoubillid", getCaigoubillid())
            .append("plandate", getPlandate())
            .append("qici", getQici())
            .append("jine", getJine())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("ifpay", getIfpay())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
