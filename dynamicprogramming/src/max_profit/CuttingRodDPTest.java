package max_profit;

import org.junit.Assert;
import org.junit.Test;

public class CuttingRodDPTest {
    @Test
    public void simple_test() {
        int[] profit = {0,2,5,7,8};
        CuttingRodDP cuttingRod = new CuttingRodDP();
        int result = cuttingRod.maxProfit(4, profit);

        Assert.assertTrue(result == 10);
    }
}
