package application.depthfirstsearch;

import binarysearchtrees.algorithm.BinaryTreeNode;
import binarysearchtrees.algorithm.LinkedListNode;


public class SortedListToBSTAlt {

    public BinaryTreeNode prepareBST(LinkedListNode node) {
        BinaryTreeNode treeNode = bstHelper(node);

        return treeNode;
    }

    private BinaryTreeNode bstHelper(LinkedListNode node) {
        if (node == null) {
            return null;
        }

        if (node.next == null) {
            return new BinaryTreeNode(node.value);
        }

        LinkedListNode midNode = getMid(node);
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode(midNode.value);
        LinkedListNode leftHead = node;
        LinkedListNode rightHead = midNode.next;
        midNode.next = null;

        binaryTreeNode.left= bstHelper(node);
        binaryTreeNode.right=bstHelper(rightHead);

        return binaryTreeNode;
    }

    private LinkedListNode getMid(LinkedListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        LinkedListNode slow = node, fast = node, slowPrev = null;
        while (fast != null && fast.next != null) {
            slowPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // Break the linked list to two halves
        slowPrev.next = null;

        return slow;
    }
}
