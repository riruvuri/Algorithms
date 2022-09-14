package application.depthfirstsearch;

import binarysearchtrees.algorithm.BinaryTreeNode;
import binarysearchtrees.algorithm.LinkedListNode;

import java.util.ArrayList;

public class SortedListToBST {
    static BinaryTreeNode prepareBST(LinkedListNode head) {
        ArrayList<Integer> elementList = new ArrayList<>();

        LinkedListNode current = head;
        while (current != null) {
            elementList.add(current.value);
            current = current.next;
        }

        BinaryTreeNode treeNode = bstHelper(elementList, 0, elementList.size() - 1);

        return treeNode;
    }


    static BinaryTreeNode bstHelper(ArrayList<Integer> elementList, int start, int end) {
        if (start > end) {
            return null;
        }

        if (start == end) {
            return new BinaryTreeNode(elementList.get(start));
        }

        int mid = start + (end-start)/2;

        BinaryTreeNode treeNode = new BinaryTreeNode(elementList.get(mid));
        treeNode.left = bstHelper(elementList, start, mid-1);
        treeNode.right = bstHelper(elementList, mid+1, end);

        return treeNode;
    }
}
