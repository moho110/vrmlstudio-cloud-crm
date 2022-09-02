package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 行政调班项目对象 cmf_edu_xingzheng_tiaobanxianghu
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengTiaobanxianghu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String term;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String oridepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String oriperson;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date oristarttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String oristart;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String newdepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String newcruit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date newstarttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String newstart;

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
    private String oripersonname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String newpersonname;

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
    public void setOridepartment(String oridepartment) 
    {
        this.oridepartment = oridepartment;
    }

    public String getOridepartment() 
    {
        return oridepartment;
    }
    public void setOriperson(String oriperson) 
    {
        this.oriperson = oriperson;
    }

    public String getOriperson() 
    {
        return oriperson;
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
    public void setNewdepartment(String newdepartment) 
    {
        this.newdepartment = newdepartment;
    }

    public String getNewdepartment() 
    {
        return newdepartment;
    }
    public void setNewcruit(String newcruit) 
    {
        this.newcruit = newcruit;
    }

    public String getNewcruit() 
    {
        return newcruit;
    }
    public void setNewstarttime(Date newstarttime) 
    {
        this.newstarttime = newstarttime;
    }

    public Date getNewstarttime() 
    {
        return newstarttime;
    }
    public void setNewstart(String newstart) 
    {
        this.newstart = newstart;
    }

    public String getNewstart() 
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
    public void setOripersonname(String oripersonname) 
    {
        this.oripersonname = oripersonname;
    }

    public String getOripersonname() 
    {
        return oripersonname;
    }
    public void setNewpersonname(String newpersonname) 
    {
        this.newpersonname = newpersonname;
    }

    public String getNewpersonname() 
    {
        return newpersonname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("term", getTerm())
            .append("oridepartment", getOridepartment())
            .append("oriperson", getOriperson())
            .append("oristarttime", getOristarttime())
            .append("oristart", getOristart())
            .append("newdepartment", getNewdepartment())
            .append("newcruit", getNewcruit())
            .append("newstarttime", getNewstarttime())
            .append("newstart", getNewstart())
            .append("exstatus", getExstatus())
            .append("workflowid", getWorkflowid())
            .append("exman", getExman())
            .append("extime", getExtime())
            .append("oripersonname", getOripersonname())
            .append("newpersonname", getNewpersonname())
            .toString();
    }
}
