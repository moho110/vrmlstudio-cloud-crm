package com.vrcrm.mytable.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 工作计划明细对象 cmf_workplanmain_detail
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfWorkplanmainDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mainrowid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date begintime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer result;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date nexttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String nextcontent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fujian;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setMainrowid(Long mainrowid) 
    {
        this.mainrowid = mainrowid;
    }

    public Long getMainrowid() 
    {
        return mainrowid;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
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
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setResult(Integer result) 
    {
        this.result = result;
    }

    public Integer getResult() 
    {
        return result;
    }
    public void setNexttime(Date nexttime) 
    {
        this.nexttime = nexttime;
    }

    public Date getNexttime() 
    {
        return nexttime;
    }
    public void setNextcontent(String nextcontent) 
    {
        this.nextcontent = nextcontent;
    }

    public String getNextcontent() 
    {
        return nextcontent;
    }
    public void setFujian(String fujian) 
    {
        this.fujian = fujian;
    }

    public String getFujian() 
    {
        return fujian;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mainrowid", getMainrowid())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("begintime", getBegintime())
            .append("endtime", getEndtime())
            .append("content", getContent())
            .append("result", getResult())
            .append("nexttime", getNexttime())
            .append("nextcontent", getNextcontent())
            .append("fujian", getFujian())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
