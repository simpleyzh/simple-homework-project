package app.customer.web;

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
