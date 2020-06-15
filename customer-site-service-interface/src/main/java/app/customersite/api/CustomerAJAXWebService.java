package app.customersite.api;

import core.framework.api.web.service.Path;
import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.PathParam;
import core.framework.api.web.service.DELETE;

/**
 * @author simple
 */
public interface CustomerAJAXWebService {

    @POST
    @Path("/ajax/customer/c")
    CustomerAJAXView createCustomer(CustomerAJAXView request);

    @GET
    @Path("/ajax/customer/:id")
    CustomerAJAXView getCustomer(@PathParam("id") String id);

    @PUT
    @Path("/ajax/customer")
    SearchCustomerAJAXResponse searchCustomer(SearchCustomerAJAXRequest request);

    @POST
    @Path("/ajax/customer")
    CustomerAJAXView updateCustomer(UpdateCustomerAJAXRequest request);

    @DELETE
    @Path("/ajax/customer/:id/d")
    void deleteCustomer(@PathParam("id") String id);
}
