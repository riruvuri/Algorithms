package graph.transpose_graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class TransposeGraphTest {

    @Test
    public void sample_test() {
        GraphNode first = new GraphNode(1);
        GraphNode two = new GraphNode(2);
        GraphNode three = new GraphNode(3);

        first.neighbors.add(two);
        two.neighbors.add(three);
        three.neighbors.add(first);

        TransposeGraph transposeGraph = new TransposeGraph();
        GraphNode newFirst = transposeGraph.buildGraph(first);

        Assert.assertTrue(3 == newFirst.neighbors.get(0).value);
    }
}
