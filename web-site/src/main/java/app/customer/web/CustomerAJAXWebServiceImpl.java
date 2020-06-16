package app.customer.web;


import app.customer.api.CustomerAJAXView;
import app.customer.api.UpdateCustomerAJAXRequest;
import app.customer.api.CustomerAJAXWebService;
import app.customer.api.SearchCustomerAJAXRequest;
import app.customer.api.SearchCustomerAJAXResponse;
import app.customer.service.CustomerService;
import core.framework.inject.Inject;

public class CustomerAJAXWebServiceImpl implements CustomerAJAXWebService {
    @Inject
    CustomerService service;

    @Override
    public void createCustomer(CustomerAJAXView request) {
        service.createCustomer(request);
    }

    @Override
    public CustomerAJAXView getCustomer(String id) {
        return service.getCustomer(id);
    }

    @Override
    public SearchCustomerAJAXResponse searchCustomer(SearchCustomerAJAXRequest request) {
        return service.searchCustomer(request);
    }

    @Override
    public void updateCustomer(String id, UpdateCustomerAJAXRequest request) {
        service.updateCustomer(id, request);
    }

    @Override
    public void deleteCustomer(String id) {
        service.deleterCustomer(id);
    }
}
