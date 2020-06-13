package app.customer.web;

import app.customer.api.CreateCustomerRequest;
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
    public CustomerView createCustomer(CreateCustomerRequest request) {
        return service.createCustomer(request);
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
    public CustomerView updateCustomer(UpdateCustomerRequest request) {
        return service.updateCustomer(request);
    }

    @Override
    public void deleteCustomer(String id) {
        service.deleteCustomer(id);
    }


}
