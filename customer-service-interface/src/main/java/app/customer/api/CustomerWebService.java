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
    @Path("/customer/d")
    CustomerView createCustomer(CreateCustomerRequest request);

    @GET
    @Path("/customer/:id")
    CustomerView getCustomer(@PathParam("id") String id);

    @PUT
    @Path("/customer")
    SearchCustomerResponse searchCustomer(SearchCustomerRequest request);

    @POST
    @Path("/customer")
    CustomerView updateCustomer(UpdateCustomerRequest request);

    @DELETE
    @Path("/customer/:id/d")
    void deleteCustomer(@PathParam("id") String id);
}
