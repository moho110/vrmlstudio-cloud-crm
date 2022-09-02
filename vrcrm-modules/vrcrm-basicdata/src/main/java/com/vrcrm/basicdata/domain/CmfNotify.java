package com.vrcrm.basicdata.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 公告通知对象 cmf_notify
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfNotify extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String title;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String toUser;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date fromUser;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long attachment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ifread;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ifsms;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date grade;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long ifemail;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setToUser(String toUser) 
    {
        this.toUser = toUser;
    }

    public String getToUser() 
    {
        return toUser;
    }
    public void setFromUser(Date fromUser) 
    {
        this.fromUser = fromUser;
    }

    public Date getFromUser() 
    {
        return fromUser;
    }
    public void setAttachment(Long attachment) 
    {
        this.attachment = attachment;
    }

    public Long getAttachment() 
    {
        return attachment;
    }
    public void setIfread(String ifread) 
    {
        this.ifread = ifread;
    }

    public String getIfread() 
    {
        return ifread;
    }
    public void setIfsms(String ifsms) 
    {
        this.ifsms = ifsms;
    }

    public String getIfsms() 
    {
        return ifsms;
    }
    public void setGrade(Date grade) 
    {
        this.grade = grade;
    }

    public Date getGrade() 
    {
        return grade;
    }
    public void setIfemail(Long ifemail) 
    {
        this.ifemail = ifemail;
    }

    public Long getIfemail() 
    {
        return ifemail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("content", getContent())
            .append("toUser", getToUser())
            .append("fromUser", getFromUser())
            .append("attachment", getAttachment())
            .append("createtime", getCreatetime())
            .append("ifread", getIfread())
            .append("ifsms", getIfsms())
            .append("grade", getGrade())
            .append("ifemail", getIfemail())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
