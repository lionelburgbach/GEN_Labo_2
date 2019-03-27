import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void testEquality(){

        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testDollarMultiplication() {

        Money five = Money.dollar(5);
        assertEquals( Money.dollar(10), five.times(2));
        assertEquals( Money.dollar(15), five.times(3));
    }

    @Test
    public void testSimpleAddition() {

        Money sum = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Money.dollar(10), sum);
    }
}
