package app.web;

import app.customer.api.CustomerView;
import app.customer.api.CustomerWebService;
import app.customersite.api.CustomerAJAXView;
import core.framework.inject.Inject;
import core.framework.json.JSON;
import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author simple
 */
public class CustomerCotroller {
    @Inject
    CustomerWebService service;

    public Response get(Request request) {
        return Response.text(JSON.toJSON(view(service.getCustomer(request.pathParam("id")))));
    }

    private CustomerAJAXView view(CustomerView view) {
        CustomerAJAXView result = new CustomerAJAXView();
        result.id = view.id;
        result.name = view.name;
        result.sex = view.sex;
        result.email = view.email;
        result.age = view.age;
        return result;
    }
}
