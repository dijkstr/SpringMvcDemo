import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * Created by wanghailong on 15-7-22.
 * hello quartz!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("hello quartz!");
        try
        {
            JobDetail jobdetail = new JobDetail("job1_1", "jgroup1", SimpleJob.class);
            SimpleTrigger simpleTrigger = new SimpleTrigger("trigger1", "tgroup1");
            simpleTrigger.setStartTime(new Date());
            simpleTrigger.setRepeatInterval(1000);
            simpleTrigger.setRepeatCount(4);

            SchedulerFactory schedulerFactory = new StdSchedulerFactory() ;
            Scheduler scheduler = schedulerFactory.getScheduler();
            scheduler.scheduleJob(jobdetail, simpleTrigger);
            scheduler.start();

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
