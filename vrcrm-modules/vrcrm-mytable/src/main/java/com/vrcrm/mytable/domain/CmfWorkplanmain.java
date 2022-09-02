package com.vrcrm.mytable.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 工作计划对象 cmf_workplanmain
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfWorkplanmain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhuti;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kind;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date begintime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhixingren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date finishtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shenheren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer shenchastate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date shenhetime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String shenhepishi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fujian;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ifsms;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer ifemail;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String guanlianshiwu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String guanlianurl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long guanlianid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lastzhixingtime;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
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
    public void setZhuti(String zhuti) 
    {
        this.zhuti = zhuti;
    }

    public String getZhuti() 
    {
        return zhuti;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setKind(String kind) 
    {
        this.kind = kind;
    }

    public String getKind() 
    {
        return kind;
    }
    public void setBegintime(Date begintime) 
    {
        this.begintime = begintime;
    }

    public Date getBegintime() 
    {
        return begintime;
    }
    public void setEndtime(Date endtime) 
    {
        this.endtime = endtime;
    }

    public Date getEndtime() 
    {
        return endtime;
    }
    public void setZhixingren(String zhixingren) 
    {
        this.zhixingren = zhixingren;
    }

    public String getZhixingren() 
    {
        return zhixingren;
    }
    public void setFinishtime(Date finishtime) 
    {
        this.finishtime = finishtime;
    }

    public Date getFinishtime() 
    {
        return finishtime;
    }
    public void setShenheren(String shenheren) 
    {
        this.shenheren = shenheren;
    }

    public String getShenheren() 
    {
        return shenheren;
    }
    public void setShenchastate(Integer shenchastate) 
    {
        this.shenchastate = shenchastate;
    }

    public Integer getShenchastate() 
    {
        return shenchastate;
    }
    public void setShenhetime(Date shenhetime) 
    {
        this.shenhetime = shenhetime;
    }

    public Date getShenhetime() 
    {
        return shenhetime;
    }
    public void setShenhepishi(String shenhepishi) 
    {
        this.shenhepishi = shenhepishi;
    }

    public String getShenhepishi() 
    {
        return shenhepishi;
    }
    public void setFujian(String fujian) 
    {
        this.fujian = fujian;
    }

    public String getFujian() 
    {
        return fujian;
    }
    public void setIfsms(Integer ifsms) 
    {
        this.ifsms = ifsms;
    }

    public Integer getIfsms() 
    {
        return ifsms;
    }
    public void setIfemail(Integer ifemail) 
    {
        this.ifemail = ifemail;
    }

    public Integer getIfemail() 
    {
        return ifemail;
    }
    public void setGuanlianshiwu(String guanlianshiwu) 
    {
        this.guanlianshiwu = guanlianshiwu;
    }

    public String getGuanlianshiwu() 
    {
        return guanlianshiwu;
    }
    public void setGuanlianurl(String guanlianurl) 
    {
        this.guanlianurl = guanlianurl;
    }

    public String getGuanlianurl() 
    {
        return guanlianurl;
    }
    public void setGuanlianid(Long guanlianid) 
    {
        this.guanlianid = guanlianid;
    }

    public Long getGuanlianid() 
    {
        return guanlianid;
    }
    public void setLastzhixingtime(Date lastzhixingtime) 
    {
        this.lastzhixingtime = lastzhixingtime;
    }

    public Date getLastzhixingtime() 
    {
        return lastzhixingtime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("createtime", getCreatetime())
            .append("createman", getCreateman())
            .append("state", getState())
            .append("zhuti", getZhuti())
            .append("content", getContent())
            .append("kind", getKind())
            .append("begintime", getBegintime())
            .append("endtime", getEndtime())
            .append("zhixingren", getZhixingren())
            .append("finishtime", getFinishtime())
            .append("shenheren", getShenheren())
            .append("shenchastate", getShenchastate())
            .append("shenhetime", getShenhetime())
            .append("shenhepishi", getShenhepishi())
            .append("fujian", getFujian())
            .append("ifsms", getIfsms())
            .append("ifemail", getIfemail())
            .append("guanlianshiwu", getGuanlianshiwu())
            .append("guanlianurl", getGuanlianurl())
            .append("guanlianid", getGuanlianid())
            .append("lastzhixingtime", getLastzhixingtime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
