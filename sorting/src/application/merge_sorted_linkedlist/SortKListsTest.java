package application.merge_sorted_linkedlist;

import binarysearchtrees.algorithm.LinkedListNode;
import linkedlists.LinkedListUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortKListsTest {
    @Test
    public void simple() {
        LinkedListNode input1 = LinkedListUtil.generateLinkedListNode(new int[]{1,4,6});
        LinkedListNode input2 = LinkedListUtil.generateLinkedListNode(new int[]{2,3,7, 9, 11});

        SortKLists sortKLists = new SortKLists();
        LinkedListNode result = sortKLists.sort(Arrays.asList(input1, input2));

        Assert.assertTrue(3 == result.next.next.value);
    }
}
