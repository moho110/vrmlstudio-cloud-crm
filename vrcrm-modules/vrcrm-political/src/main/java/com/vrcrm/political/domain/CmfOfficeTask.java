package com.vrcrm.political.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 办公任务对象 cmf_office_task
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfOfficeTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String taskType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long interval;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date execTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lastExec;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String taskUrl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String taskName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String taskDesc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String taskCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String useFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sysTask;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTaskType(String taskType) 
    {
        this.taskType = taskType;
    }

    public String getTaskType() 
    {
        return taskType;
    }
    public void setInterval(Long interval) 
    {
        this.interval = interval;
    }

    public Long getInterval() 
    {
        return interval;
    }
    public void setExecTime(Date execTime) 
    {
        this.execTime = execTime;
    }

    public Date getExecTime() 
    {
        return execTime;
    }
    public void setLastExec(Date lastExec) 
    {
        this.lastExec = lastExec;
    }

    public Date getLastExec() 
    {
        return lastExec;
    }
    public void setTaskUrl(String taskUrl) 
    {
        this.taskUrl = taskUrl;
    }

    public String getTaskUrl() 
    {
        return taskUrl;
    }
    public void setTaskName(String taskName) 
    {
        this.taskName = taskName;
    }

    public String getTaskName() 
    {
        return taskName;
    }
    public void setTaskDesc(String taskDesc) 
    {
        this.taskDesc = taskDesc;
    }

    public String getTaskDesc() 
    {
        return taskDesc;
    }
    public void setTaskCode(String taskCode) 
    {
        this.taskCode = taskCode;
    }

    public String getTaskCode() 
    {
        return taskCode;
    }
    public void setUseFlag(String useFlag) 
    {
        this.useFlag = useFlag;
    }

    public String getUseFlag() 
    {
        return useFlag;
    }
    public void setSysTask(String sysTask) 
    {
        this.sysTask = sysTask;
    }

    public String getSysTask() 
    {
        return sysTask;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("taskType", getTaskType())
            .append("interval", getInterval())
            .append("execTime", getExecTime())
            .append("lastExec", getLastExec())
            .append("taskUrl", getTaskUrl())
            .append("taskName", getTaskName())
            .append("taskDesc", getTaskDesc())
            .append("taskCode", getTaskCode())
            .append("useFlag", getUseFlag())
            .append("sysTask", getSysTask())
            .toString();
    }
}
