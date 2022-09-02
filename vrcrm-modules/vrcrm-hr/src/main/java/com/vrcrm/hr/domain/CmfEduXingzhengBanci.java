package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 行政班次对象 cmf_edu_xingzheng_banci
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengBanci extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dutytime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String isstarttimeenable;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date isendtimeenable;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date startcardtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endcardtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date startdelaycardtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date enddelaycardtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date latertime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date earlytime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classmanageone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classmanagetwo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setClassname(String classname) 
    {
        this.classname = classname;
    }

    public String getClassname() 
    {
        return classname;
    }
    public void setDutytime(String dutytime) 
    {
        this.dutytime = dutytime;
    }

    public String getDutytime() 
    {
        return dutytime;
    }
    public void setIsstarttimeenable(String isstarttimeenable) 
    {
        this.isstarttimeenable = isstarttimeenable;
    }

    public String getIsstarttimeenable() 
    {
        return isstarttimeenable;
    }
    public void setIsendtimeenable(Date isendtimeenable) 
    {
        this.isendtimeenable = isendtimeenable;
    }

    public Date getIsendtimeenable() 
    {
        return isendtimeenable;
    }
    public void setStartcardtime(Date startcardtime) 
    {
        this.startcardtime = startcardtime;
    }

    public Date getStartcardtime() 
    {
        return startcardtime;
    }
    public void setEndcardtime(Date endcardtime) 
    {
        this.endcardtime = endcardtime;
    }

    public Date getEndcardtime() 
    {
        return endcardtime;
    }
    public void setStartdelaycardtime(Date startdelaycardtime) 
    {
        this.startdelaycardtime = startdelaycardtime;
    }

    public Date getStartdelaycardtime() 
    {
        return startdelaycardtime;
    }
    public void setEnddelaycardtime(Date enddelaycardtime) 
    {
        this.enddelaycardtime = enddelaycardtime;
    }

    public Date getEnddelaycardtime() 
    {
        return enddelaycardtime;
    }
    public void setLatertime(Date latertime) 
    {
        this.latertime = latertime;
    }

    public Date getLatertime() 
    {
        return latertime;
    }
    public void setEarlytime(Date earlytime) 
    {
        this.earlytime = earlytime;
    }

    public Date getEarlytime() 
    {
        return earlytime;
    }
    public void setClassmanageone(String classmanageone) 
    {
        this.classmanageone = classmanageone;
    }

    public String getClassmanageone() 
    {
        return classmanageone;
    }
    public void setClassmanagetwo(String classmanagetwo) 
    {
        this.classmanagetwo = classmanagetwo;
    }

    public String getClassmanagetwo() 
    {
        return classmanagetwo;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("classname", getClassname())
            .append("dutytime", getDutytime())
            .append("isstarttimeenable", getIsstarttimeenable())
            .append("isendtimeenable", getIsendtimeenable())
            .append("startcardtime", getStartcardtime())
            .append("endcardtime", getEndcardtime())
            .append("startdelaycardtime", getStartdelaycardtime())
            .append("enddelaycardtime", getEnddelaycardtime())
            .append("latertime", getLatertime())
            .append("earlytime", getEarlytime())
            .append("classmanageone", getClassmanageone())
            .append("classmanagetwo", getClassmanagetwo())
            .append("memo", getMemo())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
