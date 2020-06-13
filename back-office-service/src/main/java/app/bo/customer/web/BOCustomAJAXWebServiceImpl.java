package app.bo.customer.web;



import app.bo.customer.api.BOCustomerAJAXView;
import app.bo.customer.api.BOCustomerAJAXWebService;
import app.bo.customer.api.BOSearchCustomerAJAXRequest;
import app.bo.customer.api.BOSearchCustomerAJAXResponse;
import app.bo.customer.api.BOUpdateCustomerAJAXRequest;
import app.bo.customer.service.CustomService;
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
