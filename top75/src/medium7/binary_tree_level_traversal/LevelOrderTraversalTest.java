package medium7.binary_tree_level_traversal;

import binarysearchtrees.algorithm.BSTHelper;
import binarysearchtrees.algorithm.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LevelOrderTraversalTest {

    @Test
    public void simple_test() {
        Integer[] input = {3,9,20,null,null,15,7};
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode root = bstHelper.createLevelOrderBinaryTree(input);

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        List<List<Integer>> resultList = levelOrderTraversal.traverse(root);

        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7));
        Assert.assertEquals(expectedList, resultList);
    }
}
