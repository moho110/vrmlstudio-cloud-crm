package com.vrcrm.sales.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 积分兑换对象 cmf_exchange
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfExchange extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long customid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xinghao;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String guige;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long integral;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long exchangenum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stockid;

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
    public void setCustomid(Long customid) 
    {
        this.customid = customid;
    }

    public Long getCustomid() 
    {
        return customid;
    }
    public void setProdid(String prodid) 
    {
        this.prodid = prodid;
    }

    public String getProdid() 
    {
        return prodid;
    }
    public void setXinghao(String xinghao) 
    {
        this.xinghao = xinghao;
    }

    public String getXinghao() 
    {
        return xinghao;
    }
    public void setGuige(String guige) 
    {
        this.guige = guige;
    }

    public String getGuige() 
    {
        return guige;
    }
    public void setIntegral(Long integral) 
    {
        this.integral = integral;
    }

    public Long getIntegral() 
    {
        return integral;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setProdname(String prodname) 
    {
        this.prodname = prodname;
    }

    public String getProdname() 
    {
        return prodname;
    }
    public void setExchangenum(Long exchangenum) 
    {
        this.exchangenum = exchangenum;
    }

    public Long getExchangenum() 
    {
        return exchangenum;
    }
    public void setStockid(String stockid) 
    {
        this.stockid = stockid;
    }

    public String getStockid() 
    {
        return stockid;
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
            .append("customid", getCustomid())
            .append("prodid", getProdid())
            .append("xinghao", getXinghao())
            .append("guige", getGuige())
            .append("integral", getIntegral())
            .append("createtime", getCreatetime())
            .append("createman", getCreateman())
            .append("prodname", getProdname())
            .append("exchangenum", getExchangenum())
            .append("stockid", getStockid())
            .append("beizhu", getBeizhu())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
