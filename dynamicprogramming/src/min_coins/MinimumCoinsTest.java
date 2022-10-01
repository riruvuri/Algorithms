package min_coins;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumCoinsTest {

    @Test
    public void sample_test() {
        MinimumCoins mc = new MinimumCoins();
        ArrayList<Integer> coinsList = new ArrayList<>();
        coinsList.addAll(Arrays.asList(1,5,7));

        int result = mc.findMinCoins(coinsList, 10);
        Assert.assertTrue(result == 2);
    }
}
