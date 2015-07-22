import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created by wanghailong on 15-7-22.
 */

public class SimpleJob implements Job {
    public void execute(JobExecutionContext jobCtx)throws JobExecutionException
    {
        System.out.println(jobCtx.getTrigger().getClass().getName()+"triggered time is:"+new Date());
    }

}
