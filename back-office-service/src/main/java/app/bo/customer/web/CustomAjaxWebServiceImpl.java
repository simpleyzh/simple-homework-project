package app.bo.customer.web;



import app.api.BOCreateCustomerRequest;
import app.api.CustomerView;
import app.bo.customer.service.CustomService;
import app.bo.customer.CustomerAjaxWebService;
import app.api.BOSearchCustomerRequest;
import app.api.BOSearchCustomerResponse;
import app.api.BOUpdateCustomerRequest;
import core.framework.inject.Inject;


/**
 * @author simple
 */
public class CustomAjaxWebServiceImpl implements CustomerAjaxWebService {
    @Inject
    CustomService service;
    
    @Override
    public CustomerView createCustomer(BOCreateCustomerRequest request) {
        return service.createCustomer(request);
    }

    @Override
    public CustomerView getCustomer(String id) {
        return service.getCustomer(id);
    }

    @Override
    public BOSearchCustomerResponse searchCustomer(BOSearchCustomerRequest request) {
        return service.searchCustomer(request);
    }

    @Override
    public CustomerView updateCustomer(BOUpdateCustomerRequest request) {
        return service.updateCustomer(request);
    }

    @Override
    public void deleteCustomer(String id) {
        service.deleteCustomer(id);
    }
    
}
