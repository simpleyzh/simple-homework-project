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
public interface CustomerAJAXWebService {
    @POST
    @Path("/ajax/customer")
    void create(CreateCustomerAJAXRequest request);

    @GET
    @Path("/ajax/customer/:id")
    CustomerView get(@PathParam("id") String id);

    @PUT
    @Path("/ajax/customer")
    SearchCustomerAJAXResponse search(SearchCustomerAJAXRequest request);

    @PUT
    @Path("/ajax/customer/:id")
    void update(@PathParam("id") String id, UpdateCustomerAJAXRequest request);

    @DELETE
    @Path("/ajax/customer/:id")
    void delete(@PathParam("id") String id);
}
