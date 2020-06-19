package app;

import app.demo.api.product.kafka.ProductCreatedMessage;
import app.demo.customer.kafka.ProductCreatedMessageHandler;
import core.framework.module.Module;

/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        kafka().subscribe("product-created", ProductCreatedMessage.class, bind(ProductCreatedMessageHandler.class));
    }
}
