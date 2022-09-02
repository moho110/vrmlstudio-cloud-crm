package com.vrcrm.mytable.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 发送邮件对象 cmf_email
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEmail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fromId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String customers;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplys;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String others;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String subject;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date sendTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String attachmentId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String attachmentName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sendFlag;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setFromId(String fromId) 
    {
        this.fromId = fromId;
    }

    public String getFromId() 
    {
        return fromId;
    }
    public void setCustomers(String customers) 
    {
        this.customers = customers;
    }

    public String getCustomers() 
    {
        return customers;
    }
    public void setSupplys(String supplys) 
    {
        this.supplys = supplys;
    }

    public String getSupplys() 
    {
        return supplys;
    }
    public void setOthers(String others) 
    {
        this.others = others;
    }

    public String getOthers() 
    {
        return others;
    }
    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getSubject() 
    {
        return subject;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setSendTime(Date sendTime) 
    {
        this.sendTime = sendTime;
    }

    public Date getSendTime() 
    {
        return sendTime;
    }
    public void setAttachmentId(String attachmentId) 
    {
        this.attachmentId = attachmentId;
    }

    public String getAttachmentId() 
    {
        return attachmentId;
    }
    public void setAttachmentName(String attachmentName) 
    {
        this.attachmentName = attachmentName;
    }

    public String getAttachmentName() 
    {
        return attachmentName;
    }
    public void setSendFlag(Long sendFlag) 
    {
        this.sendFlag = sendFlag;
    }

    public Long getSendFlag() 
    {
        return sendFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fromId", getFromId())
            .append("customers", getCustomers())
            .append("supplys", getSupplys())
            .append("others", getOthers())
            .append("subject", getSubject())
            .append("content", getContent())
            .append("sendTime", getSendTime())
            .append("attachmentId", getAttachmentId())
            .append("attachmentName", getAttachmentName())
            .append("sendFlag", getSendFlag())
            .toString();
    }
}
