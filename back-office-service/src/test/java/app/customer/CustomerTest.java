package app.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author simple
 */
public class CustomerTest {
    @Test
    public void general() {
        List<String> list = Collections.singletonList("name");
        Assertions.assertThat(list.size()).isEqualTo(1);

        assertEquals(10, 2, "excepted 10,but 2!");
    }
}