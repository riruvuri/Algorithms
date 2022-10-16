package nhard3.trapping_rain_water;

import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWaterTest {
    @Test
    public void simple_test() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        Assert.assertTrue(result == 6);
    }

    @Test
    public void simple_test_alt() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{4,2,0,3,2,5});
        Assert.assertTrue(result == 9);
    }
}
