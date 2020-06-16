package app.customer.service;


import app.customer.api.BOCreateCustomerRequest;
import app.customer.api.CreateCustomerAJAXRequest;
import app.customer.api.SearchCustomerAJAXRequest;
import app.customer.api.SearchCustomerAJAXResponse;
import app.customer.api.UpdateCustomerAJAXRequest;
import app.customer.api.CustomerAJAXView;
import app.customer.api.BOCustomerWebService;
import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
import app.customer.api.CustomerView;
import core.framework.inject.Inject;
import java.util.stream.Collectors;

/**
 * @author simple
 */
public class CustomService {
    @Inject
    BOCustomerWebService customerWebService;

    public void create(CreateCustomerAJAXRequest request) {
        BOCreateCustomerRequest view = new BOCreateCustomerRequest();
        view.age = request.age;
        view.email = request.email;
        view.name = request.name;
        view.sex = BOCreateCustomerRequest.Sex.valueOf(request.sex.name());
        customerWebService.create(view);
    }

    public void update(String id, UpdateCustomerAJAXRequest request) {
        BOUpdateCustomerRequest view = new BOUpdateCustomerRequest();
        view.email = request.email;
        view.name = request.name;
        customerWebService.update(id, view);
    }

    public CustomerAJAXView get(String id) {
        return view(customerWebService.get(id));
    }

    public SearchCustomerAJAXResponse search(SearchCustomerAJAXRequest request) {
        BOSearchCustomerRequest view = new BOSearchCustomerRequest();
        view.name = request.name;
        BOSearchCustomerResponse result = customerWebService.search(view);
        SearchCustomerAJAXResponse response = new SearchCustomerAJAXResponse();
        response.customerViews = result.customerViews.stream().map(this::view).collect(Collectors.toList());
        return response;
    }

    public void delete(String id) {
        customerWebService.delete(id);
    }

    private CustomerAJAXView view(CustomerView customer) {
        CustomerAJAXView view = new CustomerAJAXView();
        view.id = customer.id;
        view.name = customer.name;
        view.age = customer.age;
        view.sex = CustomerAJAXView.Sex.valueOf(customer.sex.name());
        view.email = customer.email;
        return view;
    }
}
