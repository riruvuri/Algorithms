package medium42.kth_smallest_bst;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class KthSmallestBSTTest {

    @Test
    public void simple_test() {
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode root = bstHelper.createLevelOrderBinaryTree(new Integer[]{3,1,4,null,2});

        KthSmallestBST kthSmallestBST = new KthSmallestBST();
        int result = kthSmallestBST.findKthSmallest(root, 1);

        Assert.assertTrue(result == 1);
    }

    @Test
    public void simple_test_iterative() {
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode root = bstHelper.createLevelOrderBinaryTree(new Integer[]{3,1,4,null,2});

        KthSmallestBSTIterative kthSmallestBST = new KthSmallestBSTIterative();
        int result = kthSmallestBST.findKthSmallest(root, 4);

        Assert.assertTrue(result == 4);
    }
}
