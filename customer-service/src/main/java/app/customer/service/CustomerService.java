package app.customer.service;

import app.customer.api.CustomerSexView;
import app.customer.api.CustomerView;
import app.customer.api.SearchCustomerRequest;
import app.customer.api.SearchCustomerResponse;
import app.customer.api.UpdateCustomerRequest;
import app.customer.domain.Customer;
import app.customer.domain.Sex;
import core.framework.db.Repository;
import core.framework.inject.Inject;
import core.framework.web.exception.ConflictException;
import core.framework.web.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author simple
 */
public class CustomerService {
    @Inject
    Repository<Customer> repository;

    public void createCustomer(CustomerView request) {
        Customer customer = new Customer();
        customer.id = UUID.randomUUID().toString();
        customer.name = request.name;
        customer.age = request.age;
        customer.email = request.email;
        customer.sex = Sex.valueOf(request.customerSexView.name());
        repository.insert(customer);
    }

    public void updateCustomer(String id, UpdateCustomerRequest request) {
        Customer customer = new Customer();
        customer.id = id;
        customer.name = request.name;
        customer.email = request.email;
        repository.partialUpdate(customer);
    }

    public CustomerView getCustomer(String id) {
        return view(get(id));
    }

    public SearchCustomerResponse searchCustomer(SearchCustomerRequest request) {
        List<Customer> list = repository.select("name = ?", request.name);

        SearchCustomerResponse searchCustomerResponse = new SearchCustomerResponse();

        searchCustomerResponse.customerViews = list.stream().map(this::view).collect(Collectors.toList());

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
        view.customerSexView = CustomerSexView.valueOf(customer.sex.name());
        view.email = customer.email;
        return view;
    }

    private Customer get(String id) {
        return repository.get(id).orElseThrow(() -> new NotFoundException("Id is not found. Id is" + id));
    }
}
