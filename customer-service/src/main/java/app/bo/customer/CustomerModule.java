package app.bo.customer;

import app.api.CustomerWebService;
import app.bo.customer.service.CustomerService;
import app.bo.customer.domain.Customer;
import app.bo.customer.web.CustomerWebServiceImpl;
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
