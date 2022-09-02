package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 行政调班对象 cmf_edu_xingzheng_tiaoban
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengTiaoban extends BaseEntity
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
    private Date oristarttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String oristart;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String newstarttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date newstart;

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
    public void setOristarttime(Date oristarttime) 
    {
        this.oristarttime = oristarttime;
    }

    public Date getOristarttime() 
    {
        return oristarttime;
    }
    public void setOristart(String oristart) 
    {
        this.oristart = oristart;
    }

    public String getOristart() 
    {
        return oristart;
    }
    public void setNewstarttime(String newstarttime) 
    {
        this.newstarttime = newstarttime;
    }

    public String getNewstarttime() 
    {
        return newstarttime;
    }
    public void setNewstart(Date newstart) 
    {
        this.newstart = newstart;
    }

    public Date getNewstart() 
    {
        return newstart;
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
            .append("oristarttime", getOristarttime())
            .append("oristart", getOristart())
            .append("newstarttime", getNewstarttime())
            .append("newstart", getNewstart())
            .append("exstatus", getExstatus())
            .append("workflowid", getWorkflowid())
            .append("exman", getExman())
            .append("extime", getExtime())
            .append("personname", getPersonname())
            .toString();
    }
}
