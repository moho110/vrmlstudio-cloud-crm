package com.vrcrm.basicdata.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 修改记录对象 cmf_modifyrecord
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfModifyrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tablename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String keyfield;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String keyvalue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String modifycontent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ip;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setTablename(String tablename) 
    {
        this.tablename = tablename;
    }

    public String getTablename() 
    {
        return tablename;
    }
    public void setKeyfield(String keyfield) 
    {
        this.keyfield = keyfield;
    }

    public String getKeyfield() 
    {
        return keyfield;
    }
    public void setKeyvalue(String keyvalue) 
    {
        this.keyvalue = keyvalue;
    }

    public String getKeyvalue() 
    {
        return keyvalue;
    }
    public void setCreateman(String createman) 
    {
        this.createman = createman;
    }

    public String getCreateman() 
    {
        return createman;
    }
    public void setModifycontent(String modifycontent) 
    {
        this.modifycontent = modifycontent;
    }

    public String getModifycontent() 
    {
        return modifycontent;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("tablename", getTablename())
            .append("keyfield", getKeyfield())
            .append("keyvalue", getKeyvalue())
            .append("createman", getCreateman())
            .append("modifycontent", getModifycontent())
            .append("createtime", getCreatetime())
            .append("ip", getIp())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
