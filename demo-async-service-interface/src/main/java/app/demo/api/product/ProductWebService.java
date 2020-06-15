package app.demo.api.product;

import core.framework.api.web.service.POST;
import core.framework.api.web.service.Path;

/**
 * @author simple
 */
public interface ProductWebService {
    @POST
    @Path("/product")
    void createProduct(CreateProductRequest request);
}
