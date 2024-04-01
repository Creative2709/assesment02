package WorldlineAssesment.testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    
    Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(3, calculator.subtract(5, 2));
        assertEquals(-4, calculator.subtract(0, 4));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(10, calculator.multiply(2, 5));
        assertEquals(-12, calculator.multiply(3, -4));
    }
}
