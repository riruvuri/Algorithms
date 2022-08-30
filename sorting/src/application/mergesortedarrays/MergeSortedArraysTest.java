package application.mergesortedarrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArraysTest {

    @Test
    public void test_mergeSortedArrays() {
        int[] arr1 = {1,3,5};
        int[] arr2 ={2,4,6,0,0,0};

        MergedSortedArrays mergedSortedArrays = new MergedSortedArrays();
        int[] mergedArray = mergedSortedArrays.merge(arr1,arr2);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, mergedArray);
    }

    @Test
    public void test_mergeSortedArraysPreZero() {
        int[] arr1 = {1,3,5};
        int[] arr2 ={0,0,0,2,4,6};

        MergedSortedArrays mergedSortedArrays = new MergedSortedArrays();
        int[] mergedArray = mergedSortedArrays.mergePreElements(arr1,arr2);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, mergedArray);
    }
}
