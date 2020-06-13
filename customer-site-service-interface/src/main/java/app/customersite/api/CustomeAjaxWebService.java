package app.customersite.api;


import core.framework.api.web.service.GET;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.PUT;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.PathParam;

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
