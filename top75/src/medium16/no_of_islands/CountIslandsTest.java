package medium16.no_of_islands;
import org.junit.Assert;
import org.junit.Test;

public class CountIslandsTest {

    @Test
    public void simple_test() {
        char[][] grid = {{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};

        CountIslands countIslands = new CountIslands();
        int result = countIslands.countIslands(grid);
        Assert.assertTrue(result == 3);
    }
}
