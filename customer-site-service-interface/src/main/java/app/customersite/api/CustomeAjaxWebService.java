package app.customersite.api;

import app.customer.api.*;
import core.framework.api.web.service.*;

/**
 * @Author simple
 */
public interface CustomeAjaxWebService {
    @POST
    @Path("/customer/d")
    CustomerAJAXView createCustomer(CustomerAJAXView request);

    @GET
    @Path("/customer/:id")
    CustomerAJAXView getCustomer(@PathParam("id") String id);

    @PUT
    @Path("/customer")
    SearchCustomerAJAXResponse searchCustomer(String name);

    @POST
    @Path("/customer")
    CustomerAJAXView updateCustomer(UpdateCustomerAJAXRequest request);

    @DELETE
    @Path("/customer/:id/d")
    void deleteCustomer(@PathParam("id") String id);
}
