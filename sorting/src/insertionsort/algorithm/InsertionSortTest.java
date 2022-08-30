package insertionsort.algorithm;

import org.junit.Assert;
import org.junit.Test;
import selectionsort.algorithm.SelectionSort;

import java.util.Arrays;

public class InsertionSortTest {
    @Test
    public void test_simplesort() {
        InsertionSort selectionSort = new InsertionSort();
        int[] sortedArray = selectionSort.sort(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }

}
