package app;

import app.customer.api.BOCustomerWebService;
import app.customer.api.CustomerWebService;
import app.service.CustomerService;
import app.customer.domain.Customer;
import app.web.BOCustomerWebServiceImpl;
import app.web.CustomerWebServiceImpl;
import core.framework.module.Module;

/**
 * @author simple
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        db().repository(Customer.class);
        bind(CustomerService.class);
        api().service(CustomerWebService.class, bean(CustomerWebServiceImpl.class));
        api().service(BOCustomerWebService.class, bean(BOCustomerWebServiceImpl.class));
    }
}
