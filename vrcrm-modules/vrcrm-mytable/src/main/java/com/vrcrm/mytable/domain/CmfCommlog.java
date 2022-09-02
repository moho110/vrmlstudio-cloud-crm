package com.vrcrm.mytable.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 通用日志对象 cmf_commlog
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfCommlog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sysuser;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long customerid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String commdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String linkmanid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String project;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String productid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectphase;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String iscompete;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String comminfo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String moniterinfo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String moniterman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userFlag;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setSysuser(String sysuser) 
    {
        this.sysuser = sysuser;
    }

    public String getSysuser() 
    {
        return sysuser;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setCustomerid(Long customerid) 
    {
        this.customerid = customerid;
    }

    public Long getCustomerid() 
    {
        return customerid;
    }
    public void setCommdate(String commdate) 
    {
        this.commdate = commdate;
    }

    public String getCommdate() 
    {
        return commdate;
    }
    public void setLinkmanid(String linkmanid) 
    {
        this.linkmanid = linkmanid;
    }

    public String getLinkmanid() 
    {
        return linkmanid;
    }
    public void setProject(String project) 
    {
        this.project = project;
    }

    public String getProject() 
    {
        return project;
    }
    public void setProductid(String productid) 
    {
        this.productid = productid;
    }

    public String getProductid() 
    {
        return productid;
    }
    public void setProjectphase(String projectphase) 
    {
        this.projectphase = projectphase;
    }

    public String getProjectphase() 
    {
        return projectphase;
    }
    public void setIscompete(String iscompete) 
    {
        this.iscompete = iscompete;
    }

    public String getIscompete() 
    {
        return iscompete;
    }
    public void setComminfo(String comminfo) 
    {
        this.comminfo = comminfo;
    }

    public String getComminfo() 
    {
        return comminfo;
    }
    public void setMoniterinfo(String moniterinfo) 
    {
        this.moniterinfo = moniterinfo;
    }

    public String getMoniterinfo() 
    {
        return moniterinfo;
    }
    public void setMoniterman(String moniterman) 
    {
        this.moniterman = moniterman;
    }

    public String getMoniterman() 
    {
        return moniterman;
    }
    public void setUserFlag(String userFlag) 
    {
        this.userFlag = userFlag;
    }

    public String getUserFlag() 
    {
        return userFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("sysuser", getSysuser())
            .append("userId", getUserId())
            .append("customerid", getCustomerid())
            .append("commdate", getCommdate())
            .append("linkmanid", getLinkmanid())
            .append("project", getProject())
            .append("productid", getProductid())
            .append("projectphase", getProjectphase())
            .append("iscompete", getIscompete())
            .append("comminfo", getComminfo())
            .append("moniterinfo", getMoniterinfo())
            .append("moniterman", getMoniterman())
            .append("userFlag", getUserFlag())
            .toString();
    }
}
