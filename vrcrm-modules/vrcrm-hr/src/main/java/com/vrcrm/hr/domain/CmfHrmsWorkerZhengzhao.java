package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 工作人员证照对象 cmf_hrms_worker_zhengzhao
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfHrmsWorkerZhengzhao extends BaseEntity
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
    private String indepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String photo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certificationtype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certificationname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certificationscan;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date prizetime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String agency;

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
    public void setIndepartment(String indepartment) 
    {
        this.indepartment = indepartment;
    }

    public String getIndepartment() 
    {
        return indepartment;
    }
    public void setPhoto(String photo) 
    {
        this.photo = photo;
    }

    public String getPhoto() 
    {
        return photo;
    }
    public void setCertificationtype(String certificationtype) 
    {
        this.certificationtype = certificationtype;
    }

    public String getCertificationtype() 
    {
        return certificationtype;
    }
    public void setCertificationname(String certificationname) 
    {
        this.certificationname = certificationname;
    }

    public String getCertificationname() 
    {
        return certificationname;
    }
    public void setCertificationscan(String certificationscan) 
    {
        this.certificationscan = certificationscan;
    }

    public String getCertificationscan() 
    {
        return certificationscan;
    }
    public void setPrizetime(Date prizetime) 
    {
        this.prizetime = prizetime;
    }

    public Date getPrizetime() 
    {
        return prizetime;
    }
    public void setAgency(String agency) 
    {
        this.agency = agency;
    }

    public String getAgency() 
    {
        return agency;
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
            .append("indepartment", getIndepartment())
            .append("photo", getPhoto())
            .append("certificationtype", getCertificationtype())
            .append("certificationname", getCertificationname())
            .append("certificationscan", getCertificationscan())
            .append("prizetime", getPrizetime())
            .append("agency", getAgency())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
