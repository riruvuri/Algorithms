package medium.distinct_islands;

import org.junit.Assert;
import org.junit.Test;

public class DistinctIslandsDFSTest {
    @Test
    public void simple_test() {
        int[][] grid = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        DistinctIslandsDFS distinctIslands = new DistinctIslandsDFS();
        int count = distinctIslands.numDistinctIslands(grid);
        Assert.assertTrue(count == 1);
    }

    @Test
    public void simple_test_alt() {
        int[][] grid = {{1,1,0,1,1},{1,0,0,0,0},{0,0,0,0,1},{1,1,0,1,1}};
        DistinctIslandsDFS distinctIslands = new DistinctIslandsDFS();
        int count = distinctIslands.numDistinctIslands(grid);
        Assert.assertTrue(count == 3);
    }
}
