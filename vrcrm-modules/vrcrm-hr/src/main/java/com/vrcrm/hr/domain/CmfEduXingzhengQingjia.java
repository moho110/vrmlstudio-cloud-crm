package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 行政请假对象 cmf_edu_xingzheng_qingjia
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengQingjia extends BaseEntity
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
    private Long week;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classs;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qingjiatype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long exstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long workflowid;

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
    public void setWeek(Long week) 
    {
        this.week = week;
    }

    public Long getWeek() 
    {
        return week;
    }
    public void setClasss(String classs)
    {
        this.classs = classs;
    }

    public String getClasss()
    {
        return classs;
    }
    public void setQingjiatype(String qingjiatype) 
    {
        this.qingjiatype = qingjiatype;
    }

    public String getQingjiatype() 
    {
        return qingjiatype;
    }
    public void setExstatus(Long exstatus) 
    {
        this.exstatus = exstatus;
    }

    public Long getExstatus() 
    {
        return exstatus;
    }
    public void setWorkflowid(Long workflowid) 
    {
        this.workflowid = workflowid;
    }

    public Long getWorkflowid() 
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
            .append("week", getWeek())
            .append("classs", getClasss())
            .append("qingjiatype", getQingjiatype())
            .append("exstatus", getExstatus())
            .append("workflowid", getWorkflowid())
            .append("exman", getExman())
            .append("extime", getExtime())
            .append("personname", getPersonname())
            .toString();
    }
}
