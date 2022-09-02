package com.vrcrm.political.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 办公用品归还对象 cmf_officeproducttui
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfOfficeproducttui extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String officename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String officeno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String quitwarehouse;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long quitwarequantity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String quitobjects;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staffman;

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
    public void setOfficename(String officename) 
    {
        this.officename = officename;
    }

    public String getOfficename() 
    {
        return officename;
    }
    public void setOfficeno(String officeno) 
    {
        this.officeno = officeno;
    }

    public String getOfficeno() 
    {
        return officeno;
    }
    public void setQuitwarehouse(String quitwarehouse) 
    {
        this.quitwarehouse = quitwarehouse;
    }

    public String getQuitwarehouse() 
    {
        return quitwarehouse;
    }
    public void setQuitwarequantity(Long quitwarequantity) 
    {
        this.quitwarequantity = quitwarequantity;
    }

    public Long getQuitwarequantity() 
    {
        return quitwarequantity;
    }
    public void setQuitobjects(String quitobjects) 
    {
        this.quitobjects = quitobjects;
    }

    public String getQuitobjects() 
    {
        return quitobjects;
    }
    public void setStaffman(String staffman) 
    {
        this.staffman = staffman;
    }

    public String getStaffman() 
    {
        return staffman;
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
            .append("officename", getOfficename())
            .append("officeno", getOfficeno())
            .append("quitwarehouse", getQuitwarehouse())
            .append("quitwarequantity", getQuitwarequantity())
            .append("quitobjects", getQuitobjects())
            .append("staffman", getStaffman())
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
