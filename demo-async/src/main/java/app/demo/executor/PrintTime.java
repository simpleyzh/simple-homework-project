package app.demo.executor;

import core.framework.async.Executor;
import core.framework.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * @author simple
 */
public class PrintTime {
    private final Logger logger = LoggerFactory.getLogger(PrintTime.class);
    @Inject
    Executor executor;

    public void print() {
        executor.submit("print-current-time", () -> {
            logger.info("time={}", LocalDateTime.now());
        });
    }
}
