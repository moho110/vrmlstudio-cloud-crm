package com.vrcrm.political.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 办公用品出库对象 cmf_officeproductout
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfOfficeproductout extends BaseEntity
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
    private String outwarehouse;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long outquantity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applyman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String outstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String isexamine;

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

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String returnlimited;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long isreturn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String returnreiceiver;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date realreturndate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date examinetime;
    private Date createtime;

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
    public void setOutwarehouse(String outwarehouse) 
    {
        this.outwarehouse = outwarehouse;
    }

    public String getOutwarehouse() 
    {
        return outwarehouse;
    }
    public void setOutquantity(Long outquantity) 
    {
        this.outquantity = outquantity;
    }

    public Long getOutquantity() 
    {
        return outquantity;
    }
    public void setApplyman(String applyman) 
    {
        this.applyman = applyman;
    }

    public String getApplyman() 
    {
        return applyman;
    }
    public void setOutstatus(String outstatus) 
    {
        this.outstatus = outstatus;
    }

    public String getOutstatus() 
    {
        return outstatus;
    }
    public void setIsexamine(String isexamine) 
    {
        this.isexamine = isexamine;
    }

    public String getIsexamine() 
    {
        return isexamine;
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
    public void setReturnlimited(String returnlimited) 
    {
        this.returnlimited = returnlimited;
    }

    public String getReturnlimited() 
    {
        return returnlimited;
    }
    public void setIsreturn(Long isreturn) 
    {
        this.isreturn = isreturn;
    }

    public Long getIsreturn() 
    {
        return isreturn;
    }
    public void setReturnreiceiver(String returnreiceiver) 
    {
        this.returnreiceiver = returnreiceiver;
    }

    public String getReturnreiceiver() 
    {
        return returnreiceiver;
    }
    public void setRealreturndate(Date realreturndate) 
    {
        this.realreturndate = realreturndate;
    }

    public Date getRealreturndate() 
    {
        return realreturndate;
    }
    public void setExaminetime(Date examinetime) 
    {
        this.examinetime = examinetime;
    }

    public Date getExaminetime() 
    {
        return examinetime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("officename", getOfficename())
            .append("officeno", getOfficeno())
            .append("outwarehouse", getOutwarehouse())
            .append("outquantity", getOutquantity())
            .append("applyman", getApplyman())
            .append("outstatus", getOutstatus())
            .append("isexamine", getIsexamine())
            .append("approvalman", getApprovalman())
            .append("memo", getMemo())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .append("price", getPrice())
            .append("quantity", getQuantity())
            .append("count", getCount())
            .append("returnlimited", getReturnlimited())
            .append("isreturn", getIsreturn())
            .append("returnreiceiver", getReturnreiceiver())
            .append("realreturndate", getRealreturndate())
            .append("examinetime", getExaminetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
