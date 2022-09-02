package com.vrcrm.customer.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 申请报备对象 cmf_crm_shenqingbaobei
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfCrmShenqingbaobei extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long customerid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long linkmanid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long chanceid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String introduce;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhichi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fujian;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String piyu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shenheman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date shenhetime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhuti;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tixingren;
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
    public void setLinkmanid(Long linkmanid) 
    {
        this.linkmanid = linkmanid;
    }

    public Long getLinkmanid() 
    {
        return linkmanid;
    }
    public void setChanceid(Long chanceid) 
    {
        this.chanceid = chanceid;
    }

    public Long getChanceid() 
    {
        return chanceid;
    }
    public void setIntroduce(String introduce) 
    {
        this.introduce = introduce;
    }

    public String getIntroduce() 
    {
        return introduce;
    }
    public void setZhichi(String zhichi) 
    {
        this.zhichi = zhichi;
    }

    public String getZhichi() 
    {
        return zhichi;
    }
    public void setFujian(String fujian) 
    {
        this.fujian = fujian;
    }

    public String getFujian() 
    {
        return fujian;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setPiyu(String piyu) 
    {
        this.piyu = piyu;
    }

    public String getPiyu() 
    {
        return piyu;
    }
    public void setShenheman(String shenheman) 
    {
        this.shenheman = shenheman;
    }

    public String getShenheman() 
    {
        return shenheman;
    }
    public void setShenhetime(Date shenhetime) 
    {
        this.shenhetime = shenhetime;
    }

    public Date getShenhetime() 
    {
        return shenhetime;
    }
    public void setZhuti(String zhuti) 
    {
        this.zhuti = zhuti;
    }

    public String getZhuti() 
    {
        return zhuti;
    }
    public void setTixingren(String tixingren) 
    {
        this.tixingren = tixingren;
    }

    public String getTixingren() 
    {
        return tixingren;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerid", getCustomerid())
            .append("linkmanid", getLinkmanid())
            .append("chanceid", getChanceid())
            .append("introduce", getIntroduce())
            .append("zhichi", getZhichi())
            .append("fujian", getFujian())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("state", getState())
            .append("piyu", getPiyu())
            .append("shenheman", getShenheman())
            .append("shenhetime", getShenhetime())
            .append("zhuti", getZhuti())
            .append("tixingren", getTixingren())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
