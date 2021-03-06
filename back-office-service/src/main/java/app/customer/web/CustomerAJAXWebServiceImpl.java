package app.customer.web;



import app.customer.api.CreateCustomerAJAXRequest;
import app.customer.api.CustomerView;
import app.customer.api.CustomerAJAXWebService;
import app.customer.api.SearchCustomerAJAXRequest;
import app.customer.api.SearchCustomerAJAXResponse;
import app.customer.api.UpdateCustomerAJAXRequest;
import app.customer.service.CustomService;
import core.framework.inject.Inject;
import core.framework.log.ActionLogContext;


/**
 * @author simple
 */
public class CustomerAJAXWebServiceImpl implements CustomerAJAXWebService {
    @Inject
    CustomService service;
    
    @Override
    public void create(CreateCustomerAJAXRequest request) {
        ActionLogContext.put("email", request.email);
        service.create(request);
    }

    @Override
    public CustomerView get(String id) {
        return service.get(id);
    }

    @Override
    public SearchCustomerAJAXResponse search(SearchCustomerAJAXRequest request) {
        return service.search(request);
    }

    @Override
    public void update(String id, UpdateCustomerAJAXRequest request) {
        ActionLogContext.put("customerId", id);
        service.update(id, request);
    }

    @Override
    public void delete(String id) {
        ActionLogContext.put("customerId", id);
        service.delete(id);
    }
}
