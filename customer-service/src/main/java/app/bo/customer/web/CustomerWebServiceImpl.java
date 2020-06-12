package app.bo.customer.web;

import app.api.CreateCustomerRequest;
import app.api.CustomerView;
import app.api.CustomerWebService;
import app.api.SearchCustomerRequest;
import app.api.SearchCustomerResponse;
import app.api.UpdateCustomerRequest;
import app.bo.customer.service.CustomerService;
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
