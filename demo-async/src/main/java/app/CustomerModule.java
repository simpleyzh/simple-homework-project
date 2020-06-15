package app;

import app.demo.api.product.kafka.CreatedProductMessage;
import app.demo.customer.kafka.CreatedProductMessageHandler;
import core.framework.module.Module;

/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        kafka().subscribe("created-product", CreatedProductMessage.class, bind(CreatedProductMessageHandler.class));
    }
}
