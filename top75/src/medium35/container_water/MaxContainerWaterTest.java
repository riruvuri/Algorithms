package medium35.container_water;

import org.junit.Assert;
import org.junit.Test;

public class MaxContainerWaterTest {
    @Test
    public void simple_test() {
        MaxContainerWater maxContainerWater = new MaxContainerWater();
        int result = maxContainerWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7});

        Assert.assertTrue(result==49);
    }
}
