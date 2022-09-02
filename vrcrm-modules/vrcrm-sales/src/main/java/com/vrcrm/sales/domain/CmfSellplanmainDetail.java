package com.vrcrm.sales.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 销售计划明细对象 cmf_sellplanmain_detail
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSellplanmainDetail extends BaseEntity
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

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long chukunum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date plandate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qici;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String yaoqiu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String iftixing;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long lirun;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String oldprodid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer opertype;
    private Date createtime;

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
    public void setChukunum(Long chukunum) 
    {
        this.chukunum = chukunum;
    }

    public Long getChukunum() 
    {
        return chukunum;
    }
    public void setPlandate(Date plandate) 
    {
        this.plandate = plandate;
    }

    public Date getPlandate() 
    {
        return plandate;
    }
    public void setQici(String qici) 
    {
        this.qici = qici;
    }

    public String getQici() 
    {
        return qici;
    }
    public void setYaoqiu(String yaoqiu) 
    {
        this.yaoqiu = yaoqiu;
    }

    public String getYaoqiu() 
    {
        return yaoqiu;
    }
    public void setIftixing(String iftixing) 
    {
        this.iftixing = iftixing;
    }

    public String getIftixing() 
    {
        return iftixing;
    }
    public void setLirun(Long lirun) 
    {
        this.lirun = lirun;
    }

    public Long getLirun() 
    {
        return lirun;
    }
    public void setOldprodid(String oldprodid) 
    {
        this.oldprodid = oldprodid;
    }

    public String getOldprodid() 
    {
        return oldprodid;
    }
    public void setOpertype(Integer opertype) 
    {
        this.opertype = opertype;
    }

    public Integer getOpertype() 
    {
        return opertype;
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
            .append("chukunum", getChukunum())
            .append("plandate", getPlandate())
            .append("qici", getQici())
            .append("yaoqiu", getYaoqiu())
            .append("iftixing", getIftixing())
            .append("createtime", getCreatetime())
            .append("lirun", getLirun())
            .append("oldprodid", getOldprodid())
            .append("opertype", getOpertype())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
