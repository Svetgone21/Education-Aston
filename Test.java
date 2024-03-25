import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {
    
    @Test
    void testCalculateFactorialWith5() {
        int number = 5;
        long expectedFactorial = 120;
        long actualFactorial = FactorialCalculator.calculateFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    void testCalculateFactorialWith0() {
        int number = 0;
        long expectedFactorial = 1;
        long actualFactorial = FactorialCalculator.calculateFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    void testCalculateFactorialWithNegativeNumber() {
        int number = -5;
        long expectedFactorial = 1; 
        long actualFactorial = FactorialCalculator.calculateFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);
    }
}