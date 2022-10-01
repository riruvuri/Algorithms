package easy3.merge_sorted_lists;

import binarysearchtrees.algorithm.LinkedListNode;

public class MergeSortedLists {

    public LinkedListNode mergeLists(LinkedListNode node1, LinkedListNode node2) {
        LinkedListNode listNode = new LinkedListNode(-1);
        LinkedListNode current = listNode;

        while (node1.next != null && node2.next != null) {
            if (node1.value < node2.value) {
                current.next = node1;
                node1 = node1.next;
            } else {
                current.next = node2;
                node2 = node2.next;
            }
            current = current.next;
        }

        if (node1 != null) {
            current.next = node1;
        }

        if (node2 != null) {
            current.next = node2;
        }

        return listNode.next;
    }
}
