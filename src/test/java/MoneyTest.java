import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void testEquality(){

        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
