package app.bo.customer.service;


import app.bo.customer.api.CustomerAJAXView;
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

    public CustomerAJAXView createCustomer(CustomerAJAXView request) {
        CustomerView view = new CustomerView();
        view.id = request.id;
        view.age = request.age;
        view.email = request.email;
        view.name = request.name;
        view.sex = request.sex;
        return view(customerWebService.createCustomer(view));
    }

    public CustomerAJAXView updateCustomer(BOUpdateCustomerRequest request) {
        return view(customerWebService.updateCustomer(request));
    }

    public CustomerAJAXView getCustomer(String id) {
        return view(customerWebService.getCustomer(id));
    }

    public BOSearchCustomerResponse searchCustomer(BOSearchCustomerRequest request) {
        return customerWebService.searchCustomer(request);
    }

    public void deleteCustomer(String id) {
        customerWebService.deleteCustomer(id);
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
