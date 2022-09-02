package com.vrcrm.customer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 客户需求对象 cmf_customer_xuqiu
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfCustomerXuqiu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String zhuti;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tigongren;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long customerid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long chanceid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String imports;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String content;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fujian;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fangan;
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
    public void setTigongren(String tigongren) 
    {
        this.tigongren = tigongren;
    }

    public String getTigongren() 
    {
        return tigongren;
    }
    public void setCustomerid(Long customerid) 
    {
        this.customerid = customerid;
    }

    public Long getCustomerid() 
    {
        return customerid;
    }
    public void setChanceid(Long chanceid) 
    {
        this.chanceid = chanceid;
    }

    public Long getChanceid() 
    {
        return chanceid;
    }
    public void setImports(String imports)
    {
        this.imports = imports;
    }

    public String getImports()
    {
        return imports;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setFujian(String fujian) 
    {
        this.fujian = fujian;
    }

    public String getFujian() 
    {
        return fujian;
    }
    public void setFangan(String fangan) 
    {
        this.fangan = fangan;
    }

    public String getFangan() 
    {
        return fangan;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zhuti", getZhuti())
            .append("tigongren", getTigongren())
            .append("customerid", getCustomerid())
            .append("chanceid", getChanceid())
            .append("import", getImports())
            .append("content", getContent())
            .append("createman", getCreateman())
            .append("createtime", getCreatetime())
            .append("fujian", getFujian())
            .append("fangan", getFangan())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
