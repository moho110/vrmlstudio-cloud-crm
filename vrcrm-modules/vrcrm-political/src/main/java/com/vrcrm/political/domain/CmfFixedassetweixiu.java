package com.vrcrm.political.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 固定资产维修对象 cmf_fixedassetweixiu
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfFixedassetweixiu extends BaseEntity
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
    private String repairunit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String repairman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String thingintro;

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
    private Date creattime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long quantity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal count;

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
    public void setRepairunit(String repairunit) 
    {
        this.repairunit = repairunit;
    }

    public String getRepairunit() 
    {
        return repairunit;
    }
    public void setRepairman(String repairman) 
    {
        this.repairman = repairman;
    }

    public String getRepairman() 
    {
        return repairman;
    }
    public void setThingintro(String thingintro) 
    {
        this.thingintro = thingintro;
    }

    public String getThingintro() 
    {
        return thingintro;
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
    public void setCreattime(Date creattime) 
    {
        this.creattime = creattime;
    }

    public Date getCreattime() 
    {
        return creattime;
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
            .append("repairunit", getRepairunit())
            .append("repairman", getRepairman())
            .append("thingintro", getThingintro())
            .append("approvalman", getApprovalman())
            .append("memo", getMemo())
            .append("creator", getCreator())
            .append("creattime", getCreattime())
            .append("price", getPrice())
            .append("quantity", getQuantity())
            .append("count", getCount())
            .toString();
    }
}
