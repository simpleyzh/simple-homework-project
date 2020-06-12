package app.customer.web;



import app.api.BOCreateCustomerRequest;
import app.api.BOCustomerView;
import app.customer.CustomerAjaxWebService;
import app.api.BOSearchCustomerRequest;
import app.api.BOSearchCustomerResponse;
import app.api.BOUpdateCustomerRequest;
import app.customer.service.BOCustomService;
import core.framework.inject.Inject;


/**
 * @author simple
 */
public class CustomAjaxWebServiceImpl implements CustomerAjaxWebService {
    @Inject
    BOCustomService service;
    
    @Override
    public BOCustomerView createCustomer(BOCreateCustomerRequest request) {
        return service.createCustomer(request);
    }

    @Override
    public BOCustomerView getCustomer(String id) {
        return service.getCustomer(id);
    }

    @Override
    public BOSearchCustomerResponse searchCustomer(BOSearchCustomerRequest request) {
        return service.searchCustomer(request);
    }

    @Override
    public BOCustomerView updateCustomer(BOUpdateCustomerRequest request) {
        return service.updateCustomer(request);
    }

    @Override
    public void deleteCustomer(String id) {
        service.deleteCustomer(id);
    }
    
}
