package easy1.two_sum;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void sample_test() {
        int[] input = {2,7,11,15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.findTarget(input, target);

        Assert.assertArrayEquals(new int[]{0,1}, result);
    }

    @Test
    public void sample_test1() {
        int[] input = {3,2,4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.findTarget(input, target);

        Assert.assertArrayEquals(new int[]{1,2}, result);
    }
}
