package app;

import app.bo.customer.api.CustomerAjaxWebService;
import app.bo.customer.service.CustomService;
import app.bo.customer.web.CustomAjaxWebServiceImpl;
import app.customer.api.BOCustomerWebService;
import core.framework.module.Module;

/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        bind(CustomService.class);
//        bind(CustomAjaxWebServiceImpl.class);
        http().httpPort(8081);
        api().service(CustomerAjaxWebService.class, bean(CustomAjaxWebServiceImpl.class));
        api().client(BOCustomerWebService.class, requiredProperty("app.customer.serviceURL"));
    }
}
