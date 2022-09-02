package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 人员奖惩对象 cmf_hrms_reward_punishment
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfHrmsRewardPunishment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String indepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String punishmentname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String punishmentreason;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String punishmentcontent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String approvaldep;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String approvalman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date approvaltime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date shengxiaobydate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String canceltime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cancelreason;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
    public void setIndepartment(String indepartment) 
    {
        this.indepartment = indepartment;
    }

    public String getIndepartment() 
    {
        return indepartment;
    }
    public void setPunishmentname(String punishmentname) 
    {
        this.punishmentname = punishmentname;
    }

    public String getPunishmentname() 
    {
        return punishmentname;
    }
    public void setPunishmentreason(String punishmentreason) 
    {
        this.punishmentreason = punishmentreason;
    }

    public String getPunishmentreason() 
    {
        return punishmentreason;
    }
    public void setPunishmentcontent(String punishmentcontent) 
    {
        this.punishmentcontent = punishmentcontent;
    }

    public String getPunishmentcontent() 
    {
        return punishmentcontent;
    }
    public void setApprovaldep(String approvaldep) 
    {
        this.approvaldep = approvaldep;
    }

    public String getApprovaldep() 
    {
        return approvaldep;
    }
    public void setApprovalman(String approvalman) 
    {
        this.approvalman = approvalman;
    }

    public String getApprovalman() 
    {
        return approvalman;
    }
    public void setApprovaltime(Date approvaltime) 
    {
        this.approvaltime = approvaltime;
    }

    public Date getApprovaltime() 
    {
        return approvaltime;
    }
    public void setShengxiaobydate(Date shengxiaobydate) 
    {
        this.shengxiaobydate = shengxiaobydate;
    }

    public Date getShengxiaobydate() 
    {
        return shengxiaobydate;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setCanceltime(String canceltime) 
    {
        this.canceltime = canceltime;
    }

    public String getCanceltime() 
    {
        return canceltime;
    }
    public void setCancelreason(String cancelreason) 
    {
        this.cancelreason = cancelreason;
    }

    public String getCancelreason() 
    {
        return cancelreason;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("status", getStatus())
            .append("workid", getWorkid())
            .append("name", getName())
            .append("indepartment", getIndepartment())
            .append("punishmentname", getPunishmentname())
            .append("punishmentreason", getPunishmentreason())
            .append("punishmentcontent", getPunishmentcontent())
            .append("approvaldep", getApprovaldep())
            .append("approvalman", getApprovalman())
            .append("approvaltime", getApprovaltime())
            .append("shengxiaobydate", getShengxiaobydate())
            .append("memo", getMemo())
            .append("canceltime", getCanceltime())
            .append("cancelreason", getCancelreason())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
