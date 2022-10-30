package medium22.lowest_common_ancestor;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class LowestCommonAncestorTest {
    @Test
    public void simple_test() {
        Integer[] input = {3,5,1,6,2,0,8,null,null,7,4};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode root = bstHelper.createLevelOrderBinaryTree(input);
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

        BinaryTreeNode ancestorNode = lowestCommonAncestor.findAncestor(root, new BinaryTreeNode(5),
                                                                                new BinaryTreeNode(1));

        Assert.assertTrue(ancestorNode.value == 3);
    }

    @Test
    public void simple_test_alt() {
        Integer[] input = {1, 2};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode root = bstHelper.createLevelOrderBinaryTree(input);
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();

        BinaryTreeNode ancestorNode = lowestCommonAncestor.findAncestor(root, new BinaryTreeNode(1),
                                                                            new BinaryTreeNode(2));

        Assert.assertTrue(ancestorNode.value == 1);
    }
}
