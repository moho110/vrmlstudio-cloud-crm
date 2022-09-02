package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 学期执行对象 cmf_edu_xueqiexec
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXueqiexec extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String termname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long recentterm;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long ismorninghaveclass;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long iseveninghaveclass;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String studyyear;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long issatclass;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long issunclass;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date starttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTermname(String termname) 
    {
        this.termname = termname;
    }

    public String getTermname() 
    {
        return termname;
    }
    public void setRecentterm(Long recentterm) 
    {
        this.recentterm = recentterm;
    }

    public Long getRecentterm() 
    {
        return recentterm;
    }
    public void setIsmorninghaveclass(Long ismorninghaveclass) 
    {
        this.ismorninghaveclass = ismorninghaveclass;
    }

    public Long getIsmorninghaveclass() 
    {
        return ismorninghaveclass;
    }
    public void setIseveninghaveclass(Long iseveninghaveclass) 
    {
        this.iseveninghaveclass = iseveninghaveclass;
    }

    public Long getIseveninghaveclass() 
    {
        return iseveninghaveclass;
    }
    public void setStudyyear(String studyyear) 
    {
        this.studyyear = studyyear;
    }

    public String getStudyyear() 
    {
        return studyyear;
    }
    public void setIssatclass(Long issatclass) 
    {
        this.issatclass = issatclass;
    }

    public Long getIssatclass() 
    {
        return issatclass;
    }
    public void setIssunclass(Long issunclass) 
    {
        this.issunclass = issunclass;
    }

    public Long getIssunclass() 
    {
        return issunclass;
    }
    public void setStarttime(Date starttime) 
    {
        this.starttime = starttime;
    }

    public Date getStarttime() 
    {
        return starttime;
    }
    public void setEndtime(Date endtime) 
    {
        this.endtime = endtime;
    }

    public Date getEndtime() 
    {
        return endtime;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("termname", getTermname())
            .append("recentterm", getRecentterm())
            .append("ismorninghaveclass", getIsmorninghaveclass())
            .append("iseveninghaveclass", getIseveninghaveclass())
            .append("studyyear", getStudyyear())
            .append("issatclass", getIssatclass())
            .append("issunclass", getIssunclass())
            .append("starttime", getStarttime())
            .append("endtime", getEndtime())
            .append("memo", getMemo())
            .toString();
    }
}
