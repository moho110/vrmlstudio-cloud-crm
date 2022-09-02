package com.vrcrm.mytable.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 事务对象 cmf_affair
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfAffair extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date beginTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date remindDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date remindTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lastRemind;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sms2Remind;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lastSms2Remind;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String managerId;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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
    public void setBeginTime(Date beginTime) 
    {
        this.beginTime = beginTime;
    }

    public Date getBeginTime() 
    {
        return beginTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setRemindDate(Date remindDate) 
    {
        this.remindDate = remindDate;
    }

    public Date getRemindDate() 
    {
        return remindDate;
    }
    public void setRemindTime(Date remindTime) 
    {
        this.remindTime = remindTime;
    }

    public Date getRemindTime() 
    {
        return remindTime;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setLastRemind(Date lastRemind) 
    {
        this.lastRemind = lastRemind;
    }

    public Date getLastRemind() 
    {
        return lastRemind;
    }
    public void setSms2Remind(String sms2Remind) 
    {
        this.sms2Remind = sms2Remind;
    }

    public String getSms2Remind() 
    {
        return sms2Remind;
    }
    public void setLastSms2Remind(Date lastSms2Remind) 
    {
        this.lastSms2Remind = lastSms2Remind;
    }

    public Date getLastSms2Remind() 
    {
        return lastSms2Remind;
    }
    public void setManagerId(String managerId) 
    {
        this.managerId = managerId;
    }

    public String getManagerId() 
    {
        return managerId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("beginTime", getBeginTime())
            .append("endTime", getEndTime())
            .append("type", getType())
            .append("remindDate", getRemindDate())
            .append("remindTime", getRemindTime())
            .append("content", getContent())
            .append("lastRemind", getLastRemind())
            .append("sms2Remind", getSms2Remind())
            .append("lastSms2Remind", getLastSms2Remind())
            .append("managerId", getManagerId())
            .toString();
    }
}
