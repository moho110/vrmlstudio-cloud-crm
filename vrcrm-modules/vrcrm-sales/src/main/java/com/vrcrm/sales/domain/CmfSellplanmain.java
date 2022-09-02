package com.vrcrm.sales.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 销售计划对象 cmf_sellplanmain
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSellplanmain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhuti;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supplyid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chanceid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sellplanno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal totalmoney;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long paytype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal huikuanjine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal fahuojine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal kaipiaojine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date plandate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date zuiwanfahuodate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qianyueren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer userFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beizhu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fileaddress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long fahuostate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String gaiyao;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String storeid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String linkman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mobile;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer billtype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long ifpay;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String beiyong;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer kaipiaostate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fapiaoneirong;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fapiaotype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fapiaono;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long fahuotype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fahuodan;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long fahuoyunfei;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String yunfeitype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long oddment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long integral;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setZhuti(String zhuti) 
    {
        this.zhuti = zhuti;
    }

    public String getZhuti() 
    {
        return zhuti;
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
    public void setChanceid(String chanceid) 
    {
        this.chanceid = chanceid;
    }

    public String getChanceid() 
    {
        return chanceid;
    }
    public void setSellplanno(String sellplanno) 
    {
        this.sellplanno = sellplanno;
    }

    public String getSellplanno() 
    {
        return sellplanno;
    }
    public void setTotalmoney(BigDecimal totalmoney) 
    {
        this.totalmoney = totalmoney;
    }

    public BigDecimal getTotalmoney() 
    {
        return totalmoney;
    }
    public void setPaytype(Long paytype) 
    {
        this.paytype = paytype;
    }

    public Long getPaytype() 
    {
        return paytype;
    }
    public void setHuikuanjine(BigDecimal huikuanjine) 
    {
        this.huikuanjine = huikuanjine;
    }

    public BigDecimal getHuikuanjine() 
    {
        return huikuanjine;
    }
    public void setFahuojine(BigDecimal fahuojine) 
    {
        this.fahuojine = fahuojine;
    }

    public BigDecimal getFahuojine() 
    {
        return fahuojine;
    }
    public void setKaipiaojine(BigDecimal kaipiaojine) 
    {
        this.kaipiaojine = kaipiaojine;
    }

    public BigDecimal getKaipiaojine() 
    {
        return kaipiaojine;
    }
    public void setPlandate(Date plandate) 
    {
        this.plandate = plandate;
    }

    public Date getPlandate() 
    {
        return plandate;
    }
    public void setZuiwanfahuodate(Date zuiwanfahuodate) 
    {
        this.zuiwanfahuodate = zuiwanfahuodate;
    }

    public Date getZuiwanfahuodate() 
    {
        return zuiwanfahuodate;
    }
    public void setQianyueren(String qianyueren) 
    {
        this.qianyueren = qianyueren;
    }

    public String getQianyueren() 
    {
        return qianyueren;
    }
    public void setUserFlag(Integer userFlag) 
    {
        this.userFlag = userFlag;
    }

    public Integer getUserFlag() 
    {
        return userFlag;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
    }
    public void setFileaddress(String fileaddress) 
    {
        this.fileaddress = fileaddress;
    }

    public String getFileaddress() 
    {
        return fileaddress;
    }
    public void setFahuostate(Long fahuostate) 
    {
        this.fahuostate = fahuostate;
    }

    public Long getFahuostate() 
    {
        return fahuostate;
    }
    public void setGaiyao(String gaiyao) 
    {
        this.gaiyao = gaiyao;
    }

    public String getGaiyao() 
    {
        return gaiyao;
    }
    public void setStoreid(String storeid) 
    {
        this.storeid = storeid;
    }

    public String getStoreid() 
    {
        return storeid;
    }
    public void setLinkman(String linkman) 
    {
        this.linkman = linkman;
    }

    public String getLinkman() 
    {
        return linkman;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setBilltype(Integer billtype) 
    {
        this.billtype = billtype;
    }

    public Integer getBilltype() 
    {
        return billtype;
    }
    public void setIfpay(Long ifpay) 
    {
        this.ifpay = ifpay;
    }

    public Long getIfpay() 
    {
        return ifpay;
    }
    public void setBeiyong(String beiyong) 
    {
        this.beiyong = beiyong;
    }

    public String getBeiyong() 
    {
        return beiyong;
    }
    public void setKaipiaostate(Integer kaipiaostate) 
    {
        this.kaipiaostate = kaipiaostate;
    }

    public Integer getKaipiaostate() 
    {
        return kaipiaostate;
    }
    public void setFapiaoneirong(String fapiaoneirong) 
    {
        this.fapiaoneirong = fapiaoneirong;
    }

    public String getFapiaoneirong() 
    {
        return fapiaoneirong;
    }
    public void setFapiaotype(String fapiaotype) 
    {
        this.fapiaotype = fapiaotype;
    }

    public String getFapiaotype() 
    {
        return fapiaotype;
    }
    public void setFapiaono(String fapiaono) 
    {
        this.fapiaono = fapiaono;
    }

    public String getFapiaono() 
    {
        return fapiaono;
    }
    public void setFahuotype(Long fahuotype) 
    {
        this.fahuotype = fahuotype;
    }

    public Long getFahuotype() 
    {
        return fahuotype;
    }
    public void setFahuodan(String fahuodan) 
    {
        this.fahuodan = fahuodan;
    }

    public String getFahuodan() 
    {
        return fahuodan;
    }
    public void setFahuoyunfei(Long fahuoyunfei) 
    {
        this.fahuoyunfei = fahuoyunfei;
    }

    public Long getFahuoyunfei() 
    {
        return fahuoyunfei;
    }
    public void setYunfeitype(String yunfeitype) 
    {
        this.yunfeitype = yunfeitype;
    }

    public String getYunfeitype() 
    {
        return yunfeitype;
    }
    public void setOddment(Long oddment) 
    {
        this.oddment = oddment;
    }

    public Long getOddment() 
    {
        return oddment;
    }
    public void setIntegral(Long integral) 
    {
        this.integral = integral;
    }

    public Long getIntegral() 
    {
        return integral;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zhuti", getZhuti())
            .append("userId", getUserId())
            .append("supplyid", getSupplyid())
            .append("chanceid", getChanceid())
            .append("sellplanno", getSellplanno())
            .append("totalmoney", getTotalmoney())
            .append("paytype", getPaytype())
            .append("huikuanjine", getHuikuanjine())
            .append("fahuojine", getFahuojine())
            .append("kaipiaojine", getKaipiaojine())
            .append("plandate", getPlandate())
            .append("zuiwanfahuodate", getZuiwanfahuodate())
            .append("qianyueren", getQianyueren())
            .append("userFlag", getUserFlag())
            .append("beizhu", getBeizhu())
            .append("fileaddress", getFileaddress())
            .append("fahuostate", getFahuostate())
            .append("gaiyao", getGaiyao())
            .append("storeid", getStoreid())
            .append("linkman", getLinkman())
            .append("address", getAddress())
            .append("mobile", getMobile())
            .append("createtime", getCreatetime())
            .append("billtype", getBilltype())
            .append("ifpay", getIfpay())
            .append("beiyong", getBeiyong())
            .append("kaipiaostate", getKaipiaostate())
            .append("fapiaoneirong", getFapiaoneirong())
            .append("fapiaotype", getFapiaotype())
            .append("fapiaono", getFapiaono())
            .append("fahuotype", getFahuotype())
            .append("fahuodan", getFahuodan())
            .append("fahuoyunfei", getFahuoyunfei())
            .append("yunfeitype", getYunfeitype())
            .append("oddment", getOddment())
            .append("integral", getIntegral())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
