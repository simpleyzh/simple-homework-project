package app.customer.web;



import app.customer.api.CustomerAJAXView;
import app.customer.api.CustomerAJAXWebService;
import app.customer.api.SearchCustomerAJAXRequest;
import app.customer.api.SearchCustomerAJAXResponse;
import app.customer.api.UpdateCustomerAJAXRequest;
import app.customer.service.CustomService;
import core.framework.inject.Inject;


/**
 * @author simple
 */
public class CustomAJAXWebServiceImpl implements CustomerAJAXWebService {
    @Inject
    CustomService service;
    
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
        service.deleteCustomer(id);
    }
    
}
