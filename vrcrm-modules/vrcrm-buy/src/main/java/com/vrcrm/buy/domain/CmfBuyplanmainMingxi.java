package com.vrcrm.buy.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 采购单名细对象 cmf_buyplanmain_mingxi
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfBuyplanmainMingxi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String oldproductid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long lastprice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long jine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beizhu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mainrowid;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setOldproductid(String oldproductid) 
    {
        this.oldproductid = oldproductid;
    }

    public String getOldproductid() 
    {
        return oldproductid;
    }
    public void setProdid(String prodid) 
    {
        this.prodid = prodid;
    }

    public String getProdid() 
    {
        return prodid;
    }
    public void setLastprice(Long lastprice) 
    {
        this.lastprice = lastprice;
    }

    public Long getLastprice() 
    {
        return lastprice;
    }
    public void setProdname(String prodname) 
    {
        this.prodname = prodname;
    }

    public String getProdname() 
    {
        return prodname;
    }
    public void setNum(Long num) 
    {
        this.num = num;
    }

    public Long getNum() 
    {
        return num;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setJine(Long jine) 
    {
        this.jine = jine;
    }

    public Long getJine() 
    {
        return jine;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
    }
    public void setMainrowid(Long mainrowid) 
    {
        this.mainrowid = mainrowid;
    }

    public Long getMainrowid() 
    {
        return mainrowid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("oldproductid", getOldproductid())
            .append("prodid", getProdid())
            .append("lastprice", getLastprice())
            .append("prodname", getProdname())
            .append("num", getNum())
            .append("price", getPrice())
            .append("jine", getJine())
            .append("beizhu", getBeizhu())
            .append("mainrowid", getMainrowid())
            .toString();
    }
}
