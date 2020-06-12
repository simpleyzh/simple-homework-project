package app.bo.customer;

import app.api.BOCustomerWebService;
import app.bo.customer.service.CustomService;
import app.bo.customer.web.CustomAjaxWebServiceImpl;
import core.framework.module.Module;

/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        bind(CustomService.class);
        bind(CustomAjaxWebServiceImpl.class);
        http().httpPort(8081);
        api().service(CustomerAjaxWebService.class,bean(CustomAjaxWebServiceImpl.class));
//        api().client(BOCustomerWebService.class, requiredProperty("host"));
    }
}
