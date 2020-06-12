package app.customer.service;

import app.api.CreateCustomerRequest;
import app.api.CustomerView;
import app.api.SearchCustomerRequest;
import app.api.SearchCustomerResponse;
import app.api.UpdateCustomerRequest;
import app.customer.domain.Customer;
import core.framework.db.Repository;
import core.framework.inject.Inject;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author simple
 */
public class CustomerService {
    @Inject
    Repository<Customer> repository;

    public CustomerView createCustomer(CreateCustomerRequest request) {
        Customer customer = new Customer();
        customer.id = UUID.randomUUID().toString();
        customer.name = request.name;
        customer.age = request.age;
        customer.email = request.email;
        customer.sex = request.sex;
        repository.insert(customer);
        return view(repository.get(customer.id).get());
    }

    public CustomerView updateCustomer(UpdateCustomerRequest request) {
        Customer customer = new Customer();
        customer.id = request.id;
        customer.name = request.name;
        customer.email = request.email;
        repository.partialUpdate(customer);
        return view(repository.get(customer.id).get());
    }

    public CustomerView getCustomer(String id) {
        return view(repository.get(id).get());
    }

    public SearchCustomerResponse searchCustomer(SearchCustomerRequest request) {
        List<Customer> list = repository.select("name = ?", request.name);
        SearchCustomerResponse searchCustomerResponse = new SearchCustomerResponse();
        List<CustomerView> list1 = new ArrayList<>(10);
        for (Customer c : list) {
            CustomerView view = view(c);
            list1.add(view);
        }
        searchCustomerResponse.customerViews = list1;
        return searchCustomerResponse;

    }

    public void deleteCustomer(String id) {
        repository.delete(id);
    }

    private CustomerView view(Customer customer) {
        CustomerView view = new CustomerView();
        view.id = customer.id;
        view.name = customer.name;
        view.age = customer.age;
        view.sex = customer.sex;
        view.email = customer.email;
        return view;
    }
}
