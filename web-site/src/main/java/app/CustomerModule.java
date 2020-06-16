package app;

import app.customer.api.CustomerWebService;
import app.customer.api.CustomerAJAXWebService;
import app.customer.service.CustomerService;
import app.customer.web.CustomerAJAXWebServiceImpl;
import core.framework.module.Module;


/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
//        var controller = bind(CustomerCotroller.class);
//        http().route(GET, "/customer/:id", controller::get);
        api().client(CustomerWebService.class, requiredProperty("app.customer.serviceURL"));
        bind(CustomerService.class);
        api().service(CustomerAJAXWebService.class, bind(CustomerAJAXWebServiceImpl.class));
    }
}
