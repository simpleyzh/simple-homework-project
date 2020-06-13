package app.customersite.service;

import app.customer.api.CustomerView;
import app.customer.api.CustomerWebService;
import app.customer.api.SearchCustomerRequest;
import app.customer.api.SearchCustomerResponse;
import app.customer.api.UpdateCustomerRequest;
import app.customersite.api.CustomerAJAXView;
import app.customersite.api.SearchCustomerAJAXResponse;
import app.customersite.api.UpdateCustomerAJAXRequest;
import core.framework.inject.Inject;

public class CustomerSiteService {
    @Inject
    CustomerWebService customerWebService;

    public CustomerAJAXView getCustomer(String id) {
        CustomerView customer = customerWebService.getCustomer(id);
        return view(customer);
    }

    public SearchCustomerAJAXResponse searchCustomer(String name) {
        SearchCustomerRequest request = new SearchCustomerRequest();
        request.name = name;
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
