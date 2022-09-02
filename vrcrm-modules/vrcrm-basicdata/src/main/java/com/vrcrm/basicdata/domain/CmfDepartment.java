package com.vrcrm.basicdata.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 部门管理对象 cmf_department
 * 
 * @author VRer
 * @date 2022-04-15
 */
public class CmfDepartment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deptName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String telNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String faxNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deptNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deptParent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String manager;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String leader1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String leader2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deptFunc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long orderno;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
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
    public void setDeptNo(Long deptNo) 
    {
        this.deptNo = deptNo;
    }

    public Long getDeptNo() 
    {
        return deptNo;
    }
    public void setDeptParent(Long deptParent) 
    {
        this.deptParent = deptParent;
    }

    public Long getDeptParent() 
    {
        return deptParent;
    }
    public void setManager(String manager) 
    {
        this.manager = manager;
    }

    public String getManager() 
    {
        return manager;
    }
    public void setLeader1(String leader1) 
    {
        this.leader1 = leader1;
    }

    public String getLeader1() 
    {
        return leader1;
    }
    public void setLeader2(String leader2) 
    {
        this.leader2 = leader2;
    }

    public String getLeader2() 
    {
        return leader2;
    }
    public void setDeptFunc(String deptFunc) 
    {
        this.deptFunc = deptFunc;
    }

    public String getDeptFunc() 
    {
        return deptFunc;
    }
    public void setOrderno(Long orderno) 
    {
        this.orderno = orderno;
    }

    public Long getOrderno() 
    {
        return orderno;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("deptName", getDeptName())
            .append("telNo", getTelNo())
            .append("faxNo", getFaxNo())
            .append("deptNo", getDeptNo())
            .append("deptParent", getDeptParent())
            .append("manager", getManager())
            .append("leader1", getLeader1())
            .append("leader2", getLeader2())
            .append("deptFunc", getDeptFunc())
            .append("orderno", getOrderno())
            .toString();
    }
}
