package com.vrcrm.customer.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 客户对象 cmf_customer
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

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
    private String state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String membercard;

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
    private String explainstr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String briefstr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodprice;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String amtagio;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recommand;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String getaccount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long yuchuzhi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long factgetmoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long nogetmoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String origin;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String salemode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String property;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String datascope;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createdate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long integral;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date lasttracetime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
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
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setMembercard(String membercard) 
    {
        this.membercard = membercard;
    }

    public String getMembercard() 
    {
        return membercard;
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
    public void setExplainstr(String explainstr) 
    {
        this.explainstr = explainstr;
    }

    public String getExplainstr() 
    {
        return explainstr;
    }
    public void setBriefstr(String briefstr) 
    {
        this.briefstr = briefstr;
    }

    public String getBriefstr() 
    {
        return briefstr;
    }
    public void setProdprice(String prodprice) 
    {
        this.prodprice = prodprice;
    }

    public String getProdprice() 
    {
        return prodprice;
    }
    public void setAmtagio(String amtagio) 
    {
        this.amtagio = amtagio;
    }

    public String getAmtagio() 
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
    public void setGetaccount(String getaccount) 
    {
        this.getaccount = getaccount;
    }

    public String getGetaccount() 
    {
        return getaccount;
    }
    public void setYuchuzhi(Long yuchuzhi) 
    {
        this.yuchuzhi = yuchuzhi;
    }

    public Long getYuchuzhi() 
    {
        return yuchuzhi;
    }
    public void setFactgetmoney(Long factgetmoney) 
    {
        this.factgetmoney = factgetmoney;
    }

    public Long getFactgetmoney() 
    {
        return factgetmoney;
    }
    public void setNogetmoney(Long nogetmoney) 
    {
        this.nogetmoney = nogetmoney;
    }

    public Long getNogetmoney() 
    {
        return nogetmoney;
    }
    public void setOrigin(String origin) 
    {
        this.origin = origin;
    }

    public String getOrigin() 
    {
        return origin;
    }
    public void setSalemode(String salemode) 
    {
        this.salemode = salemode;
    }

    public String getSalemode() 
    {
        return salemode;
    }
    public void setProperty(String property) 
    {
        this.property = property;
    }

    public String getProperty() 
    {
        return property;
    }
    public void setDatascope(String datascope) 
    {
        this.datascope = datascope;
    }

    public String getDatascope() 
    {
        return datascope;
    }
    public void setCreatedate(Date createdate) 
    {
        this.createdate = createdate;
    }

    public Date getCreatedate() 
    {
        return createdate;
    }
    public void setIntegral(Long integral) 
    {
        this.integral = integral;
    }

    public Long getIntegral() 
    {
        return integral;
    }
    public void setLasttracetime(Date lasttracetime) 
    {
        this.lasttracetime = lasttracetime;
    }

    public Date getLasttracetime() 
    {
        return lasttracetime;
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
            .append("state", getState())
            .append("membercard", getMembercard())
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
            .append("explainstr", getExplainstr())
            .append("briefstr", getBriefstr())
            .append("prodprice", getProdprice())
            .append("amtagio", getAmtagio())
            .append("remark", getRemark())
            .append("recommand", getRecommand())
            .append("getaccount", getGetaccount())
            .append("yuchuzhi", getYuchuzhi())
            .append("factgetmoney", getFactgetmoney())
            .append("nogetmoney", getNogetmoney())
            .append("origin", getOrigin())
            .append("salemode", getSalemode())
            .append("property", getProperty())
            .append("datascope", getDatascope())
            .append("createdate", getCreatedate())
            .append("integral", getIntegral())
            .append("lasttracetime", getLasttracetime())
            .toString();
    }
}
