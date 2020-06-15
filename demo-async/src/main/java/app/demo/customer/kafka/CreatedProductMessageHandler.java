package app.demo.customer.kafka;

import app.demo.api.product.kafka.CreatedProductMessage;
import core.framework.kafka.MessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author simple
 */
public class CreatedProductMessageHandler implements MessageHandler<CreatedProductMessage> {
    private final Logger logger = LoggerFactory.getLogger(CreatedProductMessageHandler.class);

    @Override
    public void handle(String key, CreatedProductMessage value) {
        logger.info("{}----{}", key, value);
    }
}
