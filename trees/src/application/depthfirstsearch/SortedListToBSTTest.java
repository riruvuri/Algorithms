package application.depthfirstsearch;

import binarysearchtrees.algorithm.BinaryTreeNode;
import binarysearchtrees.algorithm.LinkedListNode;
import org.junit.Assert;
import org.junit.Test;

public class SortedListToBSTTest {


    public LinkedListNode generateLinkedListNode(int[] input) {
        LinkedListNode node = null;
        LinkedListNode root = null;
        for (int i : input) {
            if (node == null) {
                node = new LinkedListNode(i);
            } else {
                node.next = new LinkedListNode(i);
                node = node.next;
            }
            if (root == null) {
                root = node;
            }
        }
        return root;
    }

    @Test
    public void sample_test() {
        int[] input = {-1, 2, 3, 5, 6, 7, 10};
        LinkedListNode head = generateLinkedListNode(input);
        SortedListToBSTAlt sortedListToBSTAlt = new SortedListToBSTAlt();
        BinaryTreeNode root = sortedListToBSTAlt.prepareBST(head);

        Assert.assertTrue(5 == root.value);
    }
}
