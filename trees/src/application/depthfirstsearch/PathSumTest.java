package application.depthfirstsearch;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PathSumTest {
    private BinaryTreeNode binaryTreeNodeRoot = null;

    @Before
    public void buildBST() {
        Integer[] sortedArray = {5,4,8,11,null,13,4,7,2,null,null,null,1};

        BSTHelper bstHelper= new BSTHelper();
        binaryTreeNodeRoot = bstHelper.createLevelOrderBinaryTree(sortedArray);
    }

    @Test
    public void test_simple() {
        PathSum pathSum = new PathSum();
        boolean sumFound = pathSum.hasPathSum(binaryTreeNodeRoot, 22);

        Assert.assertEquals(true, sumFound);
    }

}
