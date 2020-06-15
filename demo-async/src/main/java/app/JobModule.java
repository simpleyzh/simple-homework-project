package app;

import app.demo.job.PrintJob;
import core.framework.module.Module;
import java.time.Duration;
import java.time.ZoneId;

/**
 * @author simple
 */
public class JobModule extends Module {
    @Override
    protected void initialize() {
        PrintJob job = bind(PrintJob.class);
        schedule().timeZone(ZoneId.of("America/New_York"));
        schedule().fixedRate("print-current-time", job, Duration.ofSeconds(10));

    }
}
