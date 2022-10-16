package nhard8.merge_k_lists;

import binarysearchtrees.algorithm.LinkedListNode;

public class MergeLinkedLists {
    public LinkedListNode mergeKLists(LinkedListNode[] lists) {
        LinkedListNode rootNode = divideKLists(lists, 0, lists.length - 1);
        return rootNode;
    }

    private LinkedListNode divideKLists(LinkedListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }

        int mid = start + (end - start)/2;
        LinkedListNode leftNode = divideKLists(lists, start, mid);
        LinkedListNode rightNode = divideKLists(lists, mid+1, end);

        return mergeList(leftNode, rightNode);
    }

    private LinkedListNode mergeList(LinkedListNode leftNode,
                                     LinkedListNode rightNode) {
        LinkedListNode mergedNode = new LinkedListNode(-1);
        LinkedListNode current = mergedNode;

        while (leftNode != null && rightNode != null) {
            if (leftNode.value < rightNode.value) {
                current.next = leftNode;
                leftNode = leftNode.next;
            } else {
                current.next = rightNode;
                rightNode = rightNode.next;
            }
            current = current.next;
        }

        if (leftNode != null) {
            current.next = leftNode;
        }

        if (rightNode != null) {
            current.next = rightNode;
        }

        return mergedNode.next;
    }
}
