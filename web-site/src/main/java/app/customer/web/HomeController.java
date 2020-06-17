package app.customer.web;

import app.customer.api.CustomerWebService;
import app.customer.api.CustomerView;
import core.framework.inject.Inject;
import core.framework.json.JSON;
import core.framework.web.Request;
import core.framework.web.Response;

/**
 * @author simple
 */
public class HomeController {
    @Inject
    CustomerWebService service;

    public Response get(Request request) {
        return Response.text(JSON.toJSON(view(service.get(request.pathParam("id")))));
    }

    private CustomerView view(CustomerView view) {
        CustomerView result = new CustomerView();
        result.id = view.id;
        result.name = view.name;
        result.gender = CustomerView.Gender.valueOf(view.gender.name());
        result.email = view.email;
        result.age = view.age;
        return result;
    }
}
