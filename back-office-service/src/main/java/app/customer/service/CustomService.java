package app.customer.service;


import app.customer.api.SearchCustomerAJAXRequest;
import app.customer.api.SearchCustomerAJAXResponse;
import app.customer.api.UpdateCustomerAJAXRequest;
import app.customer.api.CustomerAJAXView;
import app.customer.api.BOCustomerWebService;
import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
import app.customer.api.CustomerSexAJAXView;
import app.customer.api.CustomerSexView;
import app.customer.api.CustomerView;
import core.framework.inject.Inject;

/**
 * @author simple
 */
public class CustomService {
    @Inject
    BOCustomerWebService customerWebService;

    public void createCustomer(CustomerAJAXView request) {
        CustomerView view = new CustomerView();
        view.id = request.id;
        view.age = request.age;
        view.email = request.email;
        view.name = request.name;
        view.customerSexView = CustomerSexView.valueOf(request.sex.name());
        customerWebService.createCustomer(view);
    }

    public void updateCustomer(String id, UpdateCustomerAJAXRequest request) {
        BOUpdateCustomerRequest view = new BOUpdateCustomerRequest();
        view.email = request.email;
        view.name = request.name;
        customerWebService.updateCustomer(id, view);
    }

    public CustomerAJAXView getCustomer(String id) {
        return view(customerWebService.getCustomer(id));
    }

    public SearchCustomerAJAXResponse searchCustomer(SearchCustomerAJAXRequest request) {
        BOSearchCustomerRequest view = new BOSearchCustomerRequest();
        view.name = request.name;
        BOSearchCustomerResponse result = customerWebService.searchCustomer(view);
        SearchCustomerAJAXResponse response = new SearchCustomerAJAXResponse();
        for (CustomerView c : result.customerViews) {
            response.customerViews.add(view(c));
        }
        return response;
    }

    public void deleteCustomer(String id) {
        customerWebService.deleteCustomer(id);
    }

    private CustomerAJAXView view(CustomerView customer) {
        CustomerAJAXView view = new CustomerAJAXView();
        view.id = customer.id;
        view.name = customer.name;
        view.age = customer.age;
        view.sex = CustomerSexAJAXView.valueOf(customer.customerSexView.name());
        view.email = customer.email;
        return view;
    }
}
