package heapsort.algorithm;

import insertionsort.algorithm.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HeapSortTest {
    @Test
    public void test_simplesort() {
        HeapSort heapSort = new HeapSort();
        int[] sortedArray = heapSort.sort(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }
}
