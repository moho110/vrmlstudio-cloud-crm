package com.vrcrm.finance.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 帐号操作对象 cmf_accessbank
 * 
 * @author VRer
 * @date 2022-04-13
 */
public class CmfAccessbank extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bankid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long oldjine;

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
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setBankid(Long bankid) 
    {
        this.bankid = bankid;
    }

    public Long getBankid() 
    {
        return bankid;
    }
    public void setOldjine(Long oldjine) 
    {
        this.oldjine = oldjine;
    }

    public Long getOldjine() 
    {
        return oldjine;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bankid", getBankid())
            .append("oldjine", getOldjine())
            .append("jine", getJine())
            .append("opertype", getOpertype())
            .append("guanlianbillid", getGuanlianbillid())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
