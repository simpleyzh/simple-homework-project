package app.customersite.service;

import app.customer.api.CustomerView;
import app.customer.api.CustomerWebService;
import app.customer.api.SearchCustomerRequest;
import app.customer.api.SearchCustomerResponse;
import app.customer.api.UpdateCustomerRequest;
import app.customersite.api.CustomerAJAXView;
import app.customersite.api.SearchCustomerAJAXRequest;
import app.customersite.api.SearchCustomerAJAXResponse;
import app.customersite.api.UpdateCustomerAJAXRequest;
import core.framework.inject.Inject;

public class CustomerSiteService {
    @Inject
    CustomerWebService customerWebService;

    public void deleterCustomer(String id) {
        customerWebService.deleteCustomer(id);
    }

    public CustomerAJAXView createCustomer(CustomerAJAXView view) {
        CustomerView customer = new CustomerView();
        customer.id = view.id;
        customer.name = view.name;
        customer.age = view.age;
        customer.email = view.email;
        customer.sex = view.sex;
        return view(customerWebService.createCustomer(customer));
    }

    public CustomerAJAXView getCustomer(String id) {
        CustomerView customer = customerWebService.getCustomer(id);
        return view(customer);
    }

    public SearchCustomerAJAXResponse searchCustomer(SearchCustomerAJAXRequest req) {
        SearchCustomerRequest request = new SearchCustomerRequest();
        request.name = req.name;
        SearchCustomerResponse apiResponse = customerWebService.searchCustomer(request);
        SearchCustomerAJAXResponse response = new SearchCustomerAJAXResponse();
        for (CustomerView c : apiResponse.customerViews) {
            response.list.add(view(c));
        }
        return response;
    }

    public CustomerAJAXView updateCustomer(UpdateCustomerAJAXRequest request) {
        UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest();
        updateCustomerRequest.id = request.id;
        updateCustomerRequest.email = request.email;
        updateCustomerRequest.name = request.name;
        CustomerView customerView = customerWebService.updateCustomer(updateCustomerRequest);
        return view(customerView);
    }

    private CustomerAJAXView view(CustomerView customer) {
        CustomerAJAXView view = new CustomerAJAXView();
        view.id = customer.id;
        view.name = customer.name;
        view.age = customer.age;
        view.sex = customer.sex;
        view.email = customer.email;
        return view;
    }
}
