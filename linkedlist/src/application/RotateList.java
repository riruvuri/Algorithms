package application;

/**
 * https://leetcode.com/problems/rotate-list/
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        // Get the count to avoid unwanted hops
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        k %= count;

        if (k == 0) return head;

        temp = head;
        while (k-- > 0) {
            temp = temp.next;
        }

        if (temp == null) return head;
        ListNode tempHead = head;
        while (temp.next != null) {
            temp = temp.next;
            head = head.next;
        }

        ListNode newHead = head.next;
        temp.next=tempHead;
        head.next = null;

        return newHead;
    }
}

 class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
