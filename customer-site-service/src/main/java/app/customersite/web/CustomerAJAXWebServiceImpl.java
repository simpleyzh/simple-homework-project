package app.customersite.web;

import app.customersite.api.CustomerAJAXView;
import app.customersite.api.CustomerAJAXWebService;
import app.customersite.api.SearchCustomerAJAXResponse;
import app.customersite.api.UpdateCustomerAJAXRequest;
import app.customersite.service.CustomerSiteService;
import core.framework.inject.Inject;

public class CustomerAJAXWebServiceImpl implements CustomerAJAXWebService {
    @Inject
    CustomerSiteService service;

    @Override
    public CustomerAJAXView getCustomer(String id) {
        return service.getCustomer(id);
    }

    @Override
    public SearchCustomerAJAXResponse searchCustomer(String name) {
        return service.searchCustomer(name);
    }

    @Override
    public CustomerAJAXView updateCustomer(UpdateCustomerAJAXRequest request) {
        return service.updateCustomer(request);
    }
}
