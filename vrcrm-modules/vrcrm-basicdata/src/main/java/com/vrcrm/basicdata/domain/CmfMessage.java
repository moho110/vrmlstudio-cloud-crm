package com.vrcrm.basicdata.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 消息明细对象 cmf_message
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfMessage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String msgtype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long guanlianid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date readtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer flag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date attime;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setUserid(String userid) 
    {
        this.userid = userid;
    }

    public String getUserid() 
    {
        return userid;
    }
    public void setMsgtype(String msgtype) 
    {
        this.msgtype = msgtype;
    }

    public String getMsgtype() 
    {
        return msgtype;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
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
    public void setReadtime(Date readtime) 
    {
        this.readtime = readtime;
    }

    public Date getReadtime() 
    {
        return readtime;
    }
    public void setFlag(Integer flag) 
    {
        this.flag = flag;
    }

    public Integer getFlag() 
    {
        return flag;
    }
    public void setAttime(Date attime) 
    {
        this.attime = attime;
    }

    public Date getAttime() 
    {
        return attime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userid", getUserid())
            .append("msgtype", getMsgtype())
            .append("content", getContent())
            .append("url", getUrl())
            .append("guanlianid", getGuanlianid())
            .append("createtime", getCreatetime())
            .append("readtime", getReadtime())
            .append("flag", getFlag())
            .append("attime", getAttime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
