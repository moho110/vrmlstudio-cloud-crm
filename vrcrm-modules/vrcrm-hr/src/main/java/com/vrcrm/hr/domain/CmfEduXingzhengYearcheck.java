package com.vrcrm.hr.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 行政人员年度考核量化表对象 cmf_edu_xingzheng_yearcheck
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengYearcheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String term;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String username;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classroom;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String kezhang;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal pindetaiduabillityscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal chuqinscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal workquantityscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal workjilvscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal workspecscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal workxiaoguoscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal banzhurenscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal tempworkscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal thesisscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal teachingscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal sumscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date extime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal pindeabillityscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal chuqinbiaoxianscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal workexscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal workjilvexscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal workspecexscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal workxiaoguoexscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal banzhurenworkexscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal tempworkexscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal thesisexscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal techingexscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal sumexscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String keshiscoreman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date classroomscoretime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workflow;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTerm(String term) 
    {
        this.term = term;
    }

    public String getTerm() 
    {
        return term;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setClassroom(String classroom) 
    {
        this.classroom = classroom;
    }

    public String getClassroom() 
    {
        return classroom;
    }
    public void setKezhang(String kezhang) 
    {
        this.kezhang = kezhang;
    }

    public String getKezhang() 
    {
        return kezhang;
    }
    public void setPindetaiduabillityscore(BigDecimal pindetaiduabillityscore) 
    {
        this.pindetaiduabillityscore = pindetaiduabillityscore;
    }

    public BigDecimal getPindetaiduabillityscore() 
    {
        return pindetaiduabillityscore;
    }
    public void setChuqinscore(BigDecimal chuqinscore) 
    {
        this.chuqinscore = chuqinscore;
    }

    public BigDecimal getChuqinscore() 
    {
        return chuqinscore;
    }
    public void setWorkquantityscore(BigDecimal workquantityscore) 
    {
        this.workquantityscore = workquantityscore;
    }

    public BigDecimal getWorkquantityscore() 
    {
        return workquantityscore;
    }
    public void setWorkjilvscore(BigDecimal workjilvscore) 
    {
        this.workjilvscore = workjilvscore;
    }

    public BigDecimal getWorkjilvscore() 
    {
        return workjilvscore;
    }
    public void setWorkspecscore(BigDecimal workspecscore) 
    {
        this.workspecscore = workspecscore;
    }

    public BigDecimal getWorkspecscore() 
    {
        return workspecscore;
    }
    public void setWorkxiaoguoscore(BigDecimal workxiaoguoscore) 
    {
        this.workxiaoguoscore = workxiaoguoscore;
    }

    public BigDecimal getWorkxiaoguoscore() 
    {
        return workxiaoguoscore;
    }
    public void setBanzhurenscore(BigDecimal banzhurenscore) 
    {
        this.banzhurenscore = banzhurenscore;
    }

    public BigDecimal getBanzhurenscore() 
    {
        return banzhurenscore;
    }
    public void setTempworkscore(BigDecimal tempworkscore) 
    {
        this.tempworkscore = tempworkscore;
    }

    public BigDecimal getTempworkscore() 
    {
        return tempworkscore;
    }
    public void setThesisscore(BigDecimal thesisscore) 
    {
        this.thesisscore = thesisscore;
    }

    public BigDecimal getThesisscore() 
    {
        return thesisscore;
    }
    public void setTeachingscore(BigDecimal teachingscore) 
    {
        this.teachingscore = teachingscore;
    }

    public BigDecimal getTeachingscore() 
    {
        return teachingscore;
    }
    public void setSumscore(BigDecimal sumscore) 
    {
        this.sumscore = sumscore;
    }

    public BigDecimal getSumscore() 
    {
        return sumscore;
    }
    public void setExtime(Date extime) 
    {
        this.extime = extime;
    }

    public Date getExtime() 
    {
        return extime;
    }
    public void setPindeabillityscore(BigDecimal pindeabillityscore) 
    {
        this.pindeabillityscore = pindeabillityscore;
    }

    public BigDecimal getPindeabillityscore() 
    {
        return pindeabillityscore;
    }
    public void setChuqinbiaoxianscore(BigDecimal chuqinbiaoxianscore) 
    {
        this.chuqinbiaoxianscore = chuqinbiaoxianscore;
    }

    public BigDecimal getChuqinbiaoxianscore() 
    {
        return chuqinbiaoxianscore;
    }
    public void setWorkexscore(BigDecimal workexscore) 
    {
        this.workexscore = workexscore;
    }

    public BigDecimal getWorkexscore() 
    {
        return workexscore;
    }
    public void setWorkjilvexscore(BigDecimal workjilvexscore) 
    {
        this.workjilvexscore = workjilvexscore;
    }

    public BigDecimal getWorkjilvexscore() 
    {
        return workjilvexscore;
    }
    public void setWorkspecexscore(BigDecimal workspecexscore) 
    {
        this.workspecexscore = workspecexscore;
    }

    public BigDecimal getWorkspecexscore() 
    {
        return workspecexscore;
    }
    public void setWorkxiaoguoexscore(BigDecimal workxiaoguoexscore) 
    {
        this.workxiaoguoexscore = workxiaoguoexscore;
    }

    public BigDecimal getWorkxiaoguoexscore() 
    {
        return workxiaoguoexscore;
    }
    public void setBanzhurenworkexscore(BigDecimal banzhurenworkexscore) 
    {
        this.banzhurenworkexscore = banzhurenworkexscore;
    }

    public BigDecimal getBanzhurenworkexscore() 
    {
        return banzhurenworkexscore;
    }
    public void setTempworkexscore(BigDecimal tempworkexscore) 
    {
        this.tempworkexscore = tempworkexscore;
    }

    public BigDecimal getTempworkexscore() 
    {
        return tempworkexscore;
    }
    public void setThesisexscore(BigDecimal thesisexscore) 
    {
        this.thesisexscore = thesisexscore;
    }

    public BigDecimal getThesisexscore() 
    {
        return thesisexscore;
    }
    public void setTechingexscore(BigDecimal techingexscore) 
    {
        this.techingexscore = techingexscore;
    }

    public BigDecimal getTechingexscore() 
    {
        return techingexscore;
    }
    public void setSumexscore(BigDecimal sumexscore) 
    {
        this.sumexscore = sumexscore;
    }

    public BigDecimal getSumexscore() 
    {
        return sumexscore;
    }
    public void setKeshiscoreman(String keshiscoreman) 
    {
        this.keshiscoreman = keshiscoreman;
    }

    public String getKeshiscoreman() 
    {
        return keshiscoreman;
    }
    public void setClassroomscoretime(Date classroomscoretime) 
    {
        this.classroomscoretime = classroomscoretime;
    }

    public Date getClassroomscoretime() 
    {
        return classroomscoretime;
    }
    public void setWorkflow(String workflow) 
    {
        this.workflow = workflow;
    }

    public String getWorkflow() 
    {
        return workflow;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("term", getTerm())
            .append("username", getUsername())
            .append("name", getName())
            .append("classroom", getClassroom())
            .append("kezhang", getKezhang())
            .append("pindetaiduabillityscore", getPindetaiduabillityscore())
            .append("chuqinscore", getChuqinscore())
            .append("workquantityscore", getWorkquantityscore())
            .append("workjilvscore", getWorkjilvscore())
            .append("workspecscore", getWorkspecscore())
            .append("workxiaoguoscore", getWorkxiaoguoscore())
            .append("banzhurenscore", getBanzhurenscore())
            .append("tempworkscore", getTempworkscore())
            .append("thesisscore", getThesisscore())
            .append("teachingscore", getTeachingscore())
            .append("sumscore", getSumscore())
            .append("extime", getExtime())
            .append("pindeabillityscore", getPindeabillityscore())
            .append("chuqinbiaoxianscore", getChuqinbiaoxianscore())
            .append("workexscore", getWorkexscore())
            .append("workjilvexscore", getWorkjilvexscore())
            .append("workspecexscore", getWorkspecexscore())
            .append("workxiaoguoexscore", getWorkxiaoguoexscore())
            .append("banzhurenworkexscore", getBanzhurenworkexscore())
            .append("tempworkexscore", getTempworkexscore())
            .append("thesisexscore", getThesisexscore())
            .append("techingexscore", getTechingexscore())
            .append("sumexscore", getSumexscore())
            .append("keshiscoreman", getKeshiscoreman())
            .append("classroomscoretime", getClassroomscoretime())
            .append("workflow", getWorkflow())
            .toString();
    }
}
