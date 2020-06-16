package app.customer.service;

import app.customer.api.CreateCustomerAJAXRequest;
import app.customer.api.CreateCustomerRequest;
import app.customer.api.CustomerWebService;
import app.customer.api.SearchCustomerRequest;
import app.customer.api.SearchCustomerResponse;
import app.customer.api.UpdateCustomerRequest;
import app.customer.api.CustomerView;
import app.customer.api.SearchCustomerAJAXRequest;
import app.customer.api.SearchCustomerAJAXResponse;
import app.customer.api.UpdateCustomerAJAXRequest;
import core.framework.inject.Inject;

import java.util.stream.Collectors;

public class CustomerService {
    @Inject
    CustomerWebService customerWebService;

    public void delete(String id) {
        customerWebService.delete(id);
    }

    public void create(CreateCustomerAJAXRequest request) {
        CreateCustomerRequest customer = new CreateCustomerRequest();
        customer.name = request.name;
        customer.age = request.age;
        customer.email = request.email;
        customer.gender = CreateCustomerRequest.Gender.valueOf(request.gender.name());
        customerWebService.create(customer);
    }

    public CustomerView get(String id) {
        CustomerView customer = customerWebService.get(id);
        return view(customer);
    }

    public SearchCustomerAJAXResponse search(SearchCustomerAJAXRequest req) {
        SearchCustomerRequest request = new SearchCustomerRequest();
        request.name = req.name;
        SearchCustomerResponse apiResponse = customerWebService.search(request);
        SearchCustomerAJAXResponse response = new SearchCustomerAJAXResponse();
        response.list = apiResponse.customerViews.stream().map(this::view).collect(Collectors.toList());
        return response;
    }

    public void update(String id, UpdateCustomerAJAXRequest request) {
        UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest();
        updateCustomerRequest.email = request.email;
        updateCustomerRequest.name = request.name;
        customerWebService.update(id, updateCustomerRequest);
    }

    private CustomerView view(CustomerView customer) {
        CustomerView view = new CustomerView();
        view.id = customer.id;
        view.name = customer.name;
        view.age = customer.age;
        view.gender = CustomerView.Gender.valueOf(customer.gender.name());
        view.email = customer.email;
        return view;
    }
}
