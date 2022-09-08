package calculatepower;

import org.junit.Assert;
import org.junit.Test;

public class CalculatePowerTest {

    @Test
    public void sample_test() {
        CalculatePower calculatePower = new CalculatePower();
        int result = calculatePower.calculate_power(1000000000000000L, 1000000000000000L);

        Assert.assertEquals(698613978, result);
    }

    @Test
    public void sample_basic() {
        CalculatePowerBasic calculatePower = new CalculatePowerBasic();
        long result = calculatePower.calculatePower(2, 3);
        Assert.assertEquals(8, result);
    }
}
