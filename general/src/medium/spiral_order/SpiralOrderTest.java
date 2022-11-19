package medium.spiral_order;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralOrderTest {
    @Test
    public void simple_test() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        SpriralOrder spriralOrder = new SpriralOrder();
        List<Integer> result = spriralOrder.spiralOrder(matrix);
        Assert.assertTrue(result.equals(Arrays.asList(1,2,3,6,9,8,7,4,5)));
    }

    @Test
    public void simple_test_alt() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        SpriralOrder spriralOrder = new SpriralOrder();
        List<Integer> result = spriralOrder.spiralOrder(matrix);
        Assert.assertTrue(result.equals(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7)));
    }
}
