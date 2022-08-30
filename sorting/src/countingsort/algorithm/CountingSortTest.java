package countingsort.algorithm;

import org.junit.Assert;
import org.junit.Test;
import selectionsort.algorithm.SelectionSort;

import java.util.Arrays;

public class CountingSortTest {
    @Test
    public void test_simpleSort() {
        CountingSort countingSort = new CountingSort();
        int[] sortedArray = countingSort.sort(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }

    @Test
    public void test_sortNegativeNumbers() {
        CountingSort countingSort = new CountingSort();
        int[] sortedArray = countingSort.sort(new int[] {-5,-3,-6,-9,-1,-2,-4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{-9, -6, -5, -4, -3, -2, -1}, sortedArray);
    }

    @Test
    public void test_simpleSortCumulativeCount() {
        CountingSortCumulativeCount countingSort = new CountingSortCumulativeCount();
        int[] sortedArray = countingSort.sort(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }
}
