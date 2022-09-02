package com.vrcrm.hr.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 教育明细对象 cmf_dict_education
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfDictEducation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dictEducationname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dictEducationcode;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setDictEducationname(String dictEducationname) 
    {
        this.dictEducationname = dictEducationname;
    }

    public String getDictEducationname() 
    {
        return dictEducationname;
    }
    public void setDictEducationcode(String dictEducationcode) 
    {
        this.dictEducationcode = dictEducationcode;
    }

    public String getDictEducationcode() 
    {
        return dictEducationcode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dictEducationname", getDictEducationname())
            .append("dictEducationcode", getDictEducationcode())
            .toString();
    }
}
