package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 招聘计划对象 cmf_hrms_zpjihua
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfHrmsZpjihua extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String need;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long personnumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date starttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applyman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date applytime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String exman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String extime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String exstatus;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setNeed(String need) 
    {
        this.need = need;
    }

    public String getNeed() 
    {
        return need;
    }
    public void setPersonnumber(Long personnumber) 
    {
        this.personnumber = personnumber;
    }

    public Long getPersonnumber() 
    {
        return personnumber;
    }
    public void setStarttime(Date starttime) 
    {
        this.starttime = starttime;
    }

    public Date getStarttime() 
    {
        return starttime;
    }
    public void setEndtime(Date endtime) 
    {
        this.endtime = endtime;
    }

    public Date getEndtime() 
    {
        return endtime;
    }
    public void setApplyman(String applyman) 
    {
        this.applyman = applyman;
    }

    public String getApplyman() 
    {
        return applyman;
    }
    public void setApplytime(Date applytime) 
    {
        this.applytime = applytime;
    }

    public Date getApplytime() 
    {
        return applytime;
    }
    public void setExman(String exman) 
    {
        this.exman = exman;
    }

    public String getExman() 
    {
        return exman;
    }
    public void setExtime(String extime) 
    {
        this.extime = extime;
    }

    public String getExtime() 
    {
        return extime;
    }
    public void setExstatus(String exstatus) 
    {
        this.exstatus = exstatus;
    }

    public String getExstatus() 
    {
        return exstatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("sex", getSex())
            .append("need", getNeed())
            .append("personnumber", getPersonnumber())
            .append("starttime", getStarttime())
            .append("endtime", getEndtime())
            .append("applyman", getApplyman())
            .append("applytime", getApplytime())
            .append("exman", getExman())
            .append("extime", getExtime())
            .append("exstatus", getExstatus())
            .toString();
    }
}
