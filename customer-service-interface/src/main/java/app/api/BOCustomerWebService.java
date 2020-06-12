package app.api;

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
    @Path("/customer/d")
    CustomerView createCustomer(BOCreateCustomerRequest request);

    @GET
    @Path("/customer/:id")
    CustomerView getCustomer(@PathParam("id") String id);

    @PUT
    @Path("/customer")
    BOSearchCustomerResponse searchCustomer(BOSearchCustomerRequest request);

    @POST
    @Path("/customer")
    CustomerView updateCustomer(BOUpdateCustomerRequest request);

    @DELETE
    @Path("/customer/:id/d")
    void deleteCustomer(@PathParam("id") String id);
}
