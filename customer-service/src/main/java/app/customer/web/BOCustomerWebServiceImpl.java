package app.customer.web;

import app.api.BOCreateCustomerRequest;
import app.api.BOCustomerWebService;
import app.api.BOSearchCustomerRequest;
import app.api.BOSearchCustomerResponse;
import app.api.BOUpdateCustomerRequest;
import app.api.CreateCustomerRequest;
import app.api.CustomerView;
import app.api.CustomerWebService;
import app.api.SearchCustomerRequest;
import app.api.SearchCustomerResponse;
import app.api.UpdateCustomerRequest;
import app.customer.service.CustomerService;
import core.framework.inject.Inject;

/**
 * @author simple
 */
public class BOCustomerWebServiceImpl implements BOCustomerWebService {
    @Inject
    CustomerService service;


    @Override
    public CustomerView createCustomer(BOCreateCustomerRequest request) {
        return service.createCustomer(request);
    }

    @Override
    public CustomerView getCustomer(String id) {
        return service.getCustomer(id);
    }

    @Override
    public BOSearchCustomerResponse searchCustomer(BOSearchCustomerRequest request) {
        return service.searchCustomer(request);
    }

    @Override
    public CustomerView updateCustomer(BOUpdateCustomerRequest request) {
        return service.updateCustomer(request);
    }

    @Override
    public void deleteCustomer(String id) {
        service.deleteCustomer(id);
    }
}
