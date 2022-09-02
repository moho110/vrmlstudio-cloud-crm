package com.vrcrm.hr.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 招聘人才库对象 cmf_hrms_zprencaiku
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfHrmsZprencaiku extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contact;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String national;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date birthday;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String political;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jiguan;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String hukouinpos;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String studyexp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staffname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String college;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String professional;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String secpro;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String email;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String familytelephone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String familyaddr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long postalcode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String edution;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String workexp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String selfeval;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String englishabillity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String traingexp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String photo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String attach;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectexp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String resumeletter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String proobject;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String luyongstatus;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }
    public void setIdno(String idno) 
    {
        this.idno = idno;
    }

    public String getIdno() 
    {
        return idno;
    }
    public void setNational(String national) 
    {
        this.national = national;
    }

    public String getNational() 
    {
        return national;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setPolitical(String political) 
    {
        this.political = political;
    }

    public String getPolitical() 
    {
        return political;
    }
    public void setJiguan(String jiguan) 
    {
        this.jiguan = jiguan;
    }

    public String getJiguan() 
    {
        return jiguan;
    }
    public void setHukouinpos(String hukouinpos) 
    {
        this.hukouinpos = hukouinpos;
    }

    public String getHukouinpos() 
    {
        return hukouinpos;
    }
    public void setStudyexp(String studyexp) 
    {
        this.studyexp = studyexp;
    }

    public String getStudyexp() 
    {
        return studyexp;
    }
    public void setStaffname(String staffname) 
    {
        this.staffname = staffname;
    }

    public String getStaffname() 
    {
        return staffname;
    }
    public void setCollege(String college) 
    {
        this.college = college;
    }

    public String getCollege() 
    {
        return college;
    }
    public void setProfessional(String professional) 
    {
        this.professional = professional;
    }

    public String getProfessional() 
    {
        return professional;
    }
    public void setSecpro(String secpro) 
    {
        this.secpro = secpro;
    }

    public String getSecpro() 
    {
        return secpro;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setFamilytelephone(String familytelephone) 
    {
        this.familytelephone = familytelephone;
    }

    public String getFamilytelephone() 
    {
        return familytelephone;
    }
    public void setFamilyaddr(String familyaddr) 
    {
        this.familyaddr = familyaddr;
    }

    public String getFamilyaddr() 
    {
        return familyaddr;
    }
    public void setPostalcode(Long postalcode) 
    {
        this.postalcode = postalcode;
    }

    public Long getPostalcode() 
    {
        return postalcode;
    }
    public void setEdution(String edution) 
    {
        this.edution = edution;
    }

    public String getEdution() 
    {
        return edution;
    }
    public void setWorkexp(String workexp) 
    {
        this.workexp = workexp;
    }

    public String getWorkexp() 
    {
        return workexp;
    }
    public void setSelfeval(String selfeval) 
    {
        this.selfeval = selfeval;
    }

    public String getSelfeval() 
    {
        return selfeval;
    }
    public void setEnglishabillity(String englishabillity) 
    {
        this.englishabillity = englishabillity;
    }

    public String getEnglishabillity() 
    {
        return englishabillity;
    }
    public void setTraingexp(String traingexp) 
    {
        this.traingexp = traingexp;
    }

    public String getTraingexp() 
    {
        return traingexp;
    }
    public void setPhoto(String photo) 
    {
        this.photo = photo;
    }

    public String getPhoto() 
    {
        return photo;
    }
    public void setAttach(String attach) 
    {
        this.attach = attach;
    }

    public String getAttach() 
    {
        return attach;
    }
    public void setProjectexp(String projectexp) 
    {
        this.projectexp = projectexp;
    }

    public String getProjectexp() 
    {
        return projectexp;
    }
    public void setResumeletter(String resumeletter) 
    {
        this.resumeletter = resumeletter;
    }

    public String getResumeletter() 
    {
        return resumeletter;
    }
    public void setProobject(String proobject) 
    {
        this.proobject = proobject;
    }

    public String getProobject() 
    {
        return proobject;
    }
    public void setLuyongstatus(String luyongstatus) 
    {
        this.luyongstatus = luyongstatus;
    }

    public String getLuyongstatus() 
    {
        return luyongstatus;
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
            .append("name", getName())
            .append("sex", getSex())
            .append("contact", getContact())
            .append("idno", getIdno())
            .append("national", getNational())
            .append("birthday", getBirthday())
            .append("political", getPolitical())
            .append("jiguan", getJiguan())
            .append("hukouinpos", getHukouinpos())
            .append("studyexp", getStudyexp())
            .append("staffname", getStaffname())
            .append("college", getCollege())
            .append("professional", getProfessional())
            .append("secpro", getSecpro())
            .append("email", getEmail())
            .append("familytelephone", getFamilytelephone())
            .append("familyaddr", getFamilyaddr())
            .append("postalcode", getPostalcode())
            .append("edution", getEdution())
            .append("workexp", getWorkexp())
            .append("selfeval", getSelfeval())
            .append("englishabillity", getEnglishabillity())
            .append("traingexp", getTraingexp())
            .append("photo", getPhoto())
            .append("attach", getAttach())
            .append("projectexp", getProjectexp())
            .append("resumeletter", getResumeletter())
            .append("proobject", getProobject())
            .append("luyongstatus", getLuyongstatus())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
