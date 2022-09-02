package com.vrcrm.store.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 仓库管理调拔对象 cmf_stockchangemain
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfStockchangemain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhuti;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long outstoreid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long instoreid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String outstoreshenhe;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String instoreshenhe;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date outshenhetime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date inshenhetime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalmoney;
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
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setOutstoreid(Long outstoreid) 
    {
        this.outstoreid = outstoreid;
    }

    public Long getOutstoreid() 
    {
        return outstoreid;
    }
    public void setInstoreid(Long instoreid) 
    {
        this.instoreid = instoreid;
    }

    public Long getInstoreid() 
    {
        return instoreid;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setOutstoreshenhe(String outstoreshenhe) 
    {
        this.outstoreshenhe = outstoreshenhe;
    }

    public String getOutstoreshenhe() 
    {
        return outstoreshenhe;
    }
    public void setInstoreshenhe(String instoreshenhe) 
    {
        this.instoreshenhe = instoreshenhe;
    }

    public String getInstoreshenhe() 
    {
        return instoreshenhe;
    }
    public void setOutshenhetime(Date outshenhetime) 
    {
        this.outshenhetime = outshenhetime;
    }

    public Date getOutshenhetime() 
    {
        return outshenhetime;
    }
    public void setInshenhetime(Date inshenhetime) 
    {
        this.inshenhetime = inshenhetime;
    }

    public Date getInshenhetime() 
    {
        return inshenhetime;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setTotalmoney(Long totalmoney) 
    {
        this.totalmoney = totalmoney;
    }

    public Long getTotalmoney() 
    {
        return totalmoney;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zhuti", getZhuti())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("outstoreid", getOutstoreid())
            .append("instoreid", getInstoreid())
            .append("state", getState())
            .append("outstoreshenhe", getOutstoreshenhe())
            .append("instoreshenhe", getInstoreshenhe())
            .append("outshenhetime", getOutshenhetime())
            .append("inshenhetime", getInshenhetime())
            .append("memo", getMemo())
            .append("totalmoney", getTotalmoney())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
