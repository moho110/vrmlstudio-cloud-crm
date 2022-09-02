package com.vrcrm.political.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 固定资产对象 cmf_fixedasset
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfFixedasset extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String setname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String setno;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String setpichi;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String settype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String purchaseid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supply;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String department;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String person;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String size;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long quantity;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String count;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String unit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String place;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String purchasedate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String billnum;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String idnumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String usedepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String usedirect;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String testdepartment;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dutyman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String qiyongdate;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setSetname(String setname) 
    {
        this.setname = setname;
    }

    public String getSetname() 
    {
        return setname;
    }
    public void setSetno(String setno) 
    {
        this.setno = setno;
    }

    public String getSetno() 
    {
        return setno;
    }
    public void setSetpichi(String setpichi) 
    {
        this.setpichi = setpichi;
    }

    public String getSetpichi() 
    {
        return setpichi;
    }
    public void setSettype(String settype) 
    {
        this.settype = settype;
    }

    public String getSettype() 
    {
        return settype;
    }
    public void setPurchaseid(String purchaseid) 
    {
        this.purchaseid = purchaseid;
    }

    public String getPurchaseid() 
    {
        return purchaseid;
    }
    public void setSupply(String supply) 
    {
        this.supply = supply;
    }

    public String getSupply() 
    {
        return supply;
    }
    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public String getDepartment() 
    {
        return department;
    }
    public void setPerson(String person) 
    {
        this.person = person;
    }

    public String getPerson() 
    {
        return person;
    }
    public void setSize(String size) 
    {
        this.size = size;
    }

    public String getSize() 
    {
        return size;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setCount(String count) 
    {
        this.count = count;
    }

    public String getCount() 
    {
        return count;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setPlace(String place) 
    {
        this.place = place;
    }

    public String getPlace() 
    {
        return place;
    }
    public void setPurchasedate(String purchasedate) 
    {
        this.purchasedate = purchasedate;
    }

    public String getPurchasedate() 
    {
        return purchasedate;
    }
    public void setBillnum(String billnum) 
    {
        this.billnum = billnum;
    }

    public String getBillnum() 
    {
        return billnum;
    }
    public void setIdnumber(String idnumber) 
    {
        this.idnumber = idnumber;
    }

    public String getIdnumber() 
    {
        return idnumber;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setUsedepartment(String usedepartment) 
    {
        this.usedepartment = usedepartment;
    }

    public String getUsedepartment() 
    {
        return usedepartment;
    }
    public void setUsedirect(String usedirect) 
    {
        this.usedirect = usedirect;
    }

    public String getUsedirect() 
    {
        return usedirect;
    }
    public void setTestdepartment(String testdepartment) 
    {
        this.testdepartment = testdepartment;
    }

    public String getTestdepartment() 
    {
        return testdepartment;
    }
    public void setDutyman(String dutyman) 
    {
        this.dutyman = dutyman;
    }

    public String getDutyman() 
    {
        return dutyman;
    }
    public void setQiyongdate(String qiyongdate) 
    {
        this.qiyongdate = qiyongdate;
    }

    public String getQiyongdate() 
    {
        return qiyongdate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("setname", getSetname())
            .append("setno", getSetno())
            .append("setpichi", getSetpichi())
            .append("settype", getSettype())
            .append("purchaseid", getPurchaseid())
            .append("supply", getSupply())
            .append("department", getDepartment())
            .append("person", getPerson())
            .append("size", getSize())
            .append("status", getStatus())
            .append("quantity", getQuantity())
            .append("price", getPrice())
            .append("count", getCount())
            .append("unit", getUnit())
            .append("place", getPlace())
            .append("purchasedate", getPurchasedate())
            .append("billnum", getBillnum())
            .append("idnumber", getIdnumber())
            .append("memo", getMemo())
            .append("creator", getCreator())
            .append("createtime", getCreatetime())
            .append("usedepartment", getUsedepartment())
            .append("usedirect", getUsedirect())
            .append("testdepartment", getTestdepartment())
            .append("dutyman", getDutyman())
            .append("qiyongdate", getQiyongdate())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
