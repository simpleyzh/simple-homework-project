package app.customer;

import app.api.CustomerWebService;
import app.customer.domain.Customer;
import app.customer.service.CustomerService;
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
