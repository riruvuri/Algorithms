package easy4.buy_sell_stock;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyTest {

    @Test
    public void sample_test() {
        int[] input = {7,1,5,3,6,4};
        BestTimeToBuy bestTimeToBuy = new BestTimeToBuy();
        int profit = bestTimeToBuy.maxProfit(input);

        Assert.assertTrue(profit == 5);
    }
}
