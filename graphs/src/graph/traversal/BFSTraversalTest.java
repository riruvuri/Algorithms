package graph.traversal;

import graph.representation.EdgeToAdjacentList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BFSTraversalTest {

    @Test
    public void sample_test() {
        BFSTraversal bfsTraversal = new BFSTraversal();
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(0,2));
        edges.add(Arrays.asList(0,4));
        edges.add(Arrays.asList(2,3));

        List<Integer> result = bfsTraversal.bfsTraversal(6, edges);
    }

    @Test
    public void sample_test_adv() {
        BFSTraversal bfsTraversal = new BFSTraversal();
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(1,2));
        edges.add(Arrays.asList(0,2));
        edges.add(Arrays.asList(3, 4));

        List<Integer> result = bfsTraversal.bfsTraversal(5, edges);
    }
}
