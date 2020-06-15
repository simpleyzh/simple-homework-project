package app.customersite.web;


import app.customersite.api.CustomerAJAXView;
import app.customersite.api.UpdateCustomerAJAXRequest;
import app.customersite.api.CustomerAJAXWebService;
import app.customersite.api.SearchCustomerAJAXRequest;
import app.customersite.api.SearchCustomerAJAXResponse;
import app.customersite.service.CustomerSiteService;
import core.framework.inject.Inject;

public class CustomerAJAXWebServiceImpl implements CustomerAJAXWebService {
    @Inject
    CustomerSiteService service;

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
