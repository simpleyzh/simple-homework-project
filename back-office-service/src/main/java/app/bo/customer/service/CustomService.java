package app.bo.customer.service;


import app.bo.customer.api.BOSearchCustomerAJAXRequest;
import app.bo.customer.api.BOSearchCustomerAJAXResponse;
import app.bo.customer.api.BOUpdateCustomerAJAXRequest;
import app.bo.customer.api.BOCustomerAJAXView;
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

    public BOCustomerAJAXView createCustomer(BOCustomerAJAXView request) {
        CustomerView view = new CustomerView();
        view.id = request.id;
        view.age = request.age;
        view.email = request.email;
        view.name = request.name;
        view.sex = request.sex;
        return view(customerWebService.createCustomer(view));
    }

    public BOCustomerAJAXView updateCustomer(BOUpdateCustomerAJAXRequest request) {
        BOUpdateCustomerRequest view = new BOUpdateCustomerRequest();
        view.id = request.id;
        view.email = request.email;
        view.name = request.name;
        return view(customerWebService.updateCustomer(view));
    }

    public BOCustomerAJAXView getCustomer(String id) {
        return view(customerWebService.getCustomer(id));
    }

    public BOSearchCustomerAJAXResponse searchCustomer(BOSearchCustomerAJAXRequest request) {
        BOSearchCustomerRequest view = new BOSearchCustomerRequest();
        view.name = request.name;
        BOSearchCustomerResponse result = customerWebService.searchCustomer(view);
        BOSearchCustomerAJAXResponse response = new BOSearchCustomerAJAXResponse();
        for (CustomerView c : result.customerViews) {
            response.customerViews.add(view(c));
        }
        return response;
    }

    public void deleteCustomer(String id) {
        customerWebService.deleteCustomer(id);
    }

    private BOCustomerAJAXView view(CustomerView customer) {
        BOCustomerAJAXView view = new BOCustomerAJAXView();
        view.id = customer.id;
        view.name = customer.name;
        view.age = customer.age;
        view.sex = customer.sex;
        view.email = customer.email;
        return view;
    }
}
