package application.depthfirstsearch.bottom_up.commonancestor;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import easy10.lowest_common_ancestor.LowestCommonAncestor;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeNodeDirectionTest {

    @Test
    public void simple_test() {
        Integer[] input = {5,1,2,3,null,6,4};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode binaryTreeNode = bstHelper.createLevelOrderBinaryTree(input);
        BinaryTreeNodeDirection binaryTreeNodeDirection = new BinaryTreeNodeDirection();
        String result = binaryTreeNodeDirection.getDirections(binaryTreeNode, 3, 6);

        Assert.assertTrue("UURL".equals(result));
    }

    @Test
    public void simple_test_alt() {
        Integer[] input = {6,2,8,0,4,7,9,null,null,3,5};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode binaryTreeNode = bstHelper.createLevelOrderBinaryTree(input);
        BinaryTreeNodeDirection binaryTreeNodeDirection = new BinaryTreeNodeDirection();
        String result = binaryTreeNodeDirection.getDirections(binaryTreeNode, 0, 7);

        Assert.assertTrue("UURL".equals(result));
    }

    @Test
    public void simple_test_alte() {
        Integer[] input = {2,1};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode binaryTreeNode = bstHelper.createLevelOrderBinaryTree(input);
        BinaryTreeNodeDirection binaryTreeNodeDirection = new BinaryTreeNodeDirection();
        String result = binaryTreeNodeDirection.getDirections(binaryTreeNode, 2, 1);

        Assert.assertTrue("L".equals(result));
    }
}
