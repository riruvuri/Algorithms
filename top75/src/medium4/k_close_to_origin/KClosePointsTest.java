package medium4.k_close_to_origin;

import org.junit.Assert;
import org.junit.Test;

public class KClosePointsTest {
    @Test
    public void simple_test() {
        int[][] input = new int[][]{{3,3}, {5,-1}, {-2, 4}};
        KClosestPoints kClosestPoints = new KClosestPoints();
        int[][] result = kClosestPoints.find(input, 2);
        Assert.assertArrayEquals(new int[][]{{3,3}, {-2,4}}, result);
    }

    @Test
    public void simple_test_alt() {
        int[][] input = new int[][]{{1,3}, {-2, 2}};
        KClosestPoints kClosestPoints = new KClosestPoints();
        int[][] result = kClosestPoints.find(input, 1);
        Assert.assertArrayEquals(new int[][]{{-2,2}}, result);
    }
}
