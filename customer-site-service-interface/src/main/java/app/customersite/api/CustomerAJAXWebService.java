package app.customersite.api;


import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

/**
 * @author simple
 */
public interface CustomerAJAXWebService {

    @GET
    @Path("/ajax/customer/:id")
    CustomerAJAXView getCustomer(@PathParam("id") String id);

    @PUT
    @Path("/ajax/customer")
    SearchCustomerAJAXResponse searchCustomer(String name);

    @POST
    @Path("/ajax/customer")
    CustomerAJAXView updateCustomer(UpdateCustomerAJAXRequest request);

}
