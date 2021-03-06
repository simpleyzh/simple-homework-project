package app.demo.api.product;

import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author simple
 */
public interface ProductWebService {
    @POST
    @Path("/product")
    void create(CreateProductRequest request);

    @GET
    @Path("/product/:id")
    ProductView get(@PathParam("id")String id);

    @DELETE
    @Path("/product/:id")
    void delete(@PathParam("id")String id);

    @PUT
    @Path("/product/:id")
    void update(@PathParam("id")String id, UpdateProductRequest request);
}
