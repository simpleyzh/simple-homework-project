package app.demo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author simple
 */
public class Brush {
    private final Logger logger = LoggerFactory.getLogger(Brush.class);

    public void print() {
        logger.info("Hello World");
    }
}
