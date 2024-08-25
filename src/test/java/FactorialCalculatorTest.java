import org.example.FactorialCalculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @DataProvider(name = "Numbers")
    public Object[][] createPositiveNumbers() {
        return new Object[][] {
                {0, 1},
                {1, 1},
                {7, 5040},
                {13, 1932053505}
        };
    }

    @Test(dataProvider = "Numbers")
    public void testFactorialPositive(int n, long expected) {
        Assert.assertEquals(FactorialCalculator.factorial(n), expected, "Факториал для числа не совпадает с ожидаемым результатом.");
    }

    @DataProvider(name = "negativeNumbers")
    public Object[] createNegativeNumbers() {
        return new Object[] {-1, -10, -42};
    }

    @Test(dataProvider = "negativeNumbers", expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative(int n) {
        FactorialCalculator.factorial(n);
    }
}
