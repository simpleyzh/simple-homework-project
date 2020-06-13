package app.bo.customer.api;

import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
import app.customer.api.CustomerView;
import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author simple
 */
public interface CustomerAJAXWebService {
    @POST
    @Path("/ajax/customer/d")
    CustomerAJAXView createCustomer(CustomerAJAXView request);

    @GET
    @Path("/ajax/customer/:id")
    CustomerAJAXView getCustomer(@PathParam("id") String id);

    @PUT
    @Path("/ajax/customer")
    BOSearchCustomerResponse searchCustomer(BOSearchCustomerRequest request);

    @POST
    @Path("/ajax/customer")
    CustomerAJAXView updateCustomer(BOUpdateCustomerRequest request);

    @DELETE
    @Path("/ajax/customer/:id/d")
    void deleteCustomer(@PathParam("id") String id);
}