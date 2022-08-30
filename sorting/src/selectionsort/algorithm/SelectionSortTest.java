package selectionsort.algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest {

    @Test
    public void test_simplesort() {
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.selectionSort(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }


    @Test
    public void test_simplesort_maximum() {
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.selectionSortMaxElement(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }
}
