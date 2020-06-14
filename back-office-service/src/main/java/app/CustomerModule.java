package app;

import app.customer.api.BOCustomerAJAXWebService;
import app.customer.service.CustomService;
import app.customer.web.BOCustomAJAXWebServiceImpl;
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
        api().service(BOCustomerAJAXWebService.class, bind(BOCustomAJAXWebServiceImpl.class));
    }
}
