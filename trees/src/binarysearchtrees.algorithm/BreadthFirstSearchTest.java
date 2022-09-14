package binarysearchtrees.algorithm;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class BreadthFirstSearchTest {

    private BinaryTreeNode binaryTreeNodeRoot = null;

    @Before
    public void buildBST() {
        Integer[] sortedArray = {0, 1, null, null, 2, 4, null, null, 3};

        BSTHelper bstHelper= new BSTHelper();
        binaryTreeNodeRoot = bstHelper.createLevelOrderBinaryTree(sortedArray);
    }

    @Test
    public void test_print_all() {
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        ArrayList<ArrayList<Integer>> outputList =  breadthFirstSearch.getElementsByLevel(binaryTreeNodeRoot);

        outputList.toString();
        //Assert.assertEquals(searchKey, searchNode != null ? searchNode.value.intValue() : -1);
    }
}
