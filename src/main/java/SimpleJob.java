import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.sql.Connection;
import java.util.Date;

/**
 * Created by wanghailong on 15-7-22.
 */

public class SimpleJob implements Job {
    private static int n = 0;
    private static final String findSql_src = "select sale_begin from item_db.item";
    public void execute(JobExecutionContext jobCtx)throws JobExecutionException
    {
//        Connection con_select = new
        System.out.println("DB run in  " + jobCtx.getTrigger().getClass().getName() + " triggered time is: " + new Date() + " " + ++n);
        if(n == 9)
            System.out.println(">>>>>>>>>>>>>>>>>");
    }

}
