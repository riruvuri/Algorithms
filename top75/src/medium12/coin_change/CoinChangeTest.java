package medium12.coin_change;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTest {
    @Test
    public void simple_test() {
        CoinChange coinChange = new CoinChange();
        int result = coinChange.minCoins(new int[]{1,2,5}, 11);
        Assert.assertTrue(result == 3);


        result = coinChange.minCoins(new int[]{1,2,5}, 10);
        Assert.assertTrue(result == 2);

        result = coinChange.minCoins(new int[]{1,2,5}, 37);
        Assert.assertTrue(result == 8);
    }
}
