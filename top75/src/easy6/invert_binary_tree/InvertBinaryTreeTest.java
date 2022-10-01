package easy6.invert_binary_tree;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class InvertBinaryTreeTest {

    @Test
    public void simple_test() {
        BinaryTreeNode root = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{4,2,7,1,3,6,9});

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        BinaryTreeNode result = invertBinaryTree.invertTree(root);
        Assert.assertTrue(result.left.value == root.right.value);
    }
}
