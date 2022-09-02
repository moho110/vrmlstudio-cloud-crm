package com.vrcrm.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 中层干部测评内容明细对象 cmf_edu_zhongcengmingxi
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfEduZhongcengmingxi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String testname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String testmanby;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String uit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staff;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pindeevl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pindememo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String abillitypingjia;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String abillitymemo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String studypingjia;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String studymemo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jixiaopingjia;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String jixiaomemo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String lianzhengpingjia;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String lianzhengmemo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pingjiaman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pingjiatime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTestname(String testname) 
    {
        this.testname = testname;
    }

    public String getTestname() 
    {
        return testname;
    }
    public void setTestmanby(String testmanby) 
    {
        this.testmanby = testmanby;
    }

    public String getTestmanby() 
    {
        return testmanby;
    }
    public void setUit(String uit) 
    {
        this.uit = uit;
    }

    public String getUit() 
    {
        return uit;
    }
    public void setStaff(String staff) 
    {
        this.staff = staff;
    }

    public String getStaff() 
    {
        return staff;
    }
    public void setPindeevl(String pindeevl) 
    {
        this.pindeevl = pindeevl;
    }

    public String getPindeevl() 
    {
        return pindeevl;
    }
    public void setPindememo(String pindememo) 
    {
        this.pindememo = pindememo;
    }

    public String getPindememo() 
    {
        return pindememo;
    }
    public void setAbillitypingjia(String abillitypingjia) 
    {
        this.abillitypingjia = abillitypingjia;
    }

    public String getAbillitypingjia() 
    {
        return abillitypingjia;
    }
    public void setAbillitymemo(String abillitymemo) 
    {
        this.abillitymemo = abillitymemo;
    }

    public String getAbillitymemo() 
    {
        return abillitymemo;
    }
    public void setStudypingjia(String studypingjia) 
    {
        this.studypingjia = studypingjia;
    }

    public String getStudypingjia() 
    {
        return studypingjia;
    }
    public void setStudymemo(String studymemo) 
    {
        this.studymemo = studymemo;
    }

    public String getStudymemo() 
    {
        return studymemo;
    }
    public void setJixiaopingjia(String jixiaopingjia) 
    {
        this.jixiaopingjia = jixiaopingjia;
    }

    public String getJixiaopingjia() 
    {
        return jixiaopingjia;
    }
    public void setJixiaomemo(String jixiaomemo) 
    {
        this.jixiaomemo = jixiaomemo;
    }

    public String getJixiaomemo() 
    {
        return jixiaomemo;
    }
    public void setLianzhengpingjia(String lianzhengpingjia) 
    {
        this.lianzhengpingjia = lianzhengpingjia;
    }

    public String getLianzhengpingjia() 
    {
        return lianzhengpingjia;
    }
    public void setLianzhengmemo(String lianzhengmemo) 
    {
        this.lianzhengmemo = lianzhengmemo;
    }

    public String getLianzhengmemo() 
    {
        return lianzhengmemo;
    }
    public void setPingjiaman(String pingjiaman) 
    {
        this.pingjiaman = pingjiaman;
    }

    public String getPingjiaman() 
    {
        return pingjiaman;
    }
    public void setPingjiatime(String pingjiatime) 
    {
        this.pingjiatime = pingjiatime;
    }

    public String getPingjiatime() 
    {
        return pingjiatime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("testname", getTestname())
            .append("testmanby", getTestmanby())
            .append("uit", getUit())
            .append("staff", getStaff())
            .append("pindeevl", getPindeevl())
            .append("pindememo", getPindememo())
            .append("abillitypingjia", getAbillitypingjia())
            .append("abillitymemo", getAbillitymemo())
            .append("studypingjia", getStudypingjia())
            .append("studymemo", getStudymemo())
            .append("jixiaopingjia", getJixiaopingjia())
            .append("jixiaomemo", getJixiaomemo())
            .append("lianzhengpingjia", getLianzhengpingjia())
            .append("lianzhengmemo", getLianzhengmemo())
            .append("pingjiaman", getPingjiaman())
            .append("pingjiatime", getPingjiatime())
            .toString();
    }
}
