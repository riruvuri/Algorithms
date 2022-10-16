package medium15.validate_bst;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ValidateBSTTest {

    @Test
    public void simple_test() {
        BinaryTreeNode binaryTreeNode = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{5,1,8,0,3,7,9});
        ValidateBST validateBST = new ValidateBST();
        boolean result = validateBST.isValidBST(binaryTreeNode);

        Assert.assertTrue(result);
    }

    @Test
    public void simple_test_alt() {
        BinaryTreeNode binaryTreeNode = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{5,1,4,null,null,3,6});
        ValidateBST validateBST = new ValidateBST();
        boolean result = validateBST.isValidBST(binaryTreeNode);

        Assert.assertFalse(result);
    }
}
