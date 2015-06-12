package org.txazo.wx.quartz.job;

import org.quartz.JobExecutionContext;
import org.txazo.wx.app.remind.bean.Remind;
import org.txazo.wx.app.remind.service.RemindService;

/**
 * RemindJob
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 11.06.2015
 */
public class RemindJob extends LimitJob {

    @Override
    protected void executeJob(JobExecutionContext context) throws Throwable {
        if (context.getJobDetail() instanceof RemindJobDetail) {
            System.out.println("---------- RemindJob begin");
            RemindJobDetail jobDetail = (RemindJobDetail) context.getJobDetail();
            Remind remind = jobDetail.getRemind();
            RemindService remindService = jobDetail.getRemindService();
            remindService.remindMessage(remind);
            System.out.println("---------- RemindJob end");
        }
    }

}
