package com.vrcrm.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 行政加班补休对象 cmf_edu_xingzheng_jiabanbuxiu
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengJiabanbuxiu extends BaseEntity
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
    private Date delayworktime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String delayworknum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date buxiutime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String buxiuclass;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long delayworkstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long delayworkid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String delayworkman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String delayworkextime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long buxiustatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long buxiuflowid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String buxiuexman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String buxiuextime;

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
    public void setDelayworktime(Date delayworktime) 
    {
        this.delayworktime = delayworktime;
    }

    public Date getDelayworktime() 
    {
        return delayworktime;
    }
    public void setDelayworknum(String delayworknum) 
    {
        this.delayworknum = delayworknum;
    }

    public String getDelayworknum() 
    {
        return delayworknum;
    }
    public void setBuxiutime(Date buxiutime) 
    {
        this.buxiutime = buxiutime;
    }

    public Date getBuxiutime() 
    {
        return buxiutime;
    }
    public void setBuxiuclass(String buxiuclass) 
    {
        this.buxiuclass = buxiuclass;
    }

    public String getBuxiuclass() 
    {
        return buxiuclass;
    }
    public void setDelayworkstatus(Long delayworkstatus) 
    {
        this.delayworkstatus = delayworkstatus;
    }

    public Long getDelayworkstatus() 
    {
        return delayworkstatus;
    }
    public void setDelayworkid(Long delayworkid) 
    {
        this.delayworkid = delayworkid;
    }

    public Long getDelayworkid() 
    {
        return delayworkid;
    }
    public void setDelayworkman(String delayworkman) 
    {
        this.delayworkman = delayworkman;
    }

    public String getDelayworkman() 
    {
        return delayworkman;
    }
    public void setDelayworkextime(String delayworkextime) 
    {
        this.delayworkextime = delayworkextime;
    }

    public String getDelayworkextime() 
    {
        return delayworkextime;
    }
    public void setBuxiustatus(Long buxiustatus) 
    {
        this.buxiustatus = buxiustatus;
    }

    public Long getBuxiustatus() 
    {
        return buxiustatus;
    }
    public void setBuxiuflowid(Long buxiuflowid) 
    {
        this.buxiuflowid = buxiuflowid;
    }

    public Long getBuxiuflowid() 
    {
        return buxiuflowid;
    }
    public void setBuxiuexman(String buxiuexman) 
    {
        this.buxiuexman = buxiuexman;
    }

    public String getBuxiuexman() 
    {
        return buxiuexman;
    }
    public void setBuxiuextime(String buxiuextime) 
    {
        this.buxiuextime = buxiuextime;
    }

    public String getBuxiuextime() 
    {
        return buxiuextime;
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
            .append("delayworktime", getDelayworktime())
            .append("delayworknum", getDelayworknum())
            .append("buxiutime", getBuxiutime())
            .append("buxiuclass", getBuxiuclass())
            .append("delayworkstatus", getDelayworkstatus())
            .append("delayworkid", getDelayworkid())
            .append("delayworkman", getDelayworkman())
            .append("delayworkextime", getDelayworkextime())
            .append("buxiustatus", getBuxiustatus())
            .append("buxiuflowid", getBuxiuflowid())
            .append("buxiuexman", getBuxiuexman())
            .append("buxiuextime", getBuxiuextime())
            .append("personname", getPersonname())
            .toString();
    }
}
