package medium.maximum_swap;

import org.junit.Assert;
import org.junit.Test;

public class MaxSwapTest {

    @Test
    public void simple_test() {
        MaxSwap maxSwap = new MaxSwap();
        int result = maxSwap.maximumSwap(7926);

        Assert.assertTrue(result == 9726);
    }
}
