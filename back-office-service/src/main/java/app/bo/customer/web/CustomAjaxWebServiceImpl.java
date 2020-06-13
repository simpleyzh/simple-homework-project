package app.bo.customer.web;



import app.customer.api.BOCreateCustomerRequest;
import app.customer.api.CustomerView;
import app.bo.customer.service.CustomService;
import app.bo.customer.api.CustomerAjaxWebService;
import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
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
