package medium.sort_list;

import binarysearchtrees.algorithm.LinkedListNode;

public class SortList {
    public LinkedListNode sortList(LinkedListNode head) {
        if (head == null || head.next == null)
            return head;
        LinkedListNode mid = getMid(head);
        LinkedListNode left = sortList(head);
        LinkedListNode right = sortList(mid);
        return merge(left, right);
    }

    LinkedListNode merge(LinkedListNode list1, LinkedListNode list2) {
        LinkedListNode dummyHead = new LinkedListNode(-1);
        LinkedListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    LinkedListNode getMid(LinkedListNode head) {
        LinkedListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        LinkedListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
