package app.customer.web;

import app.customer.api.CustomerView;
import app.customer.api.CustomerWebService;
import app.customersite.api.CustomerAJAXView;
import core.framework.inject.Inject;

/**
 * @Author simple
 */
public class CustomerCotroller {
    @Inject
    CustomerWebService service;

    public CustomerAJAXView create(CustomerAJAXView view) {
        CustomerView customer = service.createCustomer();
    }


    private CustomerAJAXView view(CustomerView view) {
        CustomerAJAXView result = new CustomerAJAXView();
        result.id = view.id;
        result.name = view.name;
        result.sex = view.sex;
        result.email = view.email;
        result.age = view.age;
        return result;
    }
}
