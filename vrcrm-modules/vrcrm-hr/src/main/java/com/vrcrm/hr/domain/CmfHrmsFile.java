package com.vrcrm.hr.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 人事档案对象 cmf_hrms_file
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfHrmsFile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String indepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String marriage;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date birthday;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String national;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String political;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String hukou;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiguan;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String insuranceno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String postalcode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String email;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String telephone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String studyexp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String professional;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String college;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staff;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staffname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String politicallevel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String computerlevel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String foreign;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long foreignlevel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date whenwork;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long worktime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workstatus;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String special;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String attach;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String photo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date entryunitdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long unitworktime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date quitdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date nowcontractdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date nowcontractenddate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date tuixiudate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long tuixiuage;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workinformal;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date firstcontractdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String techlevel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date techexdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stafftype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staffbyname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stafftechscore;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bank;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bankno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String salarylevel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date staffyinlibirthday;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String persondesp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String passport;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bloody;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String height;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String weight;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String eyesight;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String health;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String drivers;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workexp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workexpattach;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String socialrelation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String socialrelationattach;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date recoverstaffdate;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setWorkid(String workid) 
    {
        this.workid = workid;
    }

    public String getWorkid() 
    {
        return workid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setIndepartment(String indepartment) 
    {
        this.indepartment = indepartment;
    }

    public String getIndepartment() 
    {
        return indepartment;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setMarriage(String marriage) 
    {
        this.marriage = marriage;
    }

    public String getMarriage() 
    {
        return marriage;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setNational(String national) 
    {
        this.national = national;
    }

    public String getNational() 
    {
        return national;
    }
    public void setPolitical(String political) 
    {
        this.political = political;
    }

    public String getPolitical() 
    {
        return political;
    }
    public void setIdno(String idno) 
    {
        this.idno = idno;
    }

    public String getIdno() 
    {
        return idno;
    }
    public void setHukou(String hukou) 
    {
        this.hukou = hukou;
    }

    public String getHukou() 
    {
        return hukou;
    }
    public void setJiguan(String jiguan) 
    {
        this.jiguan = jiguan;
    }

    public String getJiguan() 
    {
        return jiguan;
    }
    public void setInsuranceno(String insuranceno) 
    {
        this.insuranceno = insuranceno;
    }

    public String getInsuranceno() 
    {
        return insuranceno;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setPostalcode(String postalcode) 
    {
        this.postalcode = postalcode;
    }

    public String getPostalcode() 
    {
        return postalcode;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setTelephone(String telephone) 
    {
        this.telephone = telephone;
    }

    public String getTelephone() 
    {
        return telephone;
    }
    public void setStudyexp(String studyexp) 
    {
        this.studyexp = studyexp;
    }

    public String getStudyexp() 
    {
        return studyexp;
    }
    public void setProfessional(String professional) 
    {
        this.professional = professional;
    }

    public String getProfessional() 
    {
        return professional;
    }
    public void setCollege(String college) 
    {
        this.college = college;
    }

    public String getCollege() 
    {
        return college;
    }
    public void setStaff(String staff) 
    {
        this.staff = staff;
    }

    public String getStaff() 
    {
        return staff;
    }
    public void setStaffname(String staffname) 
    {
        this.staffname = staffname;
    }

    public String getStaffname() 
    {
        return staffname;
    }
    public void setPoliticallevel(String politicallevel) 
    {
        this.politicallevel = politicallevel;
    }

    public String getPoliticallevel() 
    {
        return politicallevel;
    }
    public void setComputerlevel(String computerlevel) 
    {
        this.computerlevel = computerlevel;
    }

    public String getComputerlevel() 
    {
        return computerlevel;
    }
    public void setForeign(String foreign) 
    {
        this.foreign = foreign;
    }

    public String getForeign() 
    {
        return foreign;
    }
    public void setForeignlevel(Long foreignlevel) 
    {
        this.foreignlevel = foreignlevel;
    }

    public Long getForeignlevel() 
    {
        return foreignlevel;
    }
    public void setWhenwork(Date whenwork) 
    {
        this.whenwork = whenwork;
    }

    public Date getWhenwork() 
    {
        return whenwork;
    }
    public void setWorktime(Long worktime) 
    {
        this.worktime = worktime;
    }

    public Long getWorktime() 
    {
        return worktime;
    }
    public void setWorkstatus(String workstatus) 
    {
        this.workstatus = workstatus;
    }

    public String getWorkstatus() 
    {
        return workstatus;
    }
    public void setSpecial(String special) 
    {
        this.special = special;
    }

    public String getSpecial() 
    {
        return special;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setAttach(String attach) 
    {
        this.attach = attach;
    }

    public String getAttach() 
    {
        return attach;
    }
    public void setPhoto(String photo) 
    {
        this.photo = photo;
    }

    public String getPhoto() 
    {
        return photo;
    }
    public void setEntryunitdate(Date entryunitdate) 
    {
        this.entryunitdate = entryunitdate;
    }

    public Date getEntryunitdate() 
    {
        return entryunitdate;
    }
    public void setUnitworktime(Long unitworktime) 
    {
        this.unitworktime = unitworktime;
    }

    public Long getUnitworktime() 
    {
        return unitworktime;
    }
    public void setQuitdate(Date quitdate) 
    {
        this.quitdate = quitdate;
    }

    public Date getQuitdate() 
    {
        return quitdate;
    }
    public void setNowcontractdate(Date nowcontractdate) 
    {
        this.nowcontractdate = nowcontractdate;
    }

    public Date getNowcontractdate() 
    {
        return nowcontractdate;
    }
    public void setNowcontractenddate(Date nowcontractenddate) 
    {
        this.nowcontractenddate = nowcontractenddate;
    }

    public Date getNowcontractenddate() 
    {
        return nowcontractenddate;
    }
    public void setTuixiudate(Date tuixiudate) 
    {
        this.tuixiudate = tuixiudate;
    }

    public Date getTuixiudate() 
    {
        return tuixiudate;
    }
    public void setTuixiuage(Long tuixiuage) 
    {
        this.tuixiuage = tuixiuage;
    }

    public Long getTuixiuage() 
    {
        return tuixiuage;
    }
    public void setWorkinformal(String workinformal) 
    {
        this.workinformal = workinformal;
    }

    public String getWorkinformal() 
    {
        return workinformal;
    }
    public void setFirstcontractdate(Date firstcontractdate) 
    {
        this.firstcontractdate = firstcontractdate;
    }

    public Date getFirstcontractdate() 
    {
        return firstcontractdate;
    }
    public void setTechlevel(String techlevel) 
    {
        this.techlevel = techlevel;
    }

    public String getTechlevel() 
    {
        return techlevel;
    }
    public void setTechexdate(Date techexdate) 
    {
        this.techexdate = techexdate;
    }

    public Date getTechexdate() 
    {
        return techexdate;
    }
    public void setStafftype(String stafftype) 
    {
        this.stafftype = stafftype;
    }

    public String getStafftype() 
    {
        return stafftype;
    }
    public void setStaffbyname(String staffbyname) 
    {
        this.staffbyname = staffbyname;
    }

    public String getStaffbyname() 
    {
        return staffbyname;
    }
    public void setStafftechscore(String stafftechscore) 
    {
        this.stafftechscore = stafftechscore;
    }

    public String getStafftechscore() 
    {
        return stafftechscore;
    }
    public void setBank(String bank) 
    {
        this.bank = bank;
    }

    public String getBank() 
    {
        return bank;
    }
    public void setBankno(String bankno) 
    {
        this.bankno = bankno;
    }

    public String getBankno() 
    {
        return bankno;
    }
    public void setSalarylevel(String salarylevel) 
    {
        this.salarylevel = salarylevel;
    }

    public String getSalarylevel() 
    {
        return salarylevel;
    }
    public void setStaffyinlibirthday(Date staffyinlibirthday) 
    {
        this.staffyinlibirthday = staffyinlibirthday;
    }

    public Date getStaffyinlibirthday() 
    {
        return staffyinlibirthday;
    }
    public void setPersondesp(String persondesp) 
    {
        this.persondesp = persondesp;
    }

    public String getPersondesp() 
    {
        return persondesp;
    }
    public void setPassport(String passport) 
    {
        this.passport = passport;
    }

    public String getPassport() 
    {
        return passport;
    }
    public void setBloody(String bloody) 
    {
        this.bloody = bloody;
    }

    public String getBloody() 
    {
        return bloody;
    }
    public void setHeight(String height) 
    {
        this.height = height;
    }

    public String getHeight() 
    {
        return height;
    }
    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public String getWeight() 
    {
        return weight;
    }
    public void setEyesight(String eyesight) 
    {
        this.eyesight = eyesight;
    }

    public String getEyesight() 
    {
        return eyesight;
    }
    public void setHealth(String health) 
    {
        this.health = health;
    }

    public String getHealth() 
    {
        return health;
    }
    public void setDrivers(String drivers) 
    {
        this.drivers = drivers;
    }

    public String getDrivers() 
    {
        return drivers;
    }
    public void setWorkexp(String workexp) 
    {
        this.workexp = workexp;
    }

    public String getWorkexp() 
    {
        return workexp;
    }
    public void setWorkexpattach(String workexpattach) 
    {
        this.workexpattach = workexpattach;
    }

    public String getWorkexpattach() 
    {
        return workexpattach;
    }
    public void setSocialrelation(String socialrelation) 
    {
        this.socialrelation = socialrelation;
    }

    public String getSocialrelation() 
    {
        return socialrelation;
    }
    public void setSocialrelationattach(String socialrelationattach) 
    {
        this.socialrelationattach = socialrelationattach;
    }

    public String getSocialrelationattach() 
    {
        return socialrelationattach;
    }
    public void setRecoverstaffdate(Date recoverstaffdate) 
    {
        this.recoverstaffdate = recoverstaffdate;
    }

    public Date getRecoverstaffdate() 
    {
        return recoverstaffdate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("workid", getWorkid())
            .append("name", getName())
            .append("indepartment", getIndepartment())
            .append("sex", getSex())
            .append("marriage", getMarriage())
            .append("birthday", getBirthday())
            .append("national", getNational())
            .append("political", getPolitical())
            .append("idno", getIdno())
            .append("hukou", getHukou())
            .append("jiguan", getJiguan())
            .append("insuranceno", getInsuranceno())
            .append("address", getAddress())
            .append("postalcode", getPostalcode())
            .append("email", getEmail())
            .append("telephone", getTelephone())
            .append("studyexp", getStudyexp())
            .append("professional", getProfessional())
            .append("college", getCollege())
            .append("staff", getStaff())
            .append("staffname", getStaffname())
            .append("politicallevel", getPoliticallevel())
            .append("computerlevel", getComputerlevel())
            .append("foreign", getForeign())
            .append("foreignlevel", getForeignlevel())
            .append("whenwork", getWhenwork())
            .append("worktime", getWorktime())
            .append("workstatus", getWorkstatus())
            .append("special", getSpecial())
            .append("memo", getMemo())
            .append("attach", getAttach())
            .append("photo", getPhoto())
            .append("entryunitdate", getEntryunitdate())
            .append("unitworktime", getUnitworktime())
            .append("quitdate", getQuitdate())
            .append("nowcontractdate", getNowcontractdate())
            .append("nowcontractenddate", getNowcontractenddate())
            .append("tuixiudate", getTuixiudate())
            .append("tuixiuage", getTuixiuage())
            .append("workinformal", getWorkinformal())
            .append("firstcontractdate", getFirstcontractdate())
            .append("techlevel", getTechlevel())
            .append("techexdate", getTechexdate())
            .append("stafftype", getStafftype())
            .append("staffbyname", getStaffbyname())
            .append("stafftechscore", getStafftechscore())
            .append("bank", getBank())
            .append("bankno", getBankno())
            .append("salarylevel", getSalarylevel())
            .append("staffyinlibirthday", getStaffyinlibirthday())
            .append("persondesp", getPersondesp())
            .append("passport", getPassport())
            .append("bloody", getBloody())
            .append("height", getHeight())
            .append("weight", getWeight())
            .append("eyesight", getEyesight())
            .append("health", getHealth())
            .append("drivers", getDrivers())
            .append("workexp", getWorkexp())
            .append("workexpattach", getWorkexpattach())
            .append("socialrelation", getSocialrelation())
            .append("socialrelationattach", getSocialrelationattach())
            .append("recoverstaffdate", getRecoverstaffdate())
            .toString();
    }
}
