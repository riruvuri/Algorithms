package merge_lists;

import binarysearchtrees.algorithm.LinkedListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SortKListsTest {
    public LinkedListNode generateLinkedListNode(int[] input) {
        LinkedListNode node = null;
        LinkedListNode root = null;
        for (int i : input) {
            if (node == null) {
                node = new LinkedListNode(i);
            } else {
                node.next = new LinkedListNode(i);
                node = node.next;
            }
            if (root == null) {
                root = node;
            }
        }
        return root;
    }

    @Test
    public void simple() {
        LinkedListNode input1 = generateLinkedListNode(new int[]{1,4,6});
        LinkedListNode input2 = generateLinkedListNode(new int[]{2,3,7});

        SortKLists sortKLists = new SortKLists();
        LinkedListNode result = sortKLists.sort(Arrays.asList(input1, input2));

        Assert.assertTrue(3 == result.next.next.value);
    }
}
