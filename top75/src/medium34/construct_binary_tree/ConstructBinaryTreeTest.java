package medium34.construct_binary_tree;

import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeTest {
    @Test
    public void simple_test() {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};

        ConstructBinaryTree constructBinaryTree = new ConstructBinaryTree();
        BinaryTreeNode binaryTreeNode = constructBinaryTree.buildTree(preorder, inorder);

        Assert.assertTrue(binaryTreeNode.value == 3 &&
                                    binaryTreeNode.right.left.value == 15);
    }
}
