package easy9.flood_fill;

import org.junit.Test;

public class FloodFillTest {

    @Test
    public void sample_test() {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        FloodFill floodFill = new FloodFill();
        int[][] result = floodFill.floodFill(image, 1, 1, 2);
    }
}
