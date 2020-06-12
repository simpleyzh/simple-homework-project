package app.bo.customer.service;


import app.api.BOCreateCustomerRequest;
import app.api.BOCustomerWebService;
import app.api.BOSearchCustomerRequest;
import app.api.BOSearchCustomerResponse;
import app.api.BOUpdateCustomerRequest;
import app.api.CustomerView;
import core.framework.inject.Inject;


/**
 * @author simple
 */
public class BOCustomService {
    @Inject
    BOCustomerWebService customerWebService;

    public CustomerView createCustomer(BOCreateCustomerRequest request) {
        return customerWebService.createCustomer(request);
    }

    public CustomerView updateCustomer(BOUpdateCustomerRequest request) {
        return customerWebService.updateCustomer(request);
    }

    public CustomerView getCustomer(String id) {
        return customerWebService.getCustomer(id);
    }

    public BOSearchCustomerResponse searchCustomer(BOSearchCustomerRequest request) {
        return customerWebService.searchCustomer(request);
    }

    public void deleteCustomer(String id) {
        customerWebService.deleteCustomer(id);
    }
}
