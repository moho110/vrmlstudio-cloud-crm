package com.vrcrm.xsystem.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrcrm.common.core.web.domain.BaseEntity;
import com.vrcrm.common.core.annotation.Excel;

/**
 * 系统操作日志对象 cmf_system_logall
 * 
 * @author VRer
 * @date 2022-04-18
 */
public class CmfSystemLogall extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date currenttime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long executetime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sql;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long slowLaunchThreads;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long threadsCached;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long threadsConnected;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long threadsCreated;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long threadsRunning;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long qcacheFreeBlocks;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long qcacheFreeMemory;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long qcacheHits;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long qcacheInserts;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long qcacheLowmemPrunes;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long qcacheNotCached;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long qcacheQueriesInCache;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long qcacheTotalBlocks;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCurrenttime(Date currenttime) 
    {
        this.currenttime = currenttime;
    }

    public Date getCurrenttime() 
    {
        return currenttime;
    }
    public void setExecutetime(Long executetime) 
    {
        this.executetime = executetime;
    }

    public Long getExecutetime() 
    {
        return executetime;
    }
    public void setSql(String sql) 
    {
        this.sql = sql;
    }

    public String getSql() 
    {
        return sql;
    }
    public void setSlowLaunchThreads(Long slowLaunchThreads) 
    {
        this.slowLaunchThreads = slowLaunchThreads;
    }

    public Long getSlowLaunchThreads() 
    {
        return slowLaunchThreads;
    }
    public void setThreadsCached(Long threadsCached) 
    {
        this.threadsCached = threadsCached;
    }

    public Long getThreadsCached() 
    {
        return threadsCached;
    }
    public void setThreadsConnected(Long threadsConnected) 
    {
        this.threadsConnected = threadsConnected;
    }

    public Long getThreadsConnected() 
    {
        return threadsConnected;
    }
    public void setThreadsCreated(Long threadsCreated) 
    {
        this.threadsCreated = threadsCreated;
    }

    public Long getThreadsCreated() 
    {
        return threadsCreated;
    }
    public void setThreadsRunning(Long threadsRunning) 
    {
        this.threadsRunning = threadsRunning;
    }

    public Long getThreadsRunning() 
    {
        return threadsRunning;
    }
    public void setQcacheFreeBlocks(Long qcacheFreeBlocks) 
    {
        this.qcacheFreeBlocks = qcacheFreeBlocks;
    }

    public Long getQcacheFreeBlocks() 
    {
        return qcacheFreeBlocks;
    }
    public void setQcacheFreeMemory(Long qcacheFreeMemory) 
    {
        this.qcacheFreeMemory = qcacheFreeMemory;
    }

    public Long getQcacheFreeMemory() 
    {
        return qcacheFreeMemory;
    }
    public void setQcacheHits(Long qcacheHits) 
    {
        this.qcacheHits = qcacheHits;
    }

    public Long getQcacheHits() 
    {
        return qcacheHits;
    }
    public void setQcacheInserts(Long qcacheInserts) 
    {
        this.qcacheInserts = qcacheInserts;
    }

    public Long getQcacheInserts() 
    {
        return qcacheInserts;
    }
    public void setQcacheLowmemPrunes(Long qcacheLowmemPrunes) 
    {
        this.qcacheLowmemPrunes = qcacheLowmemPrunes;
    }

    public Long getQcacheLowmemPrunes() 
    {
        return qcacheLowmemPrunes;
    }
    public void setQcacheNotCached(Long qcacheNotCached) 
    {
        this.qcacheNotCached = qcacheNotCached;
    }

    public Long getQcacheNotCached() 
    {
        return qcacheNotCached;
    }
    public void setQcacheQueriesInCache(Long qcacheQueriesInCache) 
    {
        this.qcacheQueriesInCache = qcacheQueriesInCache;
    }

    public Long getQcacheQueriesInCache() 
    {
        return qcacheQueriesInCache;
    }
    public void setQcacheTotalBlocks(Long qcacheTotalBlocks) 
    {
        this.qcacheTotalBlocks = qcacheTotalBlocks;
    }

    public Long getQcacheTotalBlocks() 
    {
        return qcacheTotalBlocks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("currenttime", getCurrenttime())
            .append("executetime", getExecutetime())
            .append("sql", getSql())
            .append("slowLaunchThreads", getSlowLaunchThreads())
            .append("threadsCached", getThreadsCached())
            .append("threadsConnected", getThreadsConnected())
            .append("threadsCreated", getThreadsCreated())
            .append("threadsRunning", getThreadsRunning())
            .append("qcacheFreeBlocks", getQcacheFreeBlocks())
            .append("qcacheFreeMemory", getQcacheFreeMemory())
            .append("qcacheHits", getQcacheHits())
            .append("qcacheInserts", getQcacheInserts())
            .append("qcacheLowmemPrunes", getQcacheLowmemPrunes())
            .append("qcacheNotCached", getQcacheNotCached())
            .append("qcacheQueriesInCache", getQcacheQueriesInCache())
            .append("qcacheTotalBlocks", getQcacheTotalBlocks())
            .toString();
    }
}
