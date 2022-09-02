package com.vrcrm.mytable.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 工作报告对象 cmf_workreport
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfWorkreport extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date workdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shenheren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String piyu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date shenhetime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String state;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setWorkdate(Date workdate) 
    {
        this.workdate = workdate;
    }

    public Date getWorkdate() 
    {
        return workdate;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setShenheren(String shenheren) 
    {
        this.shenheren = shenheren;
    }

    public String getShenheren() 
    {
        return shenheren;
    }
    public void setPiyu(String piyu) 
    {
        this.piyu = piyu;
    }

    public String getPiyu() 
    {
        return piyu;
    }
    public void setShenhetime(Date shenhetime) 
    {
        this.shenhetime = shenhetime;
    }

    public Date getShenhetime() 
    {
        return shenhetime;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createman", getCreateman())
            .append("workdate", getWorkdate())
            .append("content", getContent())
            .append("createtime", getCreatetime())
            .append("shenheren", getShenheren())
            .append("piyu", getPiyu())
            .append("shenhetime", getShenhetime())
            .append("state", getState())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
