package easy11.balanced_tree;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import easy10.lowest_common_ancestor.LowestCommonAncestor;
import org.junit.Assert;
import org.junit.Test;

public class BalancedBinaryTreeTest {
    @Test
    public void simple_test() {
        Integer[] input = {3,9,20,null,null,15,7};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode binaryTreeNode = bstHelper.createLevelOrderBinaryTree(input);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        boolean result = balancedBinaryTree.isBalanced(binaryTreeNode);

        Assert.assertTrue(result);
    }

    @Test
    public void simple_test_failure() {
        Integer[] input = {1,2,2,3,3,null,null,4,4};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode binaryTreeNode = bstHelper.createLevelOrderBinaryTree(input);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        boolean result = balancedBinaryTree.isBalanced(binaryTreeNode);

        Assert.assertFalse(result);
    }
}
