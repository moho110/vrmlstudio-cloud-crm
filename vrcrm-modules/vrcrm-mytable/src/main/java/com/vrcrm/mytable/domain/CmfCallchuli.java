package com.vrcrm.mytable.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 来电处理对象 cmf_callchuli
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfCallchuli extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String customer;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String linkman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ifchuli;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date chulitime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String calltype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String callertype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long customerid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chulicontent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long linkmanid;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setCustomer(String customer) 
    {
        this.customer = customer;
    }

    public String getCustomer() 
    {
        return customer;
    }
    public void setLinkman(String linkman) 
    {
        this.linkman = linkman;
    }

    public String getLinkman() 
    {
        return linkman;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setIfchuli(Integer ifchuli) 
    {
        this.ifchuli = ifchuli;
    }

    public Integer getIfchuli() 
    {
        return ifchuli;
    }
    public void setChulitime(Date chulitime) 
    {
        this.chulitime = chulitime;
    }

    public Date getChulitime() 
    {
        return chulitime;
    }
    public void setCalltype(String calltype) 
    {
        this.calltype = calltype;
    }

    public String getCalltype() 
    {
        return calltype;
    }
    public void setCallertype(String callertype) 
    {
        this.callertype = callertype;
    }

    public String getCallertype() 
    {
        return callertype;
    }
    public void setCustomerid(Long customerid) 
    {
        this.customerid = customerid;
    }

    public Long getCustomerid() 
    {
        return customerid;
    }
    public void setChulicontent(String chulicontent) 
    {
        this.chulicontent = chulicontent;
    }

    public String getChulicontent() 
    {
        return chulicontent;
    }
    public void setLinkmanid(Long linkmanid) 
    {
        this.linkmanid = linkmanid;
    }

    public Long getLinkmanid() 
    {
        return linkmanid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("tel", getTel())
            .append("customer", getCustomer())
            .append("linkman", getLinkman())
            .append("content", getContent())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("ifchuli", getIfchuli())
            .append("chulitime", getChulitime())
            .append("calltype", getCalltype())
            .append("callertype", getCallertype())
            .append("customerid", getCustomerid())
            .append("chulicontent", getChulicontent())
            .append("linkmanid", getLinkmanid())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
