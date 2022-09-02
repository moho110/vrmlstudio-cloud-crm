package com.vrcrm.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 日常费用对象 cmf_hrms_expense
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfHrmsExpense extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String indepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String feetype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String feenumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String usereason;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setWorkid(String workid) 
    {
        this.workid = workid;
    }

    public String getWorkid() 
    {
        return workid;
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
    public void setIndepartment(String indepartment) 
    {
        this.indepartment = indepartment;
    }

    public String getIndepartment() 
    {
        return indepartment;
    }
    public void setFeetype(String feetype) 
    {
        this.feetype = feetype;
    }

    public String getFeetype() 
    {
        return feetype;
    }
    public void setFeenumber(String feenumber) 
    {
        this.feenumber = feenumber;
    }

    public String getFeenumber() 
    {
        return feenumber;
    }
    public void setUsereason(String usereason) 
    {
        this.usereason = usereason;
    }

    public String getUsereason() 
    {
        return usereason;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("workid", getWorkid())
            .append("name", getName())
            .append("sex", getSex())
            .append("indepartment", getIndepartment())
            .append("feetype", getFeetype())
            .append("feenumber", getFeenumber())
            .append("usereason", getUsereason())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
