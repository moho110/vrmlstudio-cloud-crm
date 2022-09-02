package com.vrcrm.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 中层干部被评人员明细对象 cmf_edu_zhongcengrenyuan
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduZhongcengrenyuan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String testname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String testmanby;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staff;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pindedesp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pindeself;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String abillitydesp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String abillityself;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String studydesp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String studyself;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jixiaodesp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jixiaoself;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String lianzhengdesp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String lianzhengself;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String attach;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTestname(String testname) 
    {
        this.testname = testname;
    }

    public String getTestname() 
    {
        return testname;
    }
    public void setTestmanby(String testmanby) 
    {
        this.testmanby = testmanby;
    }

    public String getTestmanby() 
    {
        return testmanby;
    }
    public void setUit(String uit) 
    {
        this.uit = uit;
    }

    public String getUit() 
    {
        return uit;
    }
    public void setStaff(String staff) 
    {
        this.staff = staff;
    }

    public String getStaff() 
    {
        return staff;
    }
    public void setPindedesp(String pindedesp) 
    {
        this.pindedesp = pindedesp;
    }

    public String getPindedesp() 
    {
        return pindedesp;
    }
    public void setPindeself(String pindeself) 
    {
        this.pindeself = pindeself;
    }

    public String getPindeself() 
    {
        return pindeself;
    }
    public void setAbillitydesp(String abillitydesp) 
    {
        this.abillitydesp = abillitydesp;
    }

    public String getAbillitydesp() 
    {
        return abillitydesp;
    }
    public void setAbillityself(String abillityself) 
    {
        this.abillityself = abillityself;
    }

    public String getAbillityself() 
    {
        return abillityself;
    }
    public void setStudydesp(String studydesp) 
    {
        this.studydesp = studydesp;
    }

    public String getStudydesp() 
    {
        return studydesp;
    }
    public void setStudyself(String studyself) 
    {
        this.studyself = studyself;
    }

    public String getStudyself() 
    {
        return studyself;
    }
    public void setJixiaodesp(String jixiaodesp) 
    {
        this.jixiaodesp = jixiaodesp;
    }

    public String getJixiaodesp() 
    {
        return jixiaodesp;
    }
    public void setJixiaoself(String jixiaoself) 
    {
        this.jixiaoself = jixiaoself;
    }

    public String getJixiaoself() 
    {
        return jixiaoself;
    }
    public void setLianzhengdesp(String lianzhengdesp) 
    {
        this.lianzhengdesp = lianzhengdesp;
    }

    public String getLianzhengdesp() 
    {
        return lianzhengdesp;
    }
    public void setLianzhengself(String lianzhengself) 
    {
        this.lianzhengself = lianzhengself;
    }

    public String getLianzhengself() 
    {
        return lianzhengself;
    }
    public void setAttach(String attach) 
    {
        this.attach = attach;
    }

    public String getAttach() 
    {
        return attach;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("testname", getTestname())
            .append("testmanby", getTestmanby())
            .append("uit", getUit())
            .append("staff", getStaff())
            .append("pindedesp", getPindedesp())
            .append("pindeself", getPindeself())
            .append("abillitydesp", getAbillitydesp())
            .append("abillityself", getAbillityself())
            .append("studydesp", getStudydesp())
            .append("studyself", getStudyself())
            .append("jixiaodesp", getJixiaodesp())
            .append("jixiaoself", getJixiaoself())
            .append("lianzhengdesp", getLianzhengdesp())
            .append("lianzhengself", getLianzhengself())
            .append("attach", getAttach())
            .toString();
    }
}
