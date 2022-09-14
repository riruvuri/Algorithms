package binarysearchtrees.algorithm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTHelperTest {
    private BinaryTreeNode binaryTreeNodeRoot = null;

    @Before
    public void buildBST() {
        Integer[] sortedArray = {8, 17, 28, 29, 32, 44, 54, 65, 76, 80, 82, 88, 93, 97};

        BSTHelper bstHelper= new BSTHelper();
        binaryTreeNodeRoot = bstHelper.createBST(sortedArray);
    }

    @Test
    public void test_search_match_found() {
        int searchKey = 17;
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode searchNode =  bstHelper.search(binaryTreeNodeRoot, searchKey);

        Assert.assertEquals(searchKey, searchNode != null ? searchNode.value.intValue() : -1);
    }

    @Test
    public void test_search_no_match_found() {
        int searchKey = 500;
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode searchNode =  bstHelper.search(binaryTreeNodeRoot, searchKey);

        Assert.assertEquals(null, searchNode);
    }

    @Test
    public void test_insert_node_parent() {
        BinaryTreeNode newElement = new BinaryTreeNode(6);

        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode newRoot =  bstHelper.insert(binaryTreeNodeRoot, newElement);

        BinaryTreeNode actualChildOfParent = bstHelper.search(binaryTreeNodeRoot, 8);

        Assert.assertEquals(newElement, actualChildOfParent.left);
    }

    @Test
    public void test_find_min_element() {
        int minElement = 8;
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode minElementNode =  bstHelper.findMinElement(binaryTreeNodeRoot);

        Assert.assertEquals(minElement, minElementNode != null ? minElementNode.value.intValue() : -1);
    }

    @Test
    public void test_find_max_element() {
        int maxElement = 97;
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode maxElementNode =  bstHelper.findMaxElement(binaryTreeNodeRoot);

        Assert.assertEquals(maxElement, maxElementNode != null ? maxElementNode.value.intValue() : -1);
    }

    @Test
    public void test_find_successor_element() {
        int currentElement = 8;
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode successorNode =  bstHelper.findSuccessor(binaryTreeNodeRoot, currentElement);

        Assert.assertEquals(17, successorNode != null ? successorNode.value.intValue() : -1);
    }

    @Test
    public void test_find_successor_element_root() {
        int currentElement = 44;
        BSTHelper bstHelper = new BSTHelper();
        BinaryTreeNode successorNode =  bstHelper.findSuccessor(binaryTreeNodeRoot, currentElement);

        Assert.assertEquals(54, successorNode != null ? successorNode.value.intValue() : -1);
    }
}
