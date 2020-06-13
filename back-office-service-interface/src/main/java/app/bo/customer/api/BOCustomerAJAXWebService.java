package app.bo.customer.api;


import core.framework.api.web.service.DELETE;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author simple
 */
public interface BOCustomerAJAXWebService {
    @POST
    @Path("/bo/customer/d")
    BOCustomerAJAXView createCustomer(BOCustomerAJAXView request);

    @GET
    @Path("/bo/customer/:id")
    BOCustomerAJAXView getCustomer(@PathParam("id") String id);

    @PUT
    @Path("/bo/customer")
    BOSearchCustomerAJAXResponse searchCustomer(BOSearchCustomerAJAXRequest request);

    @POST
    @Path("/bo/customer")
    BOCustomerAJAXView updateCustomer(BOUpdateCustomerAJAXRequest request);

    @DELETE
    @Path("/bo/customer/:id/d")
    void deleteCustomer(@PathParam("id") String id);
}
