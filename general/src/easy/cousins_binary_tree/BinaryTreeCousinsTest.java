package easy.cousins_binary_tree;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeCousinsTest {
    @Test
    public void simple_test() {
        BinaryTreeNode rootNode = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{1,2,3,null,4,null,5});
        BinaryTreeCousins binaryTreeCousins = new BinaryTreeCousins();
        boolean result = binaryTreeCousins.isCousins(rootNode, 5, 4);

        Assert.assertTrue(result);
    }

    @Test
    public void simple_test_alt() {
        BinaryTreeNode rootNode = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{1,2,3,null,4});
        BinaryTreeCousins binaryTreeCousins = new BinaryTreeCousins();
        boolean result = binaryTreeCousins.isCousins(rootNode, 2, 3);

        Assert.assertFalse(result);
    }
}
