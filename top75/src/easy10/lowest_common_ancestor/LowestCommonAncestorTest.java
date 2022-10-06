package easy10.lowest_common_ancestor;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class LowestCommonAncestorTest {

    @Test
    public void simple_test() {
        Integer[] input = {6,2,8,0,4,7,9,null,null,3,5};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode binaryTreeNode = bstHelper.createLevelOrderBinaryTree(input);
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        BinaryTreeNode ancestor = lowestCommonAncestor.find(binaryTreeNode, new BinaryTreeNode(2), new BinaryTreeNode(8));

        Assert.assertTrue(ancestor.value == 6);
    }

    @Test
    public void simple_test_alt() {
        Integer[] input = {6,2,8,0,4,7,9,null,null,3,5};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode binaryTreeNode = bstHelper.createLevelOrderBinaryTree(input);
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        BinaryTreeNode ancestor = lowestCommonAncestor.find(binaryTreeNode, new BinaryTreeNode(2), new BinaryTreeNode(7));

        Assert.assertTrue(ancestor.value == 6);
    }
}
