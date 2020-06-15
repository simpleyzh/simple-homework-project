package app.demo.job;

import core.framework.scheduler.Job;
import core.framework.scheduler.JobContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author simple
 */
public class PrintJob implements Job {
    private final Logger logger = LoggerFactory.getLogger(PrintJob.class);

    @Override
    public void execute(JobContext context) {
        logger.info("Job is run,name is {}, time is {}", context.name, context.scheduledTime);
    }
}
