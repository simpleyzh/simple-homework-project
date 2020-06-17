package app;

import app.customer.api.CustomerWebService;
import app.customer.api.CustomerAJAXWebService;
import app.customer.service.CustomerService;
import app.customer.web.CustomerAJAXWebServiceImpl;
import app.customer.web.HomeController;
import core.framework.module.Module;
import static core.framework.http.HTTPMethod.GET;


/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        HomeController controller = bind(HomeController.class);
        http().route(GET, "/customer/:id", controller::get);
        api().client(CustomerWebService.class, requiredProperty("app.customer.serviceURI"));
        bind(CustomerService.class);
        api().service(CustomerAJAXWebService.class, bind(CustomerAJAXWebServiceImpl.class));
    }
}
