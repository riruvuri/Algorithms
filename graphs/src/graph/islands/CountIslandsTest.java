package graph.islands;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CountIslandsTest {

    @Test
    public void sample_test() {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(1, 1, 0, 0, 0)));
        input.add(new ArrayList<>(Arrays.asList(0, 1, 0, 0, 1)));
        input.add(new ArrayList<>(Arrays.asList(1, 0, 0, 1, 1)));
        input.add(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0)));
        input.add(new ArrayList<>(Arrays.asList(1, 0, 1, 0, 1)));

        CountIslands countIslands = new CountIslands();
        int noOfIslands = countIslands.count(input);

        Assert.assertEquals(5, noOfIslands);
    }
}
