package app.customer.web;



import app.customer.api.BOCustomerAJAXView;
import app.customer.api.BOCustomerAJAXWebService;
import app.customer.api.BOSearchCustomerAJAXRequest;
import app.customer.api.BOSearchCustomerAJAXResponse;
import app.customer.api.BOUpdateCustomerAJAXRequest;
import app.customer.service.CustomService;
import core.framework.inject.Inject;


/**
 * @author simple
 */
public class BOCustomAJAXWebServiceImpl implements BOCustomerAJAXWebService {
    @Inject
    CustomService service;
    
    @Override
    public BOCustomerAJAXView createCustomer(BOCustomerAJAXView request) {
        return service.createCustomer(request);
    }

    @Override
    public BOCustomerAJAXView getCustomer(String id) {
        return service.getCustomer(id);
    }

    @Override
    public BOSearchCustomerAJAXResponse searchCustomer(BOSearchCustomerAJAXRequest request) {
        return service.searchCustomer(request);
    }

    @Override
    public BOCustomerAJAXView updateCustomer(BOUpdateCustomerAJAXRequest request) {
        return service.updateCustomer(request);
    }

    @Override
    public void deleteCustomer(String id) {
        service.deleteCustomer(id);
    }
    
}
