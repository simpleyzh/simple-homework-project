package app.customer;

import app.customer.domain.Customer;
import app.customer.service.CustomerService;
import core.framework.db.Repository;
import core.framework.inject.Inject;
import core.framework.util.Strings;
import core.framework.web.exception.NotFoundException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author simple
 */
public class CustomerTest extends IntegrationTest {
    private final Logger logger = LoggerFactory.getLogger(CustomerTest.class);
    @Inject
    Repository<Customer> repository;
    @Inject
    CustomerService service;

    @Test
    public void dbEmpty() {
        Assertions.assertThat(repository.select().count()).isEqualTo(0);
    }

    @Test
    public void service() {
        String id = "000";
        try {
            Assertions.assertThat(service.get(id));
        } catch (NotFoundException e) {
            logger.warn(Strings.format("customerId is not found.customerID={}", id), "CUSTOMER_ID_NOT_FOUND");
        }
    }
}
