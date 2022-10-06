package easy18.reverse_linkedlist;

import binarysearchtrees.algorithm.LinkedListNode;

public class LinkedListOps {
    public LinkedListNode reverse(LinkedListNode head) {

        LinkedListNode prev = null;
        LinkedListNode current = head;
        while (current != null) {
            LinkedListNode temp = current.next;

            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}
