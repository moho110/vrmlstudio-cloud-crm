package com.vrcrm.customer.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 联系方式对象 cmf_crm_contact
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfCrmContact extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long customerid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String linkmanid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contact;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chance;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stage;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String describes;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date contacttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date nextcontacttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String nextissue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alreadycontact;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String publics;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String priority;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCustomerid(Long customerid) 
    {
        this.customerid = customerid;
    }

    public Long getCustomerid() 
    {
        return customerid;
    }
    public void setLinkmanid(String linkmanid) 
    {
        this.linkmanid = linkmanid;
    }

    public String getLinkmanid() 
    {
        return linkmanid;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }
    public void setChance(String chance) 
    {
        this.chance = chance;
    }

    public String getChance() 
    {
        return chance;
    }
    public void setStage(String stage) 
    {
        this.stage = stage;
    }

    public String getStage() 
    {
        return stage;
    }
    public void setDescribes(String describes) 
    {
        this.describes = describes;
    }

    public String getDescribes() 
    {
        return describes;
    }
    public void setContacttime(Date contacttime) 
    {
        this.contacttime = contacttime;
    }

    public Date getContacttime() 
    {
        return contacttime;
    }
    public void setNextcontacttime(Date nextcontacttime) 
    {
        this.nextcontacttime = nextcontacttime;
    }

    public Date getNextcontacttime() 
    {
        return nextcontacttime;
    }
    public void setNextissue(String nextissue) 
    {
        this.nextissue = nextissue;
    }

    public String getNextissue() 
    {
        return nextissue;
    }
    public void setAlreadycontact(String alreadycontact) 
    {
        this.alreadycontact = alreadycontact;
    }

    public String getAlreadycontact() 
    {
        return alreadycontact;
    }
    public void setPublics(String publics)
    {
        this.publics = publics;
    }

    public String getPublics()
    {
        return publics;
    }
    public void setPriority(String priority) 
    {
        this.priority = priority;
    }

    public String getPriority() 
    {
        return priority;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerid", getCustomerid())
            .append("linkmanid", getLinkmanid())
            .append("userId", getUserId())
            .append("createman", getCreateman())
            .append("contact", getContact())
            .append("chance", getChance())
            .append("stage", getStage())
            .append("describes", getDescribes())
            .append("createtime", getCreatetime())
            .append("contacttime", getContacttime())
            .append("nextcontacttime", getNextcontacttime())
            .append("nextissue", getNextissue())
            .append("alreadycontact", getAlreadycontact())
            .append("publics", getPublics())
            .append("priority", getPriority())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
