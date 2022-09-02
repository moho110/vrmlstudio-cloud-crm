package com.vrcrm.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 系统代码对象 cmf_sys_code
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSysCode extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String codeNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String codeName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String codeOrder;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String parentNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long codeFlag;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCodeNo(String codeNo) 
    {
        this.codeNo = codeNo;
    }

    public String getCodeNo() 
    {
        return codeNo;
    }
    public void setCodeName(String codeName) 
    {
        this.codeName = codeName;
    }

    public String getCodeName() 
    {
        return codeName;
    }
    public void setCodeOrder(String codeOrder) 
    {
        this.codeOrder = codeOrder;
    }

    public String getCodeOrder() 
    {
        return codeOrder;
    }
    public void setParentNo(String parentNo) 
    {
        this.parentNo = parentNo;
    }

    public String getParentNo() 
    {
        return parentNo;
    }
    public void setCodeFlag(Long codeFlag) 
    {
        this.codeFlag = codeFlag;
    }

    public Long getCodeFlag() 
    {
        return codeFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("codeNo", getCodeNo())
            .append("codeName", getCodeName())
            .append("codeOrder", getCodeOrder())
            .append("parentNo", getParentNo())
            .append("codeFlag", getCodeFlag())
            .toString();
    }
}
