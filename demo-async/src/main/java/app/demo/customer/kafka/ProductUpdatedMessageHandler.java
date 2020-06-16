package app.demo.customer.kafka;

import core.framework.kafka.MessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author simple
 */
public class ProductUpdatedMessageHandler implements MessageHandler<ProductUpdatedMessageHandler> {
    private final Logger logger = LoggerFactory.getLogger(ProductUpdatedMessageHandler.class);

    @Override
    public void handle(String key, ProductUpdatedMessageHandler value) {
        logger.info("{}----{}", key, value);
    }
}
