package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 工作人员职称对象 cmf_hrms_worker_zhicheng
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfHrmsWorkerZhicheng extends BaseEntity
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
    private String staffname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date gettime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String agency;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String indepartment;

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
    public void setStaffname(String staffname) 
    {
        this.staffname = staffname;
    }

    public String getStaffname() 
    {
        return staffname;
    }
    public void setGettime(Date gettime) 
    {
        this.gettime = gettime;
    }

    public Date getGettime() 
    {
        return gettime;
    }
    public void setAgency(String agency) 
    {
        this.agency = agency;
    }

    public String getAgency() 
    {
        return agency;
    }
    public void setIndepartment(String indepartment) 
    {
        this.indepartment = indepartment;
    }

    public String getIndepartment() 
    {
        return indepartment;
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
            .append("workid", getWorkid())
            .append("name", getName())
            .append("staffname", getStaffname())
            .append("gettime", getGettime())
            .append("agency", getAgency())
            .append("indepartment", getIndepartment())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
