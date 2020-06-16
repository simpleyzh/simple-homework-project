package app.customer.service;

import app.customer.api.CreateCustomerRequest;
import app.customer.api.CustomerView;
import app.customer.api.SearchCustomerRequest;
import app.customer.api.SearchCustomerResponse;
import app.customer.api.UpdateCustomerRequest;
import app.customer.domain.Customer;
import core.framework.db.Repository;
import core.framework.inject.Inject;
import core.framework.util.Strings;
import core.framework.web.exception.NotFoundException;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author simple
 */
public class CustomerService {
    @Inject
    Repository<Customer> repository;

    public void create(CreateCustomerRequest request) {
        Customer customer = new Customer();
        customer.id = UUID.randomUUID().toString();
        customer.name = request.name;
        customer.age = request.age;
        customer.email = request.email;
        customer.sex = Customer.Sex.valueOf(request.sex.name());
        repository.insert(customer);
    }

    public void update(String id, UpdateCustomerRequest request) {
        Customer customer = new Customer();
        customer.id = id;
        customer.name = request.name;
        customer.email = request.email;
        repository.partialUpdate(customer);
    }

    public CustomerView get(String id) {
        return view(selectOne(id));
    }

    public SearchCustomerResponse search(SearchCustomerRequest request) {
        List<Customer> list = repository.select("name = ?", request.name);

        SearchCustomerResponse searchCustomerResponse = new SearchCustomerResponse();

        searchCustomerResponse.customerViews = list.stream().map(this::view).collect(Collectors.toList());

        return searchCustomerResponse;
    }


    public void delete(String id) {
        repository.delete(id);
    }

    private CustomerView view(Customer customer) {
        CustomerView view = new CustomerView();
        view.id = customer.id;
        view.name = customer.name;
        view.age = customer.age;
        view.sex = CustomerView.Sex.valueOf(customer.sex.name());
        view.email = customer.email;
        return view;
    }

    private Customer selectOne(String id) {
        return repository.get(id).orElseThrow(() -> new NotFoundException(Strings.format("Customer not found. CustomerId = {}", id), "ID_NOT_FOUND"));
    }
}
