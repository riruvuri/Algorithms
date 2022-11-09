package medium.maximum_ones;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void simple_test() {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int result = maxConsecutiveOnes.longestOnes(nums, 2);

        Assert.assertTrue(result == 6);
    }

    @Test
    public void simple_test_alt() {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int result = maxConsecutiveOnes.longestOnes(nums, 3);

        Assert.assertTrue(result == 10);
    }
}
