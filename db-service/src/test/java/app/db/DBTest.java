package app.db;

import app.db.mongo.service.ProductionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * @author simple
 */
public class DBTest extends IntegrationTest {
    @Test
    void test() {
        ProductionService mock = Mockito.mock(ProductionService.class);
        Mockito.when(mock.ten()).thenReturn(9);
        Assertions.assertEquals(mock.ten(), 10);
    }
}
