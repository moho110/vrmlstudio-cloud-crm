package com.vrcrm.store.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 库存初始化对象 cmf_store_init
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfStoreInit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long storeid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long price;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long num;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long jine;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String memo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long flag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String prodname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String guige;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String xinghao;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String danwei;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String typename;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setProdid(String prodid) 
    {
        this.prodid = prodid;
    }

    public String getProdid() 
    {
        return prodid;
    }
    public void setStoreid(Long storeid) 
    {
        this.storeid = storeid;
    }

    public Long getStoreid() 
    {
        return storeid;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setNum(Long num) 
    {
        this.num = num;
    }

    public Long getNum() 
    {
        return num;
    }
    public void setJine(Long jine) 
    {
        this.jine = jine;
    }

    public Long getJine() 
    {
        return jine;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setFlag(Long flag) 
    {
        this.flag = flag;
    }

    public Long getFlag() 
    {
        return flag;
    }
    public void setProdname(String prodname) 
    {
        this.prodname = prodname;
    }

    public String getProdname() 
    {
        return prodname;
    }
    public void setGuige(String guige) 
    {
        this.guige = guige;
    }

    public String getGuige() 
    {
        return guige;
    }
    public void setXinghao(String xinghao) 
    {
        this.xinghao = xinghao;
    }

    public String getXinghao() 
    {
        return xinghao;
    }
    public void setDanwei(String danwei) 
    {
        this.danwei = danwei;
    }

    public String getDanwei() 
    {
        return danwei;
    }
    public void setTypename(String typename) 
    {
        this.typename = typename;
    }

    public String getTypename() 
    {
        return typename;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("prodid", getProdid())
            .append("storeid", getStoreid())
            .append("price", getPrice())
            .append("num", getNum())
            .append("jine", getJine())
            .append("memo", getMemo())
            .append("flag", getFlag())
            .append("prodname", getProdname())
            .append("guige", getGuige())
            .append("xinghao", getXinghao())
            .append("danwei", getDanwei())
            .append("typename", getTypename())
            .toString();
    }
}
