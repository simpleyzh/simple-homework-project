package app.customersite.api;

import app.customer.api.*;
import core.framework.api.web.service.*;

/**
 * @Author simple
 */
public interface CustomeAjaxWebService {

    @GET
    @Path("/customer/:id")
    CustomerAJAXView getCustomer(@PathParam("id") String id);

    @PUT
    @Path("/customer")
    SearchCustomerAJAXResponse searchCustomer(String name);

    @POST
    @Path("/customer")
    CustomerAJAXView updateCustomer(UpdateCustomerAJAXRequest request);

}
