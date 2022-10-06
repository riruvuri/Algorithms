package easy12.linked_list_cycle;

import binarysearchtrees.algorithm.LinkedListNode;

public class LinkedListCycle {
    public boolean hasCycle(LinkedListNode listNode) {
        LinkedListNode slow = listNode;
        LinkedListNode fast = listNode.next;

        while (slow != null && fast != null) {

            if (slow == fast) {
                return true;
            }
            slow = slow.next;

            if (fast.next == null) {
                break;
            }
            fast = fast.next.next;
        }

        return false;
    }
}
