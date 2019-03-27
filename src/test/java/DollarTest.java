
import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {

    @Test
    public void testMultiopication() {

        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}
