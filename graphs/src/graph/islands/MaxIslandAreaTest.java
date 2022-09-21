package graph.islands;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxIslandAreaTest {

    @Test
    public void sample_test() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1, 1, 0)));
        input.add(new ArrayList<>(Arrays.asList(1, 1, 0)));
        input.add(new ArrayList<>(Arrays.asList(0, 0, 1)));

        MaxIslandArea maxIslandArea = new MaxIslandArea();
        int maxArea = maxIslandArea.count(input);

        Assert.assertEquals(4, maxArea);
    }
}
