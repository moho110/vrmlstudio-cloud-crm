package com.vrcrm.buy.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 费用申请对象 cmf_crm_feiyong_sq
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfCrmFeiyongSq extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String feetype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String count;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String feeuse;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date applydate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long clientname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String reimburseman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recorder;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer isexamine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String examinedate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cashier;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date paytime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bak;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String examineman;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setFeetype(String feetype) 
    {
        this.feetype = feetype;
    }

    public String getFeetype() 
    {
        return feetype;
    }
    public void setCount(String count) 
    {
        this.count = count;
    }

    public String getCount() 
    {
        return count;
    }
    public void setFeeuse(String feeuse) 
    {
        this.feeuse = feeuse;
    }

    public String getFeeuse() 
    {
        return feeuse;
    }
    public void setApplydate(Date applydate) 
    {
        this.applydate = applydate;
    }

    public Date getApplydate() 
    {
        return applydate;
    }
    public void setClientname(Long clientname) 
    {
        this.clientname = clientname;
    }

    public Long getClientname() 
    {
        return clientname;
    }
    public void setReimburseman(String reimburseman) 
    {
        this.reimburseman = reimburseman;
    }

    public String getReimburseman() 
    {
        return reimburseman;
    }
    public void setRecorder(String recorder) 
    {
        this.recorder = recorder;
    }

    public String getRecorder() 
    {
        return recorder;
    }
    public void setIsexamine(Integer isexamine) 
    {
        this.isexamine = isexamine;
    }

    public Integer getIsexamine() 
    {
        return isexamine;
    }
    public void setExaminedate(String examinedate) 
    {
        this.examinedate = examinedate;
    }

    public String getExaminedate() 
    {
        return examinedate;
    }
    public void setCashier(String cashier) 
    {
        this.cashier = cashier;
    }

    public String getCashier() 
    {
        return cashier;
    }
    public void setPaytime(Date paytime) 
    {
        this.paytime = paytime;
    }

    public Date getPaytime() 
    {
        return paytime;
    }
    public void setBak(String bak) 
    {
        this.bak = bak;
    }

    public String getBak() 
    {
        return bak;
    }
    public void setExamineman(String examineman) 
    {
        this.examineman = examineman;
    }

    public String getExamineman() 
    {
        return examineman;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("feetype", getFeetype())
            .append("count", getCount())
            .append("feeuse", getFeeuse())
            .append("applydate", getApplydate())
            .append("clientname", getClientname())
            .append("reimburseman", getReimburseman())
            .append("recorder", getRecorder())
            .append("isexamine", getIsexamine())
            .append("examinedate", getExaminedate())
            .append("cashier", getCashier())
            .append("paytime", getPaytime())
            .append("bak", getBak())
            .append("examineman", getExamineman())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
