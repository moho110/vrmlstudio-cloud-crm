package com.vrcrm.xsystem.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 系统日志对象 cmf_system_log
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSystemLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String loginaction;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date date;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String remoteAddr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date httpUserAgent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long queryString;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date scriptName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sqltext;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setLoginaction(String loginaction) 
    {
        this.loginaction = loginaction;
    }

    public String getLoginaction() 
    {
        return loginaction;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setRemoteAddr(String remoteAddr) 
    {
        this.remoteAddr = remoteAddr;
    }

    public String getRemoteAddr() 
    {
        return remoteAddr;
    }
    public void setHttpUserAgent(Date httpUserAgent) 
    {
        this.httpUserAgent = httpUserAgent;
    }

    public Date getHttpUserAgent() 
    {
        return httpUserAgent;
    }
    public void setQueryString(Long queryString) 
    {
        this.queryString = queryString;
    }

    public Long getQueryString() 
    {
        return queryString;
    }
    public void setScriptName(Date scriptName) 
    {
        this.scriptName = scriptName;
    }

    public Date getScriptName() 
    {
        return scriptName;
    }
    public void setUserid(String userid) 
    {
        this.userid = userid;
    }

    public String getUserid() 
    {
        return userid;
    }
    public void setSqltext(String sqltext) 
    {
        this.sqltext = sqltext;
    }

    public String getSqltext() 
    {
        return sqltext;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("loginaction", getLoginaction())
            .append("date", getDate())
            .append("remoteAddr", getRemoteAddr())
            .append("httpUserAgent", getHttpUserAgent())
            .append("queryString", getQueryString())
            .append("scriptName", getScriptName())
            .append("userid", getUserid())
            .append("sqltext", getSqltext())
            .toString();
    }
}
