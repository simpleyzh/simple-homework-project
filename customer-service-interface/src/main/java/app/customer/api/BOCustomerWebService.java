package app.customer.api;

import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author simple
 */
public interface BOCustomerWebService {
    @POST
    @Path("/bo/customer")
    void create(BOCreateCustomerRequest request);

    @GET
    @Path("/bo/customer/:id")
    CustomerView get(@PathParam("id") String id);

    @PUT
    @Path("/bo/customer")
    BOSearchCustomerResponse search(BOSearchCustomerRequest request);

    @PUT
    @Path("/bo/customer/:id")
    void update(@PathParam("id") String id, BOUpdateCustomerRequest request);

    @DELETE
    @Path("/bo/customer/:id")
    void delete(@PathParam("id") String id);
}
