package app;

import app.customer.api.CustomerAJAXWebService;
import app.customer.service.CustomService;
import app.customer.web.CustomAJAXWebServiceImpl;
import app.customer.api.BOCustomerWebService;
import core.framework.module.Module;

/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        api().client(BOCustomerWebService.class, requiredProperty("app.customer.serviceURL"));
        bind(CustomService.class);
        api().service(CustomerAJAXWebService.class, bind(CustomAJAXWebServiceImpl.class));
    }
}
