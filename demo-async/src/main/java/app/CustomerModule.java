package app;

import app.demo.api.product.kafka.CreatedProductMessage;
import app.demo.customer.kafka.ProductCreatedMessageHandler;
import core.framework.module.Module;

/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        kafka().subscribe("product-created", CreatedProductMessage.class, bind(ProductCreatedMessageHandler.class));
    }
}
