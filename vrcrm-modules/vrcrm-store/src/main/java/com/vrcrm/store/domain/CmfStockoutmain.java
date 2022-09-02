package com.vrcrm.store.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 仓库出库对象 cmf_stockoutmain
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfStockoutmain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhuti;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long storeid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalnum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalmoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long dingdanbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date outdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String outstoreshenhe;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String outtype;
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
    public void setStoreid(Long storeid) 
    {
        this.storeid = storeid;
    }

    public Long getStoreid() 
    {
        return storeid;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
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
    public void setDingdanbillid(Long dingdanbillid) 
    {
        this.dingdanbillid = dingdanbillid;
    }

    public Long getDingdanbillid() 
    {
        return dingdanbillid;
    }
    public void setOutdate(Date outdate) 
    {
        this.outdate = outdate;
    }

    public Date getOutdate() 
    {
        return outdate;
    }
    public void setOutstoreshenhe(String outstoreshenhe) 
    {
        this.outstoreshenhe = outstoreshenhe;
    }

    public String getOutstoreshenhe() 
    {
        return outstoreshenhe;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
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
            .append("zhuti", getZhuti())
            .append("storeid", getStoreid())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("state", getState())
            .append("totalnum", getTotalnum())
            .append("totalmoney", getTotalmoney())
            .append("dingdanbillid", getDingdanbillid())
            .append("outdate", getOutdate())
            .append("outstoreshenhe", getOutstoreshenhe())
            .append("memo", getMemo())
            .append("outtype", getOuttype())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
