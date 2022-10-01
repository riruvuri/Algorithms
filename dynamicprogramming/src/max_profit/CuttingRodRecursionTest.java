package max_profit;

import org.junit.Assert;
import org.junit.Test;

public class CuttingRodRecursionTest {
    @Test
    public void simple_test() {
        int[] profit = {0,2,5,7,8};
        CuttingRodRecursion cuttingRod = new CuttingRodRecursion();
        int result = cuttingRod.maxProfit(4, profit);

        Assert.assertTrue(result == 10);
    }
}
