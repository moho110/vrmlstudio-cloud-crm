package com.vrcrm.store.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 仓库管理入库对象 cmf_stockinmain
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfStockinmain extends BaseEntity
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
    private Date indate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long caigoubillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tuihuobillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String state;

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
    private Long totalnum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long totalmoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String instoreshenhe;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String intype;
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
    public void setIndate(Date indate) 
    {
        this.indate = indate;
    }

    public Date getIndate() 
    {
        return indate;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setCaigoubillid(Long caigoubillid) 
    {
        this.caigoubillid = caigoubillid;
    }

    public Long getCaigoubillid() 
    {
        return caigoubillid;
    }
    public void setTuihuobillid(Long tuihuobillid) 
    {
        this.tuihuobillid = tuihuobillid;
    }

    public Long getTuihuobillid() 
    {
        return tuihuobillid;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
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
    public void setInstoreshenhe(String instoreshenhe) 
    {
        this.instoreshenhe = instoreshenhe;
    }

    public String getInstoreshenhe() 
    {
        return instoreshenhe;
    }
    public void setIntype(String intype) 
    {
        this.intype = intype;
    }

    public String getIntype() 
    {
        return intype;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zhuti", getZhuti())
            .append("storeid", getStoreid())
            .append("indate", getIndate())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("caigoubillid", getCaigoubillid())
            .append("tuihuobillid", getTuihuobillid())
            .append("memo", getMemo())
            .append("state", getState())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .append("totalnum", getTotalnum())
            .append("totalmoney", getTotalmoney())
            .append("instoreshenhe", getInstoreshenhe())
            .append("intype", getIntype())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
