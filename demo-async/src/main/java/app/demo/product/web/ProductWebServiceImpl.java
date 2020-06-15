package app.demo.product.web;

import app.demo.api.product.CreateProductRequest;
import app.demo.api.product.ProductWebService;
import app.demo.product.service.ProductService;
import core.framework.inject.Inject;

/**
 * @author simple
 */
public class ProductWebServiceImpl implements ProductWebService {
    @Inject
    ProductService service;

    @Override
    public void createProduct(CreateProductRequest request) {
        service.create(request);
    }
}
