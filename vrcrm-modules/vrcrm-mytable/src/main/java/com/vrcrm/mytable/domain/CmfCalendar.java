package com.vrcrm.mytable.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 日程安排对象 cmf_calendar
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfCalendar extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date calTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String calType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer calLevel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String managerId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String overStatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ifsms;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date tixingtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long guanlianid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setCalTime(Date calTime) 
    {
        this.calTime = calTime;
    }

    public Date getCalTime() 
    {
        return calTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setCalType(String calType) 
    {
        this.calType = calType;
    }

    public String getCalType() 
    {
        return calType;
    }
    public void setCalLevel(Integer calLevel) 
    {
        this.calLevel = calLevel;
    }

    public Integer getCalLevel() 
    {
        return calLevel;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setManagerId(String managerId) 
    {
        this.managerId = managerId;
    }

    public String getManagerId() 
    {
        return managerId;
    }
    public void setOverStatus(String overStatus) 
    {
        this.overStatus = overStatus;
    }

    public String getOverStatus() 
    {
        return overStatus;
    }
    public void setIfsms(Integer ifsms) 
    {
        this.ifsms = ifsms;
    }

    public Integer getIfsms() 
    {
        return ifsms;
    }
    public void setTixingtime(Date tixingtime) 
    {
        this.tixingtime = tixingtime;
    }

    public Date getTixingtime() 
    {
        return tixingtime;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setGuanlianid(Long guanlianid) 
    {
        this.guanlianid = guanlianid;
    }

    public Long getGuanlianid() 
    {
        return guanlianid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("calTime", getCalTime())
            .append("endTime", getEndTime())
            .append("calType", getCalType())
            .append("calLevel", getCalLevel())
            .append("content", getContent())
            .append("managerId", getManagerId())
            .append("overStatus", getOverStatus())
            .append("ifsms", getIfsms())
            .append("tixingtime", getTixingtime())
            .append("url", getUrl())
            .append("guanlianid", getGuanlianid())
            .toString();
    }
}
