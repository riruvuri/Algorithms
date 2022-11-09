package hard.shortest_path_obstacle_elimination;

import org.junit.Assert;
import org.junit.Test;

public class ShortestPathTest {

    @Test
    public void simple_test() {
        int[][] grid = {{0,0,0},{1,1,0},{0,0,0},{0,1,1},{0,0,0}};
        ShortestPath shortestPath = new ShortestPath();
        int result = shortestPath.shortestPath(grid, 2);
        Assert.assertTrue(result == 6);
    }

    @Test
    public void simple_test_alt() {
        int[][] grid = {{0,1},{1,0}};
        ShortestPath shortestPath = new ShortestPath();
        int result = shortestPath.shortestPath(grid, 1);
        Assert.assertTrue(result == 2);
    }

    @Test
    public void simple_test_alt1() {
        int[][] grid = {{0,1,1},{1,1,1},{1,0,0}};
        ShortestPath shortestPath = new ShortestPath();
        int result = shortestPath.shortestPath(grid, 2);
        Assert.assertTrue(result == 4);
    }
}
