package linkedlists;

import binarysearchtrees.algorithm.LinkedListNode;

public class LinkedListUtil {

    public static LinkedListNode generateLinkedListNode(int[] input) {
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
}
