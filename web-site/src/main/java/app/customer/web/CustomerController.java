package app.customer.web;

import app.customer.api.CustomerView;
import app.customer.api.CustomerWebService;
import app.customer.api.CustomerAJAXView;
import core.framework.inject.Inject;
import core.framework.json.JSON;
import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author simple
 */
public class CustomerController {
    @Inject
    CustomerWebService service;

    public Response get(Request request) {
        return Response.text(JSON.toJSON(view(service.get(request.pathParam("id")))));
    }

    private CustomerAJAXView view(CustomerView view) {
        CustomerAJAXView result = new CustomerAJAXView();
        result.id = view.id;
        result.name = view.name;
        result.sex = CustomerAJAXView.Sex.valueOf(view.sex.name());
        result.email = view.email;
        result.age = view.age;
        return result;
    }
}
