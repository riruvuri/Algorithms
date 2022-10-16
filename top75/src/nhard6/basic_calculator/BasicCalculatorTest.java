package nhard6.basic_calculator;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorTest {

    @Test
    public void simple_test() {
        BasicCalculator basicCalculator = new BasicCalculator();
        int result = basicCalculator.calculate("(1+(4+5+2)-3)+(6+8)");

        Assert.assertTrue(result == 23);
    }
}
