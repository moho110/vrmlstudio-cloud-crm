package com.vrcrm.basicdata.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 国家代码对象 cmf_cmdict_countrycode
 * 
 * @author VRer
 * @date 2022-04-14
 */
public class CmfCmdictCountrycode extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String countryname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String countrycode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String postcode;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCountryname(String countryname) 
    {
        this.countryname = countryname;
    }

    public String getCountryname() 
    {
        return countryname;
    }
    public void setCountrycode(String countrycode) 
    {
        this.countrycode = countrycode;
    }

    public String getCountrycode() 
    {
        return countrycode;
    }
    public void setPostcode(String postcode) 
    {
        this.postcode = postcode;
    }

    public String getPostcode() 
    {
        return postcode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("countryname", getCountryname())
            .append("countrycode", getCountrycode())
            .append("postcode", getPostcode())
            .toString();
    }
}
