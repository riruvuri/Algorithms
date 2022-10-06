package medium1.max_sub_array;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArrayTest {

    @Test
    public void simple_test() {
        MaxSubArray maxSubArray = new MaxSubArray();
        int result = maxSubArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        Assert.assertTrue(result == 6);
    }

    @Test
    public void simple_test_alt() {
        MaxSubArray maxSubArray = new MaxSubArray();
        int result = maxSubArray.maxSubArray(new int[]{5,4,-1,7,8});
        Assert.assertTrue(result == 23);
    }
}
