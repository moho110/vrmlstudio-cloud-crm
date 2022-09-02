package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 教师考勤对象 cmf_edu_teacherkaoqin
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduTeacherkaoqin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String teacherusername;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String teachername;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date dutydate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cardtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dutyid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dutyposition;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dutyip;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTeacherusername(String teacherusername) 
    {
        this.teacherusername = teacherusername;
    }

    public String getTeacherusername() 
    {
        return teacherusername;
    }
    public void setTeachername(String teachername) 
    {
        this.teachername = teachername;
    }

    public String getTeachername() 
    {
        return teachername;
    }
    public void setDutydate(Date dutydate) 
    {
        this.dutydate = dutydate;
    }

    public Date getDutydate() 
    {
        return dutydate;
    }
    public void setCardtime(String cardtime) 
    {
        this.cardtime = cardtime;
    }

    public String getCardtime() 
    {
        return cardtime;
    }
    public void setDutyid(String dutyid) 
    {
        this.dutyid = dutyid;
    }

    public String getDutyid() 
    {
        return dutyid;
    }
    public void setDutyposition(String dutyposition) 
    {
        this.dutyposition = dutyposition;
    }

    public String getDutyposition() 
    {
        return dutyposition;
    }
    public void setDutyip(String dutyip) 
    {
        this.dutyip = dutyip;
    }

    public String getDutyip() 
    {
        return dutyip;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("teacherusername", getTeacherusername())
            .append("teachername", getTeachername())
            .append("dutydate", getDutydate())
            .append("cardtime", getCardtime())
            .append("dutyid", getDutyid())
            .append("dutyposition", getDutyposition())
            .append("dutyip", getDutyip())
            .toString();
    }
}
