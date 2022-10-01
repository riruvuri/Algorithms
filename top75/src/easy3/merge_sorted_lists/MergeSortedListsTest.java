package easy3.merge_sorted_lists;

import binarysearchtrees.algorithm.LinkedListNode;
import linkedlists.LinkedListUtil;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortedListsTest {

    @Test
    public void sample_test() {
        LinkedListNode input1 = LinkedListUtil.generateLinkedListNode(new int[]{1,4,6});
        LinkedListNode input2 = LinkedListUtil.generateLinkedListNode(new int[]{2,3,7});

        MergeSortedLists mergeSortedLists = new MergeSortedLists();
        LinkedListNode result = mergeSortedLists.mergeLists(input1, input2);

        Assert.assertTrue(3 == result.next.next.value);
    }

    @Test
    public void sample_test_alt() {
        LinkedListNode input1 = LinkedListUtil.generateLinkedListNode(new int[]{1,4,6, 9, 11, 13, 14});
        LinkedListNode input2 = LinkedListUtil.generateLinkedListNode(new int[]{2,3,7});

        MergeSortedLists mergeSortedLists = new MergeSortedLists();
        LinkedListNode result = mergeSortedLists.mergeLists(input1, input2);

        Assert.assertTrue(3 == result.next.next.value);
    }
}
