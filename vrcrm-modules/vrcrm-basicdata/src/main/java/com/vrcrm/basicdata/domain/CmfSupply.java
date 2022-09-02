package com.vrcrm.basicdata.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 供应商对象 cmf_supply
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSupply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplyid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplyname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplyshortname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String enterstype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String calling;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String linkman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String artificialperson;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chargesection;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String postalcode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fax;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contactaddress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String email;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String netword;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bank;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String accountnumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String startdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String enddate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String style;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplycn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sysuser;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodtype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal amtagio;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recommand;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String payaccount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long paymoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long factpaymoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long nopaymoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long datascope;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long yufukuan;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSupplyid(String supplyid) 
    {
        this.supplyid = supplyid;
    }

    public String getSupplyid() 
    {
        return supplyid;
    }
    public void setSupplyname(String supplyname) 
    {
        this.supplyname = supplyname;
    }

    public String getSupplyname() 
    {
        return supplyname;
    }
    public void setSupplyshortname(String supplyshortname) 
    {
        this.supplyshortname = supplyshortname;
    }

    public String getSupplyshortname() 
    {
        return supplyshortname;
    }
    public void setEnterstype(String enterstype) 
    {
        this.enterstype = enterstype;
    }

    public String getEnterstype() 
    {
        return enterstype;
    }
    public void setCalling(String calling) 
    {
        this.calling = calling;
    }

    public String getCalling() 
    {
        return calling;
    }
    public void setLinkman(String linkman) 
    {
        this.linkman = linkman;
    }

    public String getLinkman() 
    {
        return linkman;
    }
    public void setArtificialperson(String artificialperson) 
    {
        this.artificialperson = artificialperson;
    }

    public String getArtificialperson() 
    {
        return artificialperson;
    }
    public void setChargesection(String chargesection) 
    {
        this.chargesection = chargesection;
    }

    public String getChargesection() 
    {
        return chargesection;
    }
    public void setPostalcode(String postalcode) 
    {
        this.postalcode = postalcode;
    }

    public String getPostalcode() 
    {
        return postalcode;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setFax(String fax) 
    {
        this.fax = fax;
    }

    public String getFax() 
    {
        return fax;
    }
    public void setContactaddress(String contactaddress) 
    {
        this.contactaddress = contactaddress;
    }

    public String getContactaddress() 
    {
        return contactaddress;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setNetword(String netword) 
    {
        this.netword = netword;
    }

    public String getNetword() 
    {
        return netword;
    }
    public void setBank(String bank) 
    {
        this.bank = bank;
    }

    public String getBank() 
    {
        return bank;
    }
    public void setAccountnumber(String accountnumber) 
    {
        this.accountnumber = accountnumber;
    }

    public String getAccountnumber() 
    {
        return accountnumber;
    }
    public void setStartdate(String startdate) 
    {
        this.startdate = startdate;
    }

    public String getStartdate() 
    {
        return startdate;
    }
    public void setEnddate(String enddate) 
    {
        this.enddate = enddate;
    }

    public String getEnddate() 
    {
        return enddate;
    }
    public void setStyle(String style) 
    {
        this.style = style;
    }

    public String getStyle() 
    {
        return style;
    }
    public void setUserFlag(String userFlag) 
    {
        this.userFlag = userFlag;
    }

    public String getUserFlag() 
    {
        return userFlag;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setSupplycn(String supplycn) 
    {
        this.supplycn = supplycn;
    }

    public String getSupplycn() 
    {
        return supplycn;
    }
    public void setSysuser(String sysuser) 
    {
        this.sysuser = sysuser;
    }

    public String getSysuser() 
    {
        return sysuser;
    }
    public void setProdtype(String prodtype) 
    {
        this.prodtype = prodtype;
    }

    public String getProdtype() 
    {
        return prodtype;
    }
    public void setAmtagio(BigDecimal amtagio) 
    {
        this.amtagio = amtagio;
    }

    public BigDecimal getAmtagio() 
    {
        return amtagio;
    }
    public void setRecommand(String recommand) 
    {
        this.recommand = recommand;
    }

    public String getRecommand() 
    {
        return recommand;
    }
    public void setPayaccount(String payaccount) 
    {
        this.payaccount = payaccount;
    }

    public String getPayaccount() 
    {
        return payaccount;
    }
    public void setPaymoney(Long paymoney) 
    {
        this.paymoney = paymoney;
    }

    public Long getPaymoney() 
    {
        return paymoney;
    }
    public void setFactpaymoney(Long factpaymoney) 
    {
        this.factpaymoney = factpaymoney;
    }

    public Long getFactpaymoney() 
    {
        return factpaymoney;
    }
    public void setNopaymoney(Long nopaymoney) 
    {
        this.nopaymoney = nopaymoney;
    }

    public Long getNopaymoney() 
    {
        return nopaymoney;
    }
    public void setDatascope(Long datascope) 
    {
        this.datascope = datascope;
    }

    public Long getDatascope() 
    {
        return datascope;
    }
    public void setYufukuan(Long yufukuan) 
    {
        this.yufukuan = yufukuan;
    }

    public Long getYufukuan() 
    {
        return yufukuan;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("supplyid", getSupplyid())
            .append("supplyname", getSupplyname())
            .append("supplyshortname", getSupplyshortname())
            .append("enterstype", getEnterstype())
            .append("calling", getCalling())
            .append("linkman", getLinkman())
            .append("artificialperson", getArtificialperson())
            .append("chargesection", getChargesection())
            .append("postalcode", getPostalcode())
            .append("phone", getPhone())
            .append("fax", getFax())
            .append("contactaddress", getContactaddress())
            .append("email", getEmail())
            .append("netword", getNetword())
            .append("bank", getBank())
            .append("accountnumber", getAccountnumber())
            .append("startdate", getStartdate())
            .append("enddate", getEnddate())
            .append("style", getStyle())
            .append("userFlag", getUserFlag())
            .append("userId", getUserId())
            .append("supplycn", getSupplycn())
            .append("sysuser", getSysuser())
            .append("prodtype", getProdtype())
            .append("amtagio", getAmtagio())
            .append("remark", getRemark())
            .append("recommand", getRecommand())
            .append("payaccount", getPayaccount())
            .append("paymoney", getPaymoney())
            .append("factpaymoney", getFactpaymoney())
            .append("nopaymoney", getNopaymoney())
            .append("datascope", getDatascope())
            .append("yufukuan", getYufukuan())
            .toString();
    }
}
