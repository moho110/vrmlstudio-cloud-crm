package com.vrcrm.job.util;

import org.quartz.JobExecutionContext;

import com.vrcrm.job.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 * 
 * @author vrcrm
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
