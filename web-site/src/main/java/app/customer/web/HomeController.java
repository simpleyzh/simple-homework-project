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
    public Response get(Request request) {
        return Response.text("home.html");
    }
}
