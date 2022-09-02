package com.vrcrm.sales.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 销售机会对象 cmf_crm_chance
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfCrmChance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chancetheme;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String clientname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String linkman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date findtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String clientneed;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date presigntime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long precount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String enable;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recentstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bak;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lastcontacttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String attach;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setChancetheme(String chancetheme) 
    {
        this.chancetheme = chancetheme;
    }

    public String getChancetheme() 
    {
        return chancetheme;
    }
    public void setClientname(String clientname) 
    {
        this.clientname = clientname;
    }

    public String getClientname() 
    {
        return clientname;
    }
    public void setLinkman(String linkman) 
    {
        this.linkman = linkman;
    }

    public String getLinkman() 
    {
        return linkman;
    }
    public void setFindtime(Date findtime) 
    {
        this.findtime = findtime;
    }

    public Date getFindtime() 
    {
        return findtime;
    }
    public void setClientneed(String clientneed) 
    {
        this.clientneed = clientneed;
    }

    public String getClientneed() 
    {
        return clientneed;
    }
    public void setPresigntime(Date presigntime) 
    {
        this.presigntime = presigntime;
    }

    public Date getPresigntime() 
    {
        return presigntime;
    }
    public void setPrecount(Long precount) 
    {
        this.precount = precount;
    }

    public Long getPrecount() 
    {
        return precount;
    }
    public void setEnable(String enable) 
    {
        this.enable = enable;
    }

    public String getEnable() 
    {
        return enable;
    }
    public void setRecentstatus(String recentstatus) 
    {
        this.recentstatus = recentstatus;
    }

    public String getRecentstatus() 
    {
        return recentstatus;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setBak(String bak) 
    {
        this.bak = bak;
    }

    public String getBak() 
    {
        return bak;
    }
    public void setLastcontacttime(Date lastcontacttime) 
    {
        this.lastcontacttime = lastcontacttime;
    }

    public Date getLastcontacttime() 
    {
        return lastcontacttime;
    }
    public void setAttach(String attach) 
    {
        this.attach = attach;
    }

    public String getAttach() 
    {
        return attach;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("chancetheme", getChancetheme())
            .append("clientname", getClientname())
            .append("linkman", getLinkman())
            .append("findtime", getFindtime())
            .append("clientneed", getClientneed())
            .append("presigntime", getPresigntime())
            .append("precount", getPrecount())
            .append("enable", getEnable())
            .append("recentstatus", getRecentstatus())
            .append("status", getStatus())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .append("bak", getBak())
            .append("lastcontacttime", getLastcontacttime())
            .append("attach", getAttach())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
