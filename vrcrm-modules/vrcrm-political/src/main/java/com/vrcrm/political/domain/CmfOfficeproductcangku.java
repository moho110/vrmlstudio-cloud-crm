package com.vrcrm.political.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 办公用品仓库对象 cmf_officeproductcangku
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfOfficeproductcangku extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String warehousename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String warehouseman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String telphone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String warehouseaddress;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setWarehousename(String warehousename) 
    {
        this.warehousename = warehousename;
    }

    public String getWarehousename() 
    {
        return warehousename;
    }
    public void setWarehouseman(String warehouseman) 
    {
        this.warehouseman = warehouseman;
    }

    public String getWarehouseman() 
    {
        return warehouseman;
    }
    public void setTelphone(String telphone) 
    {
        this.telphone = telphone;
    }

    public String getTelphone() 
    {
        return telphone;
    }
    public void setWarehouseaddress(String warehouseaddress) 
    {
        this.warehouseaddress = warehouseaddress;
    }

    public String getWarehouseaddress() 
    {
        return warehouseaddress;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("warehousename", getWarehousename())
            .append("warehouseman", getWarehouseman())
            .append("telphone", getTelphone())
            .append("warehouseaddress", getWarehouseaddress())
            .append("memo", getMemo())
            .toString();
    }
}
