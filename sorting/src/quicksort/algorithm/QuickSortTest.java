package quicksort.algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {
    @Test
    public void test_simplesort() {
        QuickSort selectionSort = new QuickSort();
        int[] sortedArray = selectionSort.sort(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }
}
