import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(); }

    @Test
    public void canAddTwoNumbers() {
        assertEquals(5, calculator.addNumbers(2,3) );
    }

    @Test
    public void canSubtractTwoNumbers() {
        assertEquals(1, calculator.subtractTwoNumbers(3,2) );
    }

    @Test
    public void canMultiplyTwoNumbers() {
        assertEquals(4, calculator.multiply(2, 2) );
    }

    @Test
    public void canDivideTwoNumbers() {
        assertEquals(2, calculator.divide(10,5) );
    }
}
