package app.bo.customer.service;


import app.customer.api.BOCreateCustomerRequest;
import app.customer.api.BOCustomerWebService;
import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
import app.customer.api.CustomerView;
import core.framework.inject.Inject;


/**
 * @author simple
 */
public class CustomService {
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
