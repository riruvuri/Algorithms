package medium6.three_sum;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumTest {
    @Test
    public void simple_test() {
        int[] input = {-1,0,1,2,-1,-4};
        ThreeSum threeSum = new ThreeSum();
        int[][] result = threeSum.calculateSum(input);

        int[][] expected = {{-1,-1,2},{-1,0,1}};
        Assert.assertArrayEquals(expected, result);
    }
}
