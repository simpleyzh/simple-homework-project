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
public interface CustomerWebService {
    @POST
    @Path("/customer")
    void createCustomer(CustomerView request);

    @GET
    @Path("/customer/:id")
    CustomerView getCustomer(@PathParam("id") String id);

    @PUT
    @Path("/customer")
    SearchCustomerResponse searchCustomer(SearchCustomerRequest request);

    @PUT
    @Path("/customer/:id")
    void updateCustomer(@PathParam("id") String id, UpdateCustomerRequest request);

    @DELETE
    @Path("/customer/:id")
    void deleteCustomer(@PathParam("id") String id);
}
