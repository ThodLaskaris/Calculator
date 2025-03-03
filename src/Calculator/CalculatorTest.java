package Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.calculate(2, 3, '+'));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.calculate(3, 2, '-'));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.calculate(2, 3, '*'));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.calculate(6, 3, '/'));
    }

    @Test
    public void testDivideByZero() {
        assertTrue(Double.isNaN(Calculator.calculate(1, 0, '/')));
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculate(2, 3, '%');
        });
    }
}
