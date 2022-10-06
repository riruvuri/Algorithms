package easy18.reverse_linkedlist;

import binarysearchtrees.algorithm.LinkedListNode;
import linkedlists.LinkedListUtil;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListUtilTest {

    @Test
    public void simple_test() {
        LinkedListNode head = LinkedListUtil.generateLinkedListNode(new int[]{1,2,3,4,5});
        LinkedListOps linkedListOps = new LinkedListOps();
        LinkedListNode result = linkedListOps.reverse(head);

        Assert.assertTrue(result.value == 5);
    }
}
