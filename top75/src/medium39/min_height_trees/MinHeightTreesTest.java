package medium39.min_height_trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MinHeightTreesTest {
    @Test
    public void simple_test() {
        MinHeightTrees minHeightTrees = new MinHeightTrees();
        List<Integer> resultList = minHeightTrees.findMinHeightTrees(4, new int[][]{{1,0},{1,2},{1,3}});

        Assert.assertTrue(resultList.get(0) == 1);
    }

    @Test
    public void simple_test_alt() {
        MinHeightTrees minHeightTrees = new MinHeightTrees();
        List<Integer> resultList = minHeightTrees.findMinHeightTrees(6, new int[][]{{3,0},{3,1},{3,2},{3,4},{5,4}});

        Assert.assertEquals(resultList, Arrays.asList(3,4));
    }
}
