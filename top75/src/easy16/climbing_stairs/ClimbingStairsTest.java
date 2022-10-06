package easy16.climbing_stairs;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {
    @Test
    public void simple_test() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int totalWays = climbingStairs.findNoOfWays(5);

        Assert.assertTrue(totalWays == 8);
    }
}
