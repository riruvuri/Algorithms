package merge_lists;

import binarysearchtrees.algorithm.LinkedListNode;

import java.util.List;

/**
 * https://www.youtube.com/watch?v=BBt9FB5Yt0M
 *
 * T(n): O( N * log(K))
 *
 * N = total nodes
 * K - total recursive calls
 *
 * Space: O(K)
 */
public class SortKLists {

    public LinkedListNode sort(List<LinkedListNode> listNodes) {
        if (listNodes == null || listNodes.size() == 0) {
            return null;
        }

        LinkedListNode listNode = mergeHelper(listNodes, 0, listNodes.size()-1);

        return listNode;
    }

    private LinkedListNode mergeHelper(List<LinkedListNode> listNodes, int start, int end) {
        if (start == end) {
            return listNodes.get(start);
        }

        int mid = start + (end - start) /2;
        LinkedListNode leftNode = mergeHelper(listNodes, start, mid);
        LinkedListNode rightNode = mergeHelper(listNodes, mid + 1, end);

        return mergeNode(leftNode, rightNode);

    }

    private LinkedListNode mergeNode(LinkedListNode leftNode, LinkedListNode rightNode) {
        LinkedListNode result = new LinkedListNode(-1);
        LinkedListNode current = result;

        if (leftNode == null) {
            return rightNode;
        } else if (rightNode == null) {
            return leftNode;
        }

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

        return result.next;
    }
}
