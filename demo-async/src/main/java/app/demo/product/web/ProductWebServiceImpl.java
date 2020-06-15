package app.demo.product.web;

import app.demo.api.product.CreateProductRequest;
import app.demo.api.product.ProductView;
import app.demo.api.product.ProductWebService;
import app.demo.api.product.UpdateProductRequest;
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

    @Override
    public ProductView getProduct(String id) {
        return null;
    }

    @Override
    public void delProduct(String id) {

    }

    @Override
    public void updProduct(String id, UpdateProductRequest request) {

    }
}
