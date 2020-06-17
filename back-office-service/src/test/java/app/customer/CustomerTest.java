package app.customer;

import app.customer.api.CustomerWebService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author simple
 */
public class CustomerTest {
    @Test
    public void createTest() {
        CustomerWebService mock = Mockito.mock(CustomerWebService.class);
    }
}