package app.customer.service;


import app.api.BOCreateCustomerRequest;
import app.api.BOCustomerView;
import app.api.BOSearchCustomerRequest;
import app.api.BOSearchCustomerResponse;
import app.api.BOUpdateCustomerRequest;
import app.api.CustomerView;
import app.api.CustomerWebService;
import core.framework.inject.Inject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author simple
 */
public class BOCustomService {
    @Inject
    CustomerWebService customerWebService;

    public CustomerView createCustomer(BOCreateCustomerRequest request) {
        customerWebService.createCustomer(request);
        return view(result);
    }

    public BOCustomerView updateCustomer(BOUpdateCustomerRequest request) {
        BOCustomer BOCustomer = new BOCustomer();
        BOCustomer.id = request.id;
        BOCustomer.name = request.name;
        BOCustomer.email = request.email;
        repository.partialUpdate(BOCustomer);
        return view(repository.get(BOCustomer.id).get());
    }

    public BOCustomerView getCustomer(String id) {
        return view(repository.get(id).get());
    }

    public BOSearchCustomerResponse searchCustomer(BOSearchCustomerRequest request) {
        List<BOCustomer> list = repository.select("name = ?", request.name);
        BOSearchCustomerResponse searchCustomerResponse = new BOSearchCustomerResponse();
        List<BOCustomerView> list1 = new ArrayList<>(10);
        for (BOCustomer c : list) {
            BOCustomerView view = view(c);
            list1.add(view);
        }
        searchCustomerResponse.customerViews = list1;
        return searchCustomerResponse;
    }

    public void deleteCustomer(String id) {
        repository.delete(id);
    }

    private BOCustomerView view(Customer BOCustomer) {
        BOCustomerView view = new BOCustomerView();
        view.id = BOCustomer.id;
        view.name = BOCustomer.name;
        view.age = BOCustomer.age;
        view.sex = BOCustomer.sex;
        view.email = BOCustomer.email;
        return view;
    }
}
