package medium8.clone_graph;

import binarysearchtrees.algorithm.TreeNode;
import org.junit.Test;

import java.util.Arrays;

public class CloneGraphTest {
    @Test
    public void simple_test() {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);

        root.children.addAll(Arrays.asList(two, four));
        two.children.addAll(Arrays.asList(root, three));
        three.children.addAll(Arrays.asList(two, four));
        four.children.addAll(Arrays.asList(root, three));


        CloneGraph cloneGraph = new CloneGraph();
        TreeNode result = cloneGraph.clone(root);

    }
}
