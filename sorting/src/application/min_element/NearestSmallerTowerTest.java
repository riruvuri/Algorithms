package application.min_element;

import org.junit.Assert;
import org.junit.Test;

public class NearestSmallerTowerTest {

    @Test
    public void sample_test() {
        NearestSmallerTower nearestSmallerTower = new NearestSmallerTower();
        int[] output = nearestSmallerTower.nearestSmallerTower(new int[] {4,8,6,5,3});
        Assert.assertArrayEquals(new int[]{4,0,3,4,-1}, output);
    }
}
