package slidingwindow.trapping_rain_water;

import org.junit.Test;

public class TrappingRainWaterTest {

    @Test
    public void test_simple() {
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        trappingRainWater.totalTrappedWater(input);
    }
}
