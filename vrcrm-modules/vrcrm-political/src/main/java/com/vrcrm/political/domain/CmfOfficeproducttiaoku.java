package com.vrcrm.political.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 办公用品调库对象 cmf_officeproducttiaoku
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfOfficeproducttiaoku extends BaseEntity
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
    private String transferoutwarehouse;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String transferinwarehouse;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long transferquantity;

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

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long isexamine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date extime;

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
    public void setTransferoutwarehouse(String transferoutwarehouse) 
    {
        this.transferoutwarehouse = transferoutwarehouse;
    }

    public String getTransferoutwarehouse() 
    {
        return transferoutwarehouse;
    }
    public void setTransferinwarehouse(String transferinwarehouse) 
    {
        this.transferinwarehouse = transferinwarehouse;
    }

    public String getTransferinwarehouse() 
    {
        return transferinwarehouse;
    }
    public void setTransferquantity(Long transferquantity) 
    {
        this.transferquantity = transferquantity;
    }

    public Long getTransferquantity() 
    {
        return transferquantity;
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
    public void setIsexamine(Long isexamine) 
    {
        this.isexamine = isexamine;
    }

    public Long getIsexamine() 
    {
        return isexamine;
    }
    public void setExtime(Date extime) 
    {
        this.extime = extime;
    }

    public Date getExtime() 
    {
        return extime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("officename", getOfficename())
            .append("officeno", getOfficeno())
            .append("transferoutwarehouse", getTransferoutwarehouse())
            .append("transferinwarehouse", getTransferinwarehouse())
            .append("transferquantity", getTransferquantity())
            .append("staffman", getStaffman())
            .append("approvalman", getApprovalman())
            .append("memo", getMemo())
            .append("creator", getCreator())
            .append("creattime", getCreattime())
            .append("price", getPrice())
            .append("quantity", getQuantity())
            .append("count", getCount())
            .append("isexamine", getIsexamine())
            .append("extime", getExtime())
            .toString();
    }
}
