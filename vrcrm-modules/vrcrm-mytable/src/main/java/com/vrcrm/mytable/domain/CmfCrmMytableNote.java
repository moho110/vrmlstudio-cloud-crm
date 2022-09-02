package com.vrcrm.mytable.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

import java.util.Date;

/**
 * 桌面便签表对象 cmf_crm_mytable_note
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfCrmMytableNote extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String notecontent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createid;
    private Date createtime;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setNotecontent(String notecontent) 
    {
        this.notecontent = notecontent;
    }

    public String getNotecontent() 
    {
        return notecontent;
    }
    public void setCreateid(String createid) 
    {
        this.createid = createid;
    }

    public String getCreateid() 
    {
        return createid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("notecontent", getNotecontent())
            .append("createid", getCreateid())
            .append("createtime", getCreatetime())
            .toString();
    }

    private Date getCreatetime() {
        return this.createtime;
    }
}
