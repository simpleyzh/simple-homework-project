package app.demo.product.service;

import app.demo.api.product.CreateProductRequest;
import app.demo.api.product.ProductView;
import app.demo.api.product.UpdateProductRequest;
import app.demo.api.product.kafka.CreatedProductMessage;
import app.demo.api.product.kafka.UpdateProductMessage;
import core.framework.api.web.service.PathParam;
import core.framework.inject.Inject;
import core.framework.kafka.MessagePublisher;

import java.time.LocalDateTime;

/**
 * @author simple
 */
public class ProductService {
    @Inject
    MessagePublisher<CreatedProductMessage> publish;

    @Inject
    MessagePublisher<UpdateProductMessage> updatePublisher;

    public void create(CreateProductRequest request) {
        CreatedProductMessage message = new CreatedProductMessage();
        message.id = request.id;
        message.desc = request.desc;
        message.name = request.name;
        message.createdTime = LocalDateTime.now();

        publish.publish(message);
    }

    public void update(String id, UpdateProductRequest request) {
        UpdateProductMessage message = new UpdateProductMessage();
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
