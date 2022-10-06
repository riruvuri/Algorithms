package easy22.middle_linkedlist;

import binarysearchtrees.algorithm.LinkedListNode;
import linkedlists.LinkedListUtil;
import org.junit.Assert;
import org.junit.Test;

public class MiddleOfLinkedListTest {
    @Test
    public void simple_test() {
        LinkedListNode head = LinkedListUtil.generateLinkedListNode(new int[]{1,2,3,4,5});
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        LinkedListNode middle = middleOfLinkedList.findMiddleElement(head);

        Assert.assertTrue(3 == middle.value);
    }

    @Test
    public void simple_test_alt() {
        LinkedListNode head = LinkedListUtil.generateLinkedListNode(new int[]{1,2,3,4,5, 6});
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        LinkedListNode middle = middleOfLinkedList.findMiddleElement(head);

        Assert.assertTrue(4 == middle.value);
    }
}
