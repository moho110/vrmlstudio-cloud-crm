package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 行政考勤补登对象 cmf_edu_xingzheng_kaoqinbudeng
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengKaoqinbudeng extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String term;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String department;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String person;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date time;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String day;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date classs;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String budengproject;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String budengstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workflowid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String exman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String extime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String personname;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTerm(String term) 
    {
        this.term = term;
    }

    public String getTerm() 
    {
        return term;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setPerson(String person) 
    {
        this.person = person;
    }

    public String getPerson() 
    {
        return person;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setDay(String day) 
    {
        this.day = day;
    }

    public String getDay() 
    {
        return day;
    }
    public void setClasss(Date classs)
    {
        this.classs = classs;
    }

    public Date getClasss()
    {
        return classs;
    }
    public void setBudengproject(String budengproject) 
    {
        this.budengproject = budengproject;
    }

    public String getBudengproject() 
    {
        return budengproject;
    }
    public void setBudengstatus(String budengstatus) 
    {
        this.budengstatus = budengstatus;
    }

    public String getBudengstatus() 
    {
        return budengstatus;
    }
    public void setWorkflowid(String workflowid) 
    {
        this.workflowid = workflowid;
    }

    public String getWorkflowid() 
    {
        return workflowid;
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
    public void setPersonname(String personname) 
    {
        this.personname = personname;
    }

    public String getPersonname() 
    {
        return personname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("term", getTerm())
            .append("department", getDepartment())
            .append("person", getPerson())
            .append("time", getTime())
            .append("day", getDay())
            .append("classs", getClasss())
            .append("budengproject", getBudengproject())
            .append("budengstatus", getBudengstatus())
            .append("workflowid", getWorkflowid())
            .append("exman", getExman())
            .append("extime", getExtime())
            .append("personname", getPersonname())
            .toString();
    }
}
