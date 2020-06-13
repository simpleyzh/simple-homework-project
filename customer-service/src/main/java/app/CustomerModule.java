package app;

import app.customer.api.CustomerWebService;
import app.customer.service.CustomerService;
import app.customer.domain.Customer;
import app.customer.web.CustomerWebServiceImpl;
import core.framework.module.Module;

/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Customer.class);
        bind(CustomerService.class);
        bind(CustomerWebServiceImpl.class);
        api().service(CustomerWebService.class, bean(CustomerWebServiceImpl.class));
    }
}
