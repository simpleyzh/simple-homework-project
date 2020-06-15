package app;

import app.demo.api.product.ProductWebService;
import app.demo.api.product.kafka.CreatedProductMessage;
import app.demo.product.service.ProductService;
import app.demo.product.web.ProductWebServiceImpl;
import core.framework.module.Module;

/**
 * @author simple
 */
public class ProductModule extends Module {
    @Override
    protected void initialize() {
        kafka().uri(requiredProperty("sys.kafka.url"));
        kafka().publish("created-product", CreatedProductMessage.class);
        bind(ProductService.class);
        api().service(ProductWebService.class, bind(ProductWebServiceImpl.class));
    }
}
