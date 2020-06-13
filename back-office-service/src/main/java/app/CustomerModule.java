package app;

import app.bo.customer.api.CustomerAJAXWebService;
import app.bo.customer.service.CustomService;
import app.bo.customer.web.CustomAJAXWebServiceImpl;
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
        api().service(CustomerAJAXWebService.class, bean(CustomAJAXWebServiceImpl.class));
    }
}
