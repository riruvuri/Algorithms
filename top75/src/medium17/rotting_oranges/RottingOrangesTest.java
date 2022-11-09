package medium17.rotting_oranges;

import org.junit.Assert;
import org.junit.Test;

public class RottingOrangesTest {
    @Test
    public void test_simple() {
        int[][] basket = {{2,1,1},{1,1,0},{0,1,1}};
        RottingOranges rottingOranges = new RottingOranges();
        int result = rottingOranges.orangesRotting(basket);
        Assert.assertTrue(result == 4);
    }

    @Test
    public void test_simple_alt() {
        int[][] basket = {{0,2}};
        RottingOranges rottingOranges = new RottingOranges();
        int result = rottingOranges.orangesRotting(basket);
        Assert.assertTrue(result == 0);
    }
}
