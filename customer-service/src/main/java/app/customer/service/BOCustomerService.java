package app.customer.service;

import app.customer.api.BOCreateCustomerRequest;
import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
import app.customer.api.CustomerView;
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
public class BOCustomerService {
    @Inject
    Repository<Customer> repository;

    public void create(BOCreateCustomerRequest request) {
        Customer customer = new Customer();
        customer.id = UUID.randomUUID().toString();
        customer.name = request.name;
        customer.age = request.age;
        customer.email = request.email;
        customer.gender = Customer.Gender.valueOf(request.gender.name());
        repository.insert(customer);
    }

    public void update(String id, BOUpdateCustomerRequest request) {
        Customer customer = new Customer();
        customer.id = id;
        customer.name = request.name;
        customer.email = request.email;
        repository.partialUpdate(customer);
    }

    public CustomerView get(String id) {
        Customer customer = selectOne(id);
        return view(customer);
    }

    public BOSearchCustomerResponse search(BOSearchCustomerRequest request) {
        List<Customer> list = repository.select("name = ?", request.name);
        BOSearchCustomerResponse searchCustomerResponse = new BOSearchCustomerResponse();
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
        view.gender = CustomerView.Gender.valueOf(customer.gender.name());
        view.email = customer.email;
        return view;
    }

    private Customer selectOne(String id) {
        return repository.get(id).orElseThrow(() -> new NotFoundException(Strings.format("customer not found. customerId={}", id), "CUSTOMER_NOT_FOUND"));
    }
}
