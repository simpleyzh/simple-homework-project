package app.demo.customer.kafka;

import core.framework.kafka.MessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author simple
 */
public class UpdateProductMessageHandler implements MessageHandler<UpdateProductMessageHandler> {
    private final Logger logger = LoggerFactory.getLogger(UpdateProductMessageHandler.class);

    @Override
    public void handle(String key, UpdateProductMessageHandler value) {
        logger.info("{}----{}", key, value);
    }
}
