package app;

import app.customer.api.CustomerWebService;
import app.customersite.api.CustomerAJAXWebService;
import app.customersite.service.CustomerSiteService;
import app.customersite.web.CustomerAJAXWebServiceImpl;
import core.framework.module.Module;


/**
 * @author simple
 */
public class CustomerSiteModule extends Module {
    @Override
    protected void initialize() {
//        var controller = bind(CustomerCotroller.class);
//        http().route(GET, "/customer/:id", controller::get);
        api().client(CustomerWebService.class, requiredProperty("app.customer.serviceURL"));
        bind(CustomerSiteService.class);
        api().service(CustomerAJAXWebService.class, bind(CustomerAJAXWebServiceImpl.class));
    }
}
