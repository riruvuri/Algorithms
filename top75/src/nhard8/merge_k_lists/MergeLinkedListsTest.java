package nhard8.merge_k_lists;

import binarysearchtrees.algorithm.LinkedListNode;
import linkedlists.LinkedListUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeLinkedListsTest {
    @Test
    public void simple() {
        LinkedListNode input1 = LinkedListUtil.generateLinkedListNode(new int[]{1,4,6});
        LinkedListNode input2 = LinkedListUtil.generateLinkedListNode(new int[]{2,3,7, 9, 11});

        LinkedListNode[] listNodes = Arrays.asList(input1, input2).toArray(new LinkedListNode[]{});

        MergeLinkedLists mergeLinkedLists = new MergeLinkedLists();
        LinkedListNode result = mergeLinkedLists.mergeKLists(listNodes);

        Assert.assertTrue(3 == result.next.next.value);
    }
}
