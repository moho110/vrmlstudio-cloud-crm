package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 行政调休补班对象 cmf_edu_xingzheng_tiaoxiububan
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengTiaoxiububan extends BaseEntity
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
    private Date tiaoxiutime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tiaoxiustart;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date bubantime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bubanstart;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tiaoxiuexstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tiaoxiuworkflowid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tiaoxiuexman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tiaoxiuextime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bubanexstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long bubanworkflowid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bubanexman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bubanextime;

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
    public void setTiaoxiutime(Date tiaoxiutime) 
    {
        this.tiaoxiutime = tiaoxiutime;
    }

    public Date getTiaoxiutime() 
    {
        return tiaoxiutime;
    }
    public void setTiaoxiustart(String tiaoxiustart) 
    {
        this.tiaoxiustart = tiaoxiustart;
    }

    public String getTiaoxiustart() 
    {
        return tiaoxiustart;
    }
    public void setBubantime(Date bubantime) 
    {
        this.bubantime = bubantime;
    }

    public Date getBubantime() 
    {
        return bubantime;
    }
    public void setBubanstart(String bubanstart) 
    {
        this.bubanstart = bubanstart;
    }

    public String getBubanstart() 
    {
        return bubanstart;
    }
    public void setTiaoxiuexstatus(Long tiaoxiuexstatus) 
    {
        this.tiaoxiuexstatus = tiaoxiuexstatus;
    }

    public Long getTiaoxiuexstatus() 
    {
        return tiaoxiuexstatus;
    }
    public void setTiaoxiuworkflowid(Long tiaoxiuworkflowid) 
    {
        this.tiaoxiuworkflowid = tiaoxiuworkflowid;
    }

    public Long getTiaoxiuworkflowid() 
    {
        return tiaoxiuworkflowid;
    }
    public void setTiaoxiuexman(String tiaoxiuexman) 
    {
        this.tiaoxiuexman = tiaoxiuexman;
    }

    public String getTiaoxiuexman() 
    {
        return tiaoxiuexman;
    }
    public void setTiaoxiuextime(String tiaoxiuextime) 
    {
        this.tiaoxiuextime = tiaoxiuextime;
    }

    public String getTiaoxiuextime() 
    {
        return tiaoxiuextime;
    }
    public void setBubanexstatus(Long bubanexstatus) 
    {
        this.bubanexstatus = bubanexstatus;
    }

    public Long getBubanexstatus() 
    {
        return bubanexstatus;
    }
    public void setBubanworkflowid(Long bubanworkflowid) 
    {
        this.bubanworkflowid = bubanworkflowid;
    }

    public Long getBubanworkflowid() 
    {
        return bubanworkflowid;
    }
    public void setBubanexman(String bubanexman) 
    {
        this.bubanexman = bubanexman;
    }

    public String getBubanexman() 
    {
        return bubanexman;
    }
    public void setBubanextime(String bubanextime) 
    {
        this.bubanextime = bubanextime;
    }

    public String getBubanextime() 
    {
        return bubanextime;
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
            .append("tiaoxiutime", getTiaoxiutime())
            .append("tiaoxiustart", getTiaoxiustart())
            .append("bubantime", getBubantime())
            .append("bubanstart", getBubanstart())
            .append("tiaoxiuexstatus", getTiaoxiuexstatus())
            .append("tiaoxiuworkflowid", getTiaoxiuworkflowid())
            .append("tiaoxiuexman", getTiaoxiuexman())
            .append("tiaoxiuextime", getTiaoxiuextime())
            .append("bubanexstatus", getBubanexstatus())
            .append("bubanworkflowid", getBubanworkflowid())
            .append("bubanexman", getBubanexman())
            .append("bubanextime", getBubanextime())
            .append("personname", getPersonname())
            .toString();
    }
}
