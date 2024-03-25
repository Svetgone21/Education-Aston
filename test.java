import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    
    @Test
    public void testCalculateFactorialWith5() {
        int number = 5;
        long expectedFactorial = 120;
        long actualFactorial = FactorialCalculator.calculateFactorial(number);
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void testCalculateFactorialWith0() {
        int number = 0;
        long expectedFactorial = 1;
        long actualFactorial = FactorialCalculator.calculateFactorial(number);
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void testCalculateFactorialWithNegativeNumber() {
        int number = -5;
        long expectedFactorial = 1; 
        long actualFactorial = FactorialCalculator.calculateFactorial(number);
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }
}