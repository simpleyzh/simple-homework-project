package app.customer.service;

import app.customer.api.BOSearchCustomerRequest;
import app.customer.api.BOSearchCustomerResponse;
import app.customer.api.BOUpdateCustomerRequest;
import app.customer.api.CustomerSexView;
import app.customer.api.CustomerView;
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

/**
 * @author simple
 */
public class BOCustomerService {
    @Inject
    Repository<Customer> repository;

    public void createCustomer(CustomerView request) {
        if (repository.selectOne("id = ?", request.id).isPresent()) {
            throw new ConflictException("customer id is exist,id = " + request.id);
        } else {
            Customer customer = new Customer();
            customer.id = UUID.randomUUID().toString();
            customer.name = request.name;
            customer.age = request.age;
            customer.email = request.email;
            customer.sex = Sex.valueOf(request.customerSexView.name());
            repository.insert(customer);
        }
    }

    public void updateCustomer(String id, BOUpdateCustomerRequest request) {
        Customer customer = new Customer();
        customer.id = id;
        customer.name = request.name;
        customer.email = request.email;
        repository.partialUpdate(customer);
    }

    public CustomerView getCustomer(String id) {
        return view(get(id));
    }

    public BOSearchCustomerResponse searchCustomer(BOSearchCustomerRequest request) {
        List<Customer> list = repository.select("name = ?", request.name);
        BOSearchCustomerResponse searchCustomerResponse = new BOSearchCustomerResponse();
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
        view.customerSexView = CustomerSexView.valueOf(customer.sex.name());
        view.email = customer.email;
        return view;
    }

    private Customer get(String id) {
        Optional<Customer> customer = repository.get(id);
        customer.orElseThrow(() -> new NotFoundException("Id is not found. Id is" + id));
        return customer.get();
    }
}
