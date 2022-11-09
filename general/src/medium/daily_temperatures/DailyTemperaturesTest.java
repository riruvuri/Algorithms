package medium.daily_temperatures;

import org.junit.Assert;
import org.junit.Test;

public class DailyTemperaturesTest {

    @Test
    public void simple_test() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] result = dailyTemperatures.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});

        Assert.assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, result);
    }

    @Test
    public void simple_test_alt() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] result = dailyTemperatures.dailyTemperatures(new int[]{30, 40, 50, 60});

        Assert.assertArrayEquals(new int[]{1,1,1,0}, result);
    }
}
