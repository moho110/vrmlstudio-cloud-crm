package com.vrcrm.mytable.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 短信发送清单对象 cmf_sms_sendlist
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSmsSendlist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String msg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date nowtime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String attime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long destcount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String result;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String errmsg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long trytimes;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long batchid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String destid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long leftcount;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setMsg(String msg) 
    {
        this.msg = msg;
    }

    public String getMsg() 
    {
        return msg;
    }
    public void setNowtime(Date nowtime) 
    {
        this.nowtime = nowtime;
    }

    public Date getNowtime() 
    {
        return nowtime;
    }
    public void setAttime(String attime) 
    {
        this.attime = attime;
    }

    public String getAttime() 
    {
        return attime;
    }
    public void setDestcount(Long destcount) 
    {
        this.destcount = destcount;
    }

    public Long getDestcount() 
    {
        return destcount;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setErrmsg(String errmsg) 
    {
        this.errmsg = errmsg;
    }

    public String getErrmsg() 
    {
        return errmsg;
    }
    public void setTrytimes(Long trytimes) 
    {
        this.trytimes = trytimes;
    }

    public Long getTrytimes() 
    {
        return trytimes;
    }
    public void setUserid(String userid) 
    {
        this.userid = userid;
    }

    public String getUserid() 
    {
        return userid;
    }
    public void setBatchid(Long batchid) 
    {
        this.batchid = batchid;
    }

    public Long getBatchid() 
    {
        return batchid;
    }
    public void setDestid(String destid) 
    {
        this.destid = destid;
    }

    public String getDestid() 
    {
        return destid;
    }
    public void setLeftcount(Long leftcount) 
    {
        this.leftcount = leftcount;
    }

    public Long getLeftcount() 
    {
        return leftcount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("msg", getMsg())
            .append("nowtime", getNowtime())
            .append("attime", getAttime())
            .append("destcount", getDestcount())
            .append("result", getResult())
            .append("errmsg", getErrmsg())
            .append("trytimes", getTrytimes())
            .append("userid", getUserid())
            .append("batchid", getBatchid())
            .append("destid", getDestid())
            .append("leftcount", getLeftcount())
            .toString();
    }
}
