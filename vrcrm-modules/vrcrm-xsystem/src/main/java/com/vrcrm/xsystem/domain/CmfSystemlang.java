package com.vrcrm.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 系统语言对象 cmf_systemlang
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSystemlang extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fieldname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tablename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chinese;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String english;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setFieldname(String fieldname) 
    {
        this.fieldname = fieldname;
    }

    public String getFieldname() 
    {
        return fieldname;
    }
    public void setTablename(String tablename) 
    {
        this.tablename = tablename;
    }

    public String getTablename() 
    {
        return tablename;
    }
    public void setChinese(String chinese) 
    {
        this.chinese = chinese;
    }

    public String getChinese() 
    {
        return chinese;
    }
    public void setEnglish(String english) 
    {
        this.english = english;
    }

    public String getEnglish() 
    {
        return english;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fieldname", getFieldname())
            .append("tablename", getTablename())
            .append("chinese", getChinese())
            .append("english", getEnglish())
            .append("remark", getRemark())
            .toString();
    }
}
