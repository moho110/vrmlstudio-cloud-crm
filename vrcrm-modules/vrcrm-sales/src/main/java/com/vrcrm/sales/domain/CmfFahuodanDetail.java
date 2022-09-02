package com.vrcrm.sales.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 发货单明细对象 cmf_fahuodan_detail
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfFahuodanDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodguige;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodxinghao;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String proddanwei;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal zhekou;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beizhu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mainrowid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long jine;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setProdid(String prodid) 
    {
        this.prodid = prodid;
    }

    public String getProdid() 
    {
        return prodid;
    }
    public void setProdname(String prodname) 
    {
        this.prodname = prodname;
    }

    public String getProdname() 
    {
        return prodname;
    }
    public void setProdguige(String prodguige) 
    {
        this.prodguige = prodguige;
    }

    public String getProdguige() 
    {
        return prodguige;
    }
    public void setProdxinghao(String prodxinghao) 
    {
        this.prodxinghao = prodxinghao;
    }

    public String getProdxinghao() 
    {
        return prodxinghao;
    }
    public void setProddanwei(String proddanwei) 
    {
        this.proddanwei = proddanwei;
    }

    public String getProddanwei() 
    {
        return proddanwei;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setZhekou(BigDecimal zhekou) 
    {
        this.zhekou = zhekou;
    }

    public BigDecimal getZhekou() 
    {
        return zhekou;
    }
    public void setNum(Long num) 
    {
        this.num = num;
    }

    public Long getNum() 
    {
        return num;
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
    public void setJine(Long jine) 
    {
        this.jine = jine;
    }

    public Long getJine() 
    {
        return jine;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("prodid", getProdid())
            .append("prodname", getProdname())
            .append("prodguige", getProdguige())
            .append("prodxinghao", getProdxinghao())
            .append("proddanwei", getProddanwei())
            .append("price", getPrice())
            .append("zhekou", getZhekou())
            .append("num", getNum())
            .append("beizhu", getBeizhu())
            .append("mainrowid", getMainrowid())
            .append("jine", getJine())
            .toString();
    }
}
