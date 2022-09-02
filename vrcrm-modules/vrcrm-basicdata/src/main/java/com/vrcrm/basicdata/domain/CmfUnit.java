package com.vrcrm.basicdata.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 单位对象 cmf_unit
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfUnit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String unitName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String telNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String faxNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String postNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String email;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bankName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String bankNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal numzero;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long buybillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sellbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long stockinbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long stockoutbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long storecheckbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long stockchangebillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long zuzhuangbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long feiyongbillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long prepaybillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long preshoubillid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long dingjiagongshi;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setUnitName(String unitName) 
    {
        this.unitName = unitName;
    }

    public String getUnitName() 
    {
        return unitName;
    }
    public void setTelNo(String telNo) 
    {
        this.telNo = telNo;
    }

    public String getTelNo() 
    {
        return telNo;
    }
    public void setFaxNo(String faxNo) 
    {
        this.faxNo = faxNo;
    }

    public String getFaxNo() 
    {
        return faxNo;
    }
    public void setPostNo(String postNo) 
    {
        this.postNo = postNo;
    }

    public String getPostNo() 
    {
        return postNo;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }
    public void setBankNo(String bankNo) 
    {
        this.bankNo = bankNo;
    }

    public String getBankNo() 
    {
        return bankNo;
    }
    public void setNumzero(BigDecimal numzero) 
    {
        this.numzero = numzero;
    }

    public BigDecimal getNumzero() 
    {
        return numzero;
    }
    public void setBuybillid(Long buybillid) 
    {
        this.buybillid = buybillid;
    }

    public Long getBuybillid() 
    {
        return buybillid;
    }
    public void setSellbillid(Long sellbillid) 
    {
        this.sellbillid = sellbillid;
    }

    public Long getSellbillid() 
    {
        return sellbillid;
    }
    public void setStockinbillid(Long stockinbillid) 
    {
        this.stockinbillid = stockinbillid;
    }

    public Long getStockinbillid() 
    {
        return stockinbillid;
    }
    public void setStockoutbillid(Long stockoutbillid) 
    {
        this.stockoutbillid = stockoutbillid;
    }

    public Long getStockoutbillid() 
    {
        return stockoutbillid;
    }
    public void setStorecheckbillid(Long storecheckbillid) 
    {
        this.storecheckbillid = storecheckbillid;
    }

    public Long getStorecheckbillid() 
    {
        return storecheckbillid;
    }
    public void setStockchangebillid(Long stockchangebillid) 
    {
        this.stockchangebillid = stockchangebillid;
    }

    public Long getStockchangebillid() 
    {
        return stockchangebillid;
    }
    public void setZuzhuangbillid(Long zuzhuangbillid) 
    {
        this.zuzhuangbillid = zuzhuangbillid;
    }

    public Long getZuzhuangbillid() 
    {
        return zuzhuangbillid;
    }
    public void setFeiyongbillid(Long feiyongbillid) 
    {
        this.feiyongbillid = feiyongbillid;
    }

    public Long getFeiyongbillid() 
    {
        return feiyongbillid;
    }
    public void setPrepaybillid(Long prepaybillid) 
    {
        this.prepaybillid = prepaybillid;
    }

    public Long getPrepaybillid() 
    {
        return prepaybillid;
    }
    public void setPreshoubillid(Long preshoubillid) 
    {
        this.preshoubillid = preshoubillid;
    }

    public Long getPreshoubillid() 
    {
        return preshoubillid;
    }
    public void setDingjiagongshi(Long dingjiagongshi) 
    {
        this.dingjiagongshi = dingjiagongshi;
    }

    public Long getDingjiagongshi() 
    {
        return dingjiagongshi;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("unitName", getUnitName())
            .append("telNo", getTelNo())
            .append("faxNo", getFaxNo())
            .append("postNo", getPostNo())
            .append("address", getAddress())
            .append("url", getUrl())
            .append("email", getEmail())
            .append("bankName", getBankName())
            .append("bankNo", getBankNo())
            .append("numzero", getNumzero())
            .append("buybillid", getBuybillid())
            .append("sellbillid", getSellbillid())
            .append("stockinbillid", getStockinbillid())
            .append("stockoutbillid", getStockoutbillid())
            .append("storecheckbillid", getStorecheckbillid())
            .append("stockchangebillid", getStockchangebillid())
            .append("zuzhuangbillid", getZuzhuangbillid())
            .append("feiyongbillid", getFeiyongbillid())
            .append("prepaybillid", getPrepaybillid())
            .append("preshoubillid", getPreshoubillid())
            .append("dingjiagongshi", getDingjiagongshi())
            .toString();
    }
}
