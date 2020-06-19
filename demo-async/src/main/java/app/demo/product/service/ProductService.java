package app.demo.product.service;

import app.demo.api.product.CreateProductRequest;
import app.demo.api.product.ProductView;
import app.demo.api.product.UpdateProductRequest;
import app.demo.api.product.kafka.ProductCreatedMessage;
import app.demo.api.product.kafka.ProductUpdatedMessage;
import core.framework.inject.Inject;
import core.framework.kafka.MessagePublisher;

import java.time.LocalDateTime;

/**
 * @author simple
 */
public class ProductService {
    @Inject
    MessagePublisher<ProductCreatedMessage> publish;
    @Inject
    MessagePublisher<ProductUpdatedMessage> updatePublisher;

    public void create(CreateProductRequest request) {
        ProductCreatedMessage message = new ProductCreatedMessage();
        message.id = request.id;
        message.desc = request.desc;
        message.name = request.name;
        message.createdTime = LocalDateTime.now();

        publish.publish(message);
    }

    public void update(String id, UpdateProductRequest request) {
        ProductUpdatedMessage message = new ProductUpdatedMessage();
        message.id = id;
        message.desc = request.desc;
        message.name = request.name;
        updatePublisher.publish(message);
    }

    public ProductView get(String id) {
        return null;
    }

    public void del(String id) {

    }
}
