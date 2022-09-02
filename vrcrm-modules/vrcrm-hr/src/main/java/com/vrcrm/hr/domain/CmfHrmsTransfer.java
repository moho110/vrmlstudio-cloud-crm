package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 转职明细对象 cmf_hrms_transfer
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfHrmsTransfer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date transferdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String indepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String afterdep;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beforestaff;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String afterstaff;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beforegangwei;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String aftergangwei;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String transferreason;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staffman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jobssituation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String transfertype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date creattime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setWorkid(String workid) 
    {
        this.workid = workid;
    }

    public String getWorkid() 
    {
        return workid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setTransferdate(Date transferdate) 
    {
        this.transferdate = transferdate;
    }

    public Date getTransferdate() 
    {
        return transferdate;
    }
    public void setIndepartment(String indepartment) 
    {
        this.indepartment = indepartment;
    }

    public String getIndepartment() 
    {
        return indepartment;
    }
    public void setAfterdep(String afterdep) 
    {
        this.afterdep = afterdep;
    }

    public String getAfterdep() 
    {
        return afterdep;
    }
    public void setBeforestaff(String beforestaff) 
    {
        this.beforestaff = beforestaff;
    }

    public String getBeforestaff() 
    {
        return beforestaff;
    }
    public void setAfterstaff(String afterstaff) 
    {
        this.afterstaff = afterstaff;
    }

    public String getAfterstaff() 
    {
        return afterstaff;
    }
    public void setBeforegangwei(String beforegangwei) 
    {
        this.beforegangwei = beforegangwei;
    }

    public String getBeforegangwei() 
    {
        return beforegangwei;
    }
    public void setAftergangwei(String aftergangwei) 
    {
        this.aftergangwei = aftergangwei;
    }

    public String getAftergangwei() 
    {
        return aftergangwei;
    }
    public void setTransferreason(String transferreason) 
    {
        this.transferreason = transferreason;
    }

    public String getTransferreason() 
    {
        return transferreason;
    }
    public void setStaffman(String staffman) 
    {
        this.staffman = staffman;
    }

    public String getStaffman() 
    {
        return staffman;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setJobssituation(String jobssituation) 
    {
        this.jobssituation = jobssituation;
    }

    public String getJobssituation() 
    {
        return jobssituation;
    }
    public void setTransfertype(String transfertype) 
    {
        this.transfertype = transfertype;
    }

    public String getTransfertype() 
    {
        return transfertype;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("workid", getWorkid())
            .append("name", getName())
            .append("transferdate", getTransferdate())
            .append("indepartment", getIndepartment())
            .append("afterdep", getAfterdep())
            .append("beforestaff", getBeforestaff())
            .append("afterstaff", getAfterstaff())
            .append("beforegangwei", getBeforegangwei())
            .append("aftergangwei", getAftergangwei())
            .append("transferreason", getTransferreason())
            .append("staffman", getStaffman())
            .append("memo", getMemo())
            .append("jobssituation", getJobssituation())
            .append("transfertype", getTransfertype())
            .append("creator", getCreator())
            .append("creattime", getCreattime())
            .toString();
    }
}
