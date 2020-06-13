package app.bo.customer.web;



import app.bo.customer.api.*;
import app.bo.customer.service.CustomService;
import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
import core.framework.inject.Inject;


/**
 * @author simple
 */
public class CustomAJAXWebServiceImpl implements CustomerAJAXWebService {
    @Inject
    CustomService service;
    
    @Override
    public CustomerAJAXView createCustomer(CustomerAJAXView request) {
        return service.createCustomer(request);
    }

    @Override
    public CustomerAJAXView getCustomer(String id) {
        return service.getCustomer(id);
    }

    @Override
    public BOSearchCustomerAJAXResponse searchCustomer(BOSearchCustomerAJAXRequest request) {
        return service.searchCustomer(request);
    }

    @Override
    public CustomerAJAXView updateCustomer(BOUpdateCustomerAJAXRequest request) {
        return service.updateCustomer(request);
    }

    @Override
    public void deleteCustomer(String id) {
        service.deleteCustomer(id);
    }
    
}
