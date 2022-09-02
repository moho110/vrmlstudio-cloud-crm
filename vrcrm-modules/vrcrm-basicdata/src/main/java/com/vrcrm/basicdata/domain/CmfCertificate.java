package com.vrcrm.basicdata.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 认证对象 cmf_certificate
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfCertificate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplyid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certificatetype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certificateno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certificateinfo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fromdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String enddate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String explianstr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fileaddress;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setSupplyid(String supplyid) 
    {
        this.supplyid = supplyid;
    }

    public String getSupplyid() 
    {
        return supplyid;
    }
    public void setCertificatetype(String certificatetype) 
    {
        this.certificatetype = certificatetype;
    }

    public String getCertificatetype() 
    {
        return certificatetype;
    }
    public void setCertificateno(String certificateno) 
    {
        this.certificateno = certificateno;
    }

    public String getCertificateno() 
    {
        return certificateno;
    }
    public void setCertificateinfo(String certificateinfo) 
    {
        this.certificateinfo = certificateinfo;
    }

    public String getCertificateinfo() 
    {
        return certificateinfo;
    }
    public void setFromdate(String fromdate) 
    {
        this.fromdate = fromdate;
    }

    public String getFromdate() 
    {
        return fromdate;
    }
    public void setEnddate(String enddate) 
    {
        this.enddate = enddate;
    }

    public String getEnddate() 
    {
        return enddate;
    }
    public void setExplianstr(String explianstr) 
    {
        this.explianstr = explianstr;
    }

    public String getExplianstr() 
    {
        return explianstr;
    }
    public void setUserFlag(String userFlag) 
    {
        this.userFlag = userFlag;
    }

    public String getUserFlag() 
    {
        return userFlag;
    }
    public void setFileaddress(String fileaddress) 
    {
        this.fileaddress = fileaddress;
    }

    public String getFileaddress() 
    {
        return fileaddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("supplyid", getSupplyid())
            .append("certificatetype", getCertificatetype())
            .append("certificateno", getCertificateno())
            .append("certificateinfo", getCertificateinfo())
            .append("fromdate", getFromdate())
            .append("enddate", getEnddate())
            .append("explianstr", getExplianstr())
            .append("userFlag", getUserFlag())
            .append("fileaddress", getFileaddress())
            .toString();
    }
}
