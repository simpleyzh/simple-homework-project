package app.customer.web;

import app.customer.api.BOCustomerWebService;
import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
import app.customer.api.CustomerView;
import app.customer.service.BOCustomerService;
import core.framework.inject.Inject;

/**
 * @author simple
 */
public class BOCustomerWebServiceImpl implements BOCustomerWebService {
    @Inject
    BOCustomerService service;

    @Override
    public void createCustomer(CustomerView request) {
        service.createCustomer(request);
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
    public void updateCustomer(String id, BOUpdateCustomerRequest request) {
        service.updateCustomer(id, request);
    }

    @Override
    public void deleteCustomer(String id) {
        service.deleteCustomer(id);
    }
}
