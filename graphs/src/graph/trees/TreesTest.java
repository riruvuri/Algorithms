package graph.trees;

import graph.traversal.BFSTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreesTest {

    @Test
    public void sample_test_duplicate_edge() {
        Trees trees = new Trees();
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(0,2));
        edges.add(Arrays.asList(0,3));
        edges.add(Arrays.asList(1, 0));

        boolean isTree = trees.isGraphATree(4, edges);
        Assert.assertEquals(false, isTree);
    }

    @Test
    public void sample_test_cross_edge() {
        Trees trees = new Trees();
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0,3));
        edges.add(Arrays.asList(0,1));
        edges.add(Arrays.asList(1,2));
        edges.add(Arrays.asList(2,0));

        boolean isTree = trees.isGraphATree(4, edges);
        Assert.assertEquals(false, isTree);
    }
}
