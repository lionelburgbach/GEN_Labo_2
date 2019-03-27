
import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {

    @Test
    public void testMultiopication() {

        Dollar five = new Dollar(5);
        Dollar product= five.times(2);
        assertEquals( new Dollar(10), product);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality(){

        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
