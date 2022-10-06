package medium3.matrix_distances;

import org.junit.Assert;
import org.junit.Test;

public class DistanceToZeroTest {
    @Test
    public void simple_test() {
        int[][] input = {{0,0,0}, {0,1,0}, {0,0,0}};
        DistanceToZero distanceToZero = new DistanceToZero();
        int[][] result = distanceToZero.count(input);

        Assert.assertArrayEquals(input, result);
    }

    @Test
    public void simple_test_alt() {
        int[][] input = {{0,0,0}, {0,1,0}, {1,1,1}};
        DistanceToZero distanceToZero = new DistanceToZero();
        int[][] result = distanceToZero.count(input);

        Assert.assertArrayEquals(new int[][] {{0,0,0}, {0,1,0}, {1,2,1}}, result);
    }

}
