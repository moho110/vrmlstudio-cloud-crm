package com.vrcrm.customer.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 产品列表对象 cmf_customerproduct
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfCustomerproduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String theme;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String priceman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String clients;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String reiceiver;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pricetime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal count;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String salechance;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiaofuintro;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String topayintro;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String packageexpintro;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String attach;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isexamine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String examineman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date examinetime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer unitid;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTheme(String theme) 
    {
        this.theme = theme;
    }

    public String getTheme() 
    {
        return theme;
    }
    public void setPriceman(String priceman) 
    {
        this.priceman = priceman;
    }

    public String getPriceman() 
    {
        return priceman;
    }
    public void setClients(String clients) 
    {
        this.clients = clients;
    }

    public String getClients() 
    {
        return clients;
    }
    public void setReiceiver(String reiceiver) 
    {
        this.reiceiver = reiceiver;
    }

    public String getReiceiver() 
    {
        return reiceiver;
    }
    public void setPricetime(String pricetime) 
    {
        this.pricetime = pricetime;
    }

    public String getPricetime() 
    {
        return pricetime;
    }
    public void setCount(BigDecimal count) 
    {
        this.count = count;
    }

    public BigDecimal getCount() 
    {
        return count;
    }
    public void setSalechance(String salechance) 
    {
        this.salechance = salechance;
    }

    public String getSalechance() 
    {
        return salechance;
    }
    public void setJiaofuintro(String jiaofuintro) 
    {
        this.jiaofuintro = jiaofuintro;
    }

    public String getJiaofuintro() 
    {
        return jiaofuintro;
    }
    public void setTopayintro(String topayintro) 
    {
        this.topayintro = topayintro;
    }

    public String getTopayintro() 
    {
        return topayintro;
    }
    public void setPackageexpintro(String packageexpintro) 
    {
        this.packageexpintro = packageexpintro;
    }

    public String getPackageexpintro() 
    {
        return packageexpintro;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setAttach(String attach) 
    {
        this.attach = attach;
    }

    public String getAttach() 
    {
        return attach;
    }
    public void setIsexamine(Integer isexamine) 
    {
        this.isexamine = isexamine;
    }

    public Integer getIsexamine() 
    {
        return isexamine;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setExamineman(String examineman) 
    {
        this.examineman = examineman;
    }

    public String getExamineman() 
    {
        return examineman;
    }
    public void setExaminetime(Date examinetime) 
    {
        this.examinetime = examinetime;
    }

    public Date getExaminetime() 
    {
        return examinetime;
    }
    public void setUnitid(Integer unitid) 
    {
        this.unitid = unitid;
    }

    public Integer getUnitid() 
    {
        return unitid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("theme", getTheme())
            .append("priceman", getPriceman())
            .append("clients", getClients())
            .append("reiceiver", getReiceiver())
            .append("pricetime", getPricetime())
            .append("count", getCount())
            .append("salechance", getSalechance())
            .append("jiaofuintro", getJiaofuintro())
            .append("topayintro", getTopayintro())
            .append("packageexpintro", getPackageexpintro())
            .append("memo", getMemo())
            .append("attach", getAttach())
            .append("isexamine", getIsexamine())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .append("examineman", getExamineman())
            .append("examinetime", getExaminetime())
            .append("unitid", getUnitid())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
