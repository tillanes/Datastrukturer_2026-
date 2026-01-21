import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void multiplyTest() {
        Calculator calc = new Calculator();

        assertEquals(15,calc.multiply(5,3));
        assertEquals(30,calc.multiply(5,3, 2));

    }
}