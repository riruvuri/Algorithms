package hard.basic_calculator_3;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorTest {
    @Test
    public void simple_test() {
        BasicCalculator basicCalculator = new BasicCalculator();
        int result = basicCalculator.calculate("1+1");
        Assert.assertTrue(result == 2);
    }

    @Test
    public void simple_test_alt() {
        BasicCalculator basicCalculator = new BasicCalculator();
        int result = basicCalculator.calculate("6-4/2");
        Assert.assertTrue(result == 4);
    }

    @Test
    public void simple_test_alt1() {
        BasicCalculator basicCalculator = new BasicCalculator();
        int result = basicCalculator.calculate("2*(5+5*2)/3+(6/2+8)");
        Assert.assertTrue(result == 21);
    }
}
