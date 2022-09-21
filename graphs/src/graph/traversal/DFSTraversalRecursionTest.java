package graph.traversal;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFSTraversalRecursionTest {

    @Test
    public void sample_test() {
        DFSTraversalRecursion dfsTraversalRecursion = new DFSTraversalRecursion();
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(0,2));
        edges.add(Arrays.asList(1,4));
        edges.add(Arrays.asList(3,5));

        List<Integer> result = dfsTraversalRecursion.dfsTraversal(6, edges);
        Assert.assertEquals(Arrays.asList(0, 1, 4, 2, 3, 5), result);
    }
}
