package easy23.tree_depth;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MaxDepthTest {
    @Test
    public void test_simple() {
        BinaryTreeNode root = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{3,9,20,null,null,15,7});
        MaxDepth maxDepth = new MaxDepth();
        int result = maxDepth.findMaxDepth(root);

        Assert.assertTrue(result == 3);
    }
}
