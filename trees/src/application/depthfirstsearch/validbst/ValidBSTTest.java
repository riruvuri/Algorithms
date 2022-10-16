package application.depthfirstsearch.validbst;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import medium15.validate_bst.ValidateBST;
import org.junit.Assert;
import org.junit.Test;

public class ValidBSTTest {
    @Test
    public void simple_test() {
        BinaryTreeNode binaryTreeNode = new BSTHelper().createLevelOrderBinaryTree(new Integer[]{5,1,4,null,null,3,6});
        boolean result = ValidBST.is_bst(binaryTreeNode);

        Assert.assertFalse(result);
    }
}
