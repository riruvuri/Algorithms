package easy22.middle_linkedlist;

import binarysearchtrees.algorithm.LinkedListNode;

public class MiddleOfLinkedList {
    public LinkedListNode findMiddleElement(LinkedListNode head) {
        LinkedListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
