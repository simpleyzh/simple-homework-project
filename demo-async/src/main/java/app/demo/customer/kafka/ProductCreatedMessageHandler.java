package app.demo.customer.kafka;

import app.demo.api.product.kafka.ProductCreatedMessage;
import core.framework.kafka.MessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author simple
 */
public class ProductCreatedMessageHandler implements MessageHandler<ProductCreatedMessage> {
    private final Logger logger = LoggerFactory.getLogger(ProductCreatedMessageHandler.class);

    @Override
    public void handle(String key, ProductCreatedMessage value) {
        logger.info("{}----{}", key, value);
    }
}
