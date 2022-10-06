package easy21.binary_tree;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class TreeDiameterTest {

    @Test
    public void simple_test() {
        BinaryTreeNode rootNode = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{1,2,3,4,5});
        TreeDiameter treeDiameter = new TreeDiameter();
        int width = treeDiameter.findDiameter(rootNode);

        Assert.assertTrue(width == 3);
    }

    @Test
    public void simple_test_alt() {
        BinaryTreeNode rootNode = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{1,2});
        TreeDiameter treeDiameter = new TreeDiameter();
        int width = treeDiameter.findDiameter(rootNode);

        Assert.assertTrue(width == 1);
    }
}
