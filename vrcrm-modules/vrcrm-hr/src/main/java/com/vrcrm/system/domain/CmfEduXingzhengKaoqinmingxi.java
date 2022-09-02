package com.vrcrm.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 考勤明细对象 cmf_edu_xingzheng_kaoqinmingxi
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengKaoqinmingxi extends BaseEntity
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
    private Date date;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long week;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String day;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classs;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startrealitycard;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startkaoqinstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String endrealitycard;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String endkaoqinstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startcardbgn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startcardend;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String endcartbgn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String endcardend;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startdelaytime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String delayminutesnum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String delayquittime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String earlyquitminutesnum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String personname;
    private Date createtime;

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
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setWeek(Long week) 
    {
        this.week = week;
    }

    public Long getWeek() 
    {
        return week;
    }
    public void setDay(String day) 
    {
        this.day = day;
    }

    public String getDay() 
    {
        return day;
    }
    public void setClasss(String classs)
    {
        this.classs = classs;
    }

    public String getClasss()
    {
        return classs;
    }
    public void setStartrealitycard(String startrealitycard) 
    {
        this.startrealitycard = startrealitycard;
    }

    public String getStartrealitycard() 
    {
        return startrealitycard;
    }
    public void setStartkaoqinstatus(String startkaoqinstatus) 
    {
        this.startkaoqinstatus = startkaoqinstatus;
    }

    public String getStartkaoqinstatus() 
    {
        return startkaoqinstatus;
    }
    public void setEndrealitycard(String endrealitycard) 
    {
        this.endrealitycard = endrealitycard;
    }

    public String getEndrealitycard() 
    {
        return endrealitycard;
    }
    public void setEndkaoqinstatus(String endkaoqinstatus) 
    {
        this.endkaoqinstatus = endkaoqinstatus;
    }

    public String getEndkaoqinstatus() 
    {
        return endkaoqinstatus;
    }
    public void setStartcardbgn(String startcardbgn) 
    {
        this.startcardbgn = startcardbgn;
    }

    public String getStartcardbgn() 
    {
        return startcardbgn;
    }
    public void setStartcardend(String startcardend) 
    {
        this.startcardend = startcardend;
    }

    public String getStartcardend() 
    {
        return startcardend;
    }
    public void setEndcartbgn(String endcartbgn) 
    {
        this.endcartbgn = endcartbgn;
    }

    public String getEndcartbgn() 
    {
        return endcartbgn;
    }
    public void setEndcardend(String endcardend) 
    {
        this.endcardend = endcardend;
    }

    public String getEndcardend() 
    {
        return endcardend;
    }
    public void setStartdelaytime(String startdelaytime) 
    {
        this.startdelaytime = startdelaytime;
    }

    public String getStartdelaytime() 
    {
        return startdelaytime;
    }
    public void setDelayminutesnum(String delayminutesnum) 
    {
        this.delayminutesnum = delayminutesnum;
    }

    public String getDelayminutesnum() 
    {
        return delayminutesnum;
    }
    public void setDelayquittime(String delayquittime) 
    {
        this.delayquittime = delayquittime;
    }

    public String getDelayquittime() 
    {
        return delayquittime;
    }
    public void setEarlyquitminutesnum(String earlyquitminutesnum) 
    {
        this.earlyquitminutesnum = earlyquitminutesnum;
    }

    public String getEarlyquitminutesnum() 
    {
        return earlyquitminutesnum;
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
            .append("date", getDate())
            .append("week", getWeek())
            .append("day", getDay())
            .append("classs", getClasss())
            .append("startrealitycard", getStartrealitycard())
            .append("startkaoqinstatus", getStartkaoqinstatus())
            .append("endrealitycard", getEndrealitycard())
            .append("endkaoqinstatus", getEndkaoqinstatus())
            .append("startcardbgn", getStartcardbgn())
            .append("startcardend", getStartcardend())
            .append("endcartbgn", getEndcartbgn())
            .append("endcardend", getEndcardend())
            .append("startdelaytime", getStartdelaytime())
            .append("delayminutesnum", getDelayminutesnum())
            .append("delayquittime", getDelayquittime())
            .append("earlyquitminutesnum", getEarlyquitminutesnum())
            .append("createtime", getCreatetime())
            .append("personname", getPersonname())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
