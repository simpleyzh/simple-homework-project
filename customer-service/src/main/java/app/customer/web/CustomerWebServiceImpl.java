package app.customer.web;

import app.customer.api.CreateCustomerRequest;
import app.customer.api.CustomerView;
import app.customer.api.CustomerWebService;
import app.customer.api.SearchCustomerRequest;
import app.customer.api.SearchCustomerResponse;
import app.customer.api.UpdateCustomerRequest;
import app.customer.service.CustomerService;
import core.framework.inject.Inject;
import core.framework.log.ActionLogContext;

/**
 * @author simple
 */
public class CustomerWebServiceImpl implements CustomerWebService {
    @Inject
    CustomerService service;

    @Override
    public void create(CreateCustomerRequest request) {
        ActionLogContext.put("customerEmail",request.email);
        service.create(request);
    }

    @Override
    public CustomerView get(String id) {
        return service.get(id);
    }

    @Override
    public SearchCustomerResponse search(SearchCustomerRequest request) {
        return service.search(request);
    }

    @Override
    public void update(String id, UpdateCustomerRequest request) {
        ActionLogContext.put("customerId", id);
        service.update(id, request);
    }

    @Override
    public void delete(String id) {
        ActionLogContext.put("customerId", id);
        service.delete(id);
    }


}
