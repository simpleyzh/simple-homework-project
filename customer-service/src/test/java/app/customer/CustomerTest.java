package app.customer;

import app.customer.service.CustomerService;
import core.framework.inject.Inject;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author simple
 */
public class CustomerTest {
    @Inject
    CustomerService service;

    @Test
    public void create() {
        Assertions.assertThat(service.get("b03937ca-471f-4d47-8786-653072dcb195").name).isEqualTo("");
    }
}
