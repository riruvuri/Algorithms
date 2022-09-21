package graph.traversal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFSTraversalTest {

    @Test
    public void sample_test() {
        DFSTraversal dfsTraversal = new DFSTraversal();
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(0,2));
        edges.add(Arrays.asList(0,4));
        edges.add(Arrays.asList(2,3));

        List<Integer> result = dfsTraversal.dfsTraversal(6, edges);
    }
}
