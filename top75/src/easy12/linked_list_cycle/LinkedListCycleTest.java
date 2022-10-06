package easy12.linked_list_cycle;

import binarysearchtrees.algorithm.LinkedListNode;
import linkedlists.LinkedListUtil;
import org.junit.Assert;
import org.junit.Test;


public class LinkedListCycleTest {
    @Test
    public void simple_test() {
        LinkedListNode input = LinkedListUtil.generateLinkedListNode(new int[]{3,2,0,-4});
        LinkedListNode secondNode = input.next;
        // Append second element to tail
        LinkedListNode lastNode = input;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = secondNode;

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean hasCycle = linkedListCycle.hasCycle(input);
        Assert.assertTrue(hasCycle);
    }

    @Test
    public void simple_test_alt() {
        LinkedListNode input = LinkedListUtil.generateLinkedListNode(new int[]{3,2,0,-4});

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean hasCycle = linkedListCycle.hasCycle(input);
        Assert.assertFalse(hasCycle);
    }
}
