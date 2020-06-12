package app.bo.customer;

import app.api.BOCreateCustomerRequest;
import app.api.BOSearchCustomerRequest;
import app.api.BOSearchCustomerResponse;
import app.api.BOUpdateCustomerRequest;
import app.api.CustomerView;
import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author simple
 */
public interface CustomerAjaxWebService {
    @POST
    @Path("/ajax/customer/d")
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
