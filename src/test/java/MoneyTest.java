import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void testEquality(){

        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testMultiplication() {

        Money five = Money.franc(5);
        assertEquals( Money.franc(10), five.times(2));
        assertEquals( Money.franc(15), five.times(3));
    }
}
