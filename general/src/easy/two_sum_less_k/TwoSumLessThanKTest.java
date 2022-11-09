package easy.two_sum_less_k;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumLessThanKTest {
    @Test
    public void simple_test() {
        TwoSumLessThanK twoSumLessThanK = new TwoSumLessThanK();
        int result = twoSumLessThanK.twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8}, 60);
        Assert.assertTrue(result == 58);
    }

    @Test
    public void simple_test_alt() {
        TwoSumLessThanK twoSumLessThanK = new TwoSumLessThanK();
        int result = twoSumLessThanK.twoSumLessThanK(new int[]{10,20,30}, 15);
        Assert.assertTrue(result == -1);
    }

    @Test
    public void simple_test_alt1() {
        TwoSumLessThanK twoSumLessThanK = new TwoSumLessThanK();
        int result = twoSumLessThanK.twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8}, 25);
        Assert.assertTrue(result == 24);
    }
}
