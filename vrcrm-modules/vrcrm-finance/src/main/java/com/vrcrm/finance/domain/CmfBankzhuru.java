package com.vrcrm.finance.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 帐户注入对象 cmf_bankzhuru
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfBankzhuru extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long accountid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long jine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date opertime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long inouttype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setAccountid(Long accountid) 
    {
        this.accountid = accountid;
    }

    public Long getAccountid() 
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
    public void setUserid(String userid) 
    {
        this.userid = userid;
    }

    public String getUserid() 
    {
        return userid;
    }
    public void setOpertime(Date opertime) 
    {
        this.opertime = opertime;
    }

    public Date getOpertime() 
    {
        return opertime;
    }
    public void setInouttype(Long inouttype) 
    {
        this.inouttype = inouttype;
    }

    public Long getInouttype() 
    {
        return inouttype;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("accountid", getAccountid())
            .append("jine", getJine())
            .append("userid", getUserid())
            .append("opertime", getOpertime())
            .append("inouttype", getInouttype())
            .append("memo", getMemo())
            .toString();
    }
}
