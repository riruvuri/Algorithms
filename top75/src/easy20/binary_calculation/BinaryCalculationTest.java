package easy20.binary_calculation;

import org.junit.Assert;
import org.junit.Test;

public class BinaryCalculationTest {
    @Test
    public void test_simple() {
        BinaryCalculation binaryCalculation = new BinaryCalculation();
        String result = binaryCalculation.addBinary("10", "11");

        Assert.assertEquals("101", result);
    }

    @Test
    public void test_simple_alt() {
        BinaryCalculation binaryCalculation = new BinaryCalculation();
        String result = binaryCalculation.addBinary("1010", "1011");

        Assert.assertEquals("10101", result);
    }
}
