package app.customer.web;

import app.customer.api.BOCreateCustomerRequest;
import app.customer.api.BOCustomerWebService;
import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
import app.customer.api.CustomerView;
import app.customer.service.BOCustomerService;
import core.framework.inject.Inject;
import core.framework.log.ActionLogContext;

/**
 * @author simple
 */
public class BOCustomerWebServiceImpl implements BOCustomerWebService {
    @Inject
    BOCustomerService service;

    @Override
    public void create(BOCreateCustomerRequest request) {
        service.create(request);
    }

    @Override
    public CustomerView get(String id) {
        return service.get(id);
    }


    @Override
    public BOSearchCustomerResponse search(BOSearchCustomerRequest request) {
        return service.search(request);
    }

    @Override
    public void update(String id, BOUpdateCustomerRequest request) {
        ActionLogContext.put("customerId", id);
        service.update(id, request);
    }

    @Override
    public void delete(String id) {
        ActionLogContext.put("customerId", id);
        service.delete(id);
    }
}
