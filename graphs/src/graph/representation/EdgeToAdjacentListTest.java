package graph.representation;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EdgeToAdjacentListTest {

    @Test
    public void sample_test() {
        EdgeToAdjacentList edgeToAdjacentList = new EdgeToAdjacentList();
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(1,4));
        edges.add(Arrays.asList(1,2));
        edges.add(Arrays.asList(1,3));
        edges.add(Arrays.asList(3,4));

        List<List<Integer>> result = edgeToAdjacentList.convertEdgeToAdjacencylist(5, edges);
    }
}
