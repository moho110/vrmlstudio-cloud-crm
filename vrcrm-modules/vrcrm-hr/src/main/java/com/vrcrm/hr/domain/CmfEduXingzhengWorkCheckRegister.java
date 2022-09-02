package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 行政人员工作考核登记表对象 cmf_edu_xingzheng_work_check_register
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduXingzhengWorkCheckRegister extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String schoolname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String studyyear;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String username;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classroom;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staff;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date filldate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dutyandyearobj;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String personsummary;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String personsysign;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date personsysigndate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recentyearpunishthings;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classroomideal;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rankandlevel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classroomsign;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date classroomdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String schoolopinion;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String exleadergroupsign;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date exleadergroupsigndate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String personopinion;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String personsign;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date personopiniondate;

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
    public void setSchoolname(String schoolname) 
    {
        this.schoolname = schoolname;
    }

    public String getSchoolname() 
    {
        return schoolname;
    }
    public void setStudyyear(String studyyear) 
    {
        this.studyyear = studyyear;
    }

    public String getStudyyear() 
    {
        return studyyear;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setClassroom(String classroom) 
    {
        this.classroom = classroom;
    }

    public String getClassroom() 
    {
        return classroom;
    }
    public void setStaff(String staff) 
    {
        this.staff = staff;
    }

    public String getStaff() 
    {
        return staff;
    }
    public void setFilldate(Date filldate) 
    {
        this.filldate = filldate;
    }

    public Date getFilldate() 
    {
        return filldate;
    }
    public void setDutyandyearobj(String dutyandyearobj) 
    {
        this.dutyandyearobj = dutyandyearobj;
    }

    public String getDutyandyearobj() 
    {
        return dutyandyearobj;
    }
    public void setPersonsummary(String personsummary) 
    {
        this.personsummary = personsummary;
    }

    public String getPersonsummary() 
    {
        return personsummary;
    }
    public void setPersonsysign(String personsysign) 
    {
        this.personsysign = personsysign;
    }

    public String getPersonsysign() 
    {
        return personsysign;
    }
    public void setPersonsysigndate(Date personsysigndate) 
    {
        this.personsysigndate = personsysigndate;
    }

    public Date getPersonsysigndate() 
    {
        return personsysigndate;
    }
    public void setRecentyearpunishthings(String recentyearpunishthings) 
    {
        this.recentyearpunishthings = recentyearpunishthings;
    }

    public String getRecentyearpunishthings() 
    {
        return recentyearpunishthings;
    }
    public void setClassroomideal(String classroomideal) 
    {
        this.classroomideal = classroomideal;
    }

    public String getClassroomideal() 
    {
        return classroomideal;
    }
    public void setRankandlevel(String rankandlevel) 
    {
        this.rankandlevel = rankandlevel;
    }

    public String getRankandlevel() 
    {
        return rankandlevel;
    }
    public void setClassroomsign(String classroomsign) 
    {
        this.classroomsign = classroomsign;
    }

    public String getClassroomsign() 
    {
        return classroomsign;
    }
    public void setClassroomdate(Date classroomdate) 
    {
        this.classroomdate = classroomdate;
    }

    public Date getClassroomdate() 
    {
        return classroomdate;
    }
    public void setSchoolopinion(String schoolopinion) 
    {
        this.schoolopinion = schoolopinion;
    }

    public String getSchoolopinion() 
    {
        return schoolopinion;
    }
    public void setExleadergroupsign(String exleadergroupsign) 
    {
        this.exleadergroupsign = exleadergroupsign;
    }

    public String getExleadergroupsign() 
    {
        return exleadergroupsign;
    }
    public void setExleadergroupsigndate(Date exleadergroupsigndate) 
    {
        this.exleadergroupsigndate = exleadergroupsigndate;
    }

    public Date getExleadergroupsigndate() 
    {
        return exleadergroupsigndate;
    }
    public void setPersonopinion(String personopinion) 
    {
        this.personopinion = personopinion;
    }

    public String getPersonopinion() 
    {
        return personopinion;
    }
    public void setPersonsign(String personsign) 
    {
        this.personsign = personsign;
    }

    public String getPersonsign() 
    {
        return personsign;
    }
    public void setPersonopiniondate(Date personopiniondate) 
    {
        this.personopiniondate = personopiniondate;
    }

    public Date getPersonopiniondate() 
    {
        return personopiniondate;
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
            .append("schoolname", getSchoolname())
            .append("studyyear", getStudyyear())
            .append("name", getName())
            .append("username", getUsername())
            .append("classroom", getClassroom())
            .append("staff", getStaff())
            .append("filldate", getFilldate())
            .append("dutyandyearobj", getDutyandyearobj())
            .append("personsummary", getPersonsummary())
            .append("personsysign", getPersonsysign())
            .append("personsysigndate", getPersonsysigndate())
            .append("recentyearpunishthings", getRecentyearpunishthings())
            .append("classroomideal", getClassroomideal())
            .append("rankandlevel", getRankandlevel())
            .append("classroomsign", getClassroomsign())
            .append("classroomdate", getClassroomdate())
            .append("schoolopinion", getSchoolopinion())
            .append("exleadergroupsign", getExleadergroupsign())
            .append("exleadergroupsigndate", getExleadergroupsigndate())
            .append("personopinion", getPersonopinion())
            .append("personsign", getPersonsign())
            .append("personopiniondate", getPersonopiniondate())
            .append("workflow", getWorkflow())
            .toString();
    }
}
