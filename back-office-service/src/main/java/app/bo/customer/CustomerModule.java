package app.bo.customer;

import app.bo.customer.service.BOCustomService;
import app.bo.customer.web.CustomAjaxWebServiceImpl;
import core.framework.module.Module;

/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        bind(BOCustomService.class);
        bind(CustomAjaxWebServiceImpl.class);

        http().httpPort(8080);
        api().service(CustomerAjaxWebService.class,bean(CustomAjaxWebServiceImpl.class));
    }
}
