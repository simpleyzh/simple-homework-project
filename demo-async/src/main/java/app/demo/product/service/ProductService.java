package app.demo.product.service;

import app.demo.api.product.CreateProductRequest;
import app.demo.api.product.kafka.CreatedProductMessage;
import core.framework.inject.Inject;
import core.framework.kafka.MessagePublisher;

import java.time.LocalDateTime;

/**
 * @author simple
 */
public class ProductService {
    @Inject
    MessagePublisher<CreatedProductMessage> publish;

    public void create(CreateProductRequest request) {
        CreatedProductMessage message = new CreatedProductMessage();
        message.id = request.id;
        message.desc = request.desc;
        message.name = request.name;
        message.createdTime = LocalDateTime.now();

        publish.publish(message);
    }
}
