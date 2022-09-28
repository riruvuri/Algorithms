package graph.connectedcomponents;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedComponentsTest {

    @Test
    public void sample_test_adv() {
        ConnectedComponentsBFS connectedComponentsBFS = new ConnectedComponentsBFS();
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(1,2));
        edges.add(Arrays.asList(0,2));
        edges.add(Arrays.asList(3, 4));

        Integer result = connectedComponentsBFS.findConnectedComponents(5, edges);
    }
}
