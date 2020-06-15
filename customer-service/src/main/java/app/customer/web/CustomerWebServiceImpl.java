package app.customer.web;

import app.customer.api.CustomerView;
import app.customer.api.CustomerWebService;
import app.customer.api.SearchCustomerRequest;
import app.customer.api.SearchCustomerResponse;
import app.customer.api.UpdateCustomerRequest;
import app.customer.service.CustomerService;
import core.framework.inject.Inject;

/**
 * @author simple
 */
public class CustomerWebServiceImpl implements CustomerWebService {
    @Inject
    CustomerService service;

    @Override
    public void createCustomer(CustomerView request) {
        service.createCustomer(request);
    }

    @Override
    public CustomerView getCustomer(String id) {
        return service.getCustomer(id);
    }

    @Override
    public SearchCustomerResponse searchCustomer(SearchCustomerRequest request) {
        return service.searchCustomer(request);
    }

    @Override
    public void updateCustomer(String id, UpdateCustomerRequest request) {
        service.updateCustomer(id, request);
    }

    @Override
    public void deleteCustomer(String id) {
        service.deleteCustomer(id);
    }


}
