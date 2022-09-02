package com.vrcrm.political.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 固定资产报废对象 cmf_fixedassetbaofei
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfFixedassetbaofei extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String setname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String setno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String indepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date baofeitime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String baofeiapplyman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String approvalman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long quantity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal count;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setSetname(String setname) 
    {
        this.setname = setname;
    }

    public String getSetname() 
    {
        return setname;
    }
    public void setSetno(String setno) 
    {
        this.setno = setno;
    }

    public String getSetno() 
    {
        return setno;
    }
    public void setIndepartment(String indepartment) 
    {
        this.indepartment = indepartment;
    }

    public String getIndepartment() 
    {
        return indepartment;
    }
    public void setBaofeitime(Date baofeitime) 
    {
        this.baofeitime = baofeitime;
    }

    public Date getBaofeitime() 
    {
        return baofeitime;
    }
    public void setBaofeiapplyman(String baofeiapplyman) 
    {
        this.baofeiapplyman = baofeiapplyman;
    }

    public String getBaofeiapplyman() 
    {
        return baofeiapplyman;
    }
    public void setApprovalman(String approvalman) 
    {
        this.approvalman = approvalman;
    }

    public String getApprovalman() 
    {
        return approvalman;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setCount(BigDecimal count) 
    {
        this.count = count;
    }

    public BigDecimal getCount() 
    {
        return count;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("setname", getSetname())
            .append("setno", getSetno())
            .append("indepartment", getIndepartment())
            .append("baofeitime", getBaofeitime())
            .append("baofeiapplyman", getBaofeiapplyman())
            .append("approvalman", getApprovalman())
            .append("memo", getMemo())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .append("price", getPrice())
            .append("quantity", getQuantity())
            .append("count", getCount())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
