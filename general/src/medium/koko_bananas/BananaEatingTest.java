package medium.koko_bananas;

import org.junit.Assert;
import org.junit.Test;

public class BananaEatingTest {
    @Test
    public void simple_test() {
        BananaEating bananaEating = new BananaEating();
        int result = bananaEating.minEatingSpeed(new int[]{3,6,7,11}, 8);

        Assert.assertTrue(result == 4);
    }

    @Test
    public void simple_test1() {
        BananaEating bananaEating = new BananaEating();
        int result = bananaEating.minEatingSpeed(new int[]{30,11,23,4,20}, 5);

        Assert.assertTrue(result == 30);
    }

    @Test
    public void simple_test2() {
        BananaEating bananaEating = new BananaEating();
        int result = bananaEating.minEatingSpeed(new int[]{30,11,23,4,20}, 6);

        Assert.assertTrue(result == 23);
    }
}
