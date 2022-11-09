package medium.shortest_bridge;

import org.junit.Assert;
import org.junit.Test;

public class ShortestBridgeTest {

    @Test
    public void simple_test() {
        int[][] input = {{0,1},{1,0}};
        ShortestBridge shortestBridge = new ShortestBridge();
        int result = shortestBridge.shortestBridge(input);
        Assert.assertTrue(result == 1);
    }

    @Test
    public void simple_connected_component() {
        int[][] input = {{0,1,0},{0,0,0},{0,0,1}};
        ShortestBridge shortestBridge = new ShortestBridge();
        int result = shortestBridge.shortestBridge(input);
        Assert.assertTrue(result == 2);
    }

    @Test
    public void simple_connected_component_complex() {
        int[][] input = {{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}};
        ShortestBridge shortestBridge = new ShortestBridge();
        int result = shortestBridge.shortestBridge(input);
        Assert.assertTrue(result == 1);
    }
}
