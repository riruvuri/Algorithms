package bubblesort.algorithm;

import org.junit.Assert;
import org.junit.Test;
import selectionsort.algorithm.SelectionSort;

import java.util.Arrays;

public class BubbleSortTest {
    @Test
    public void test_simplesort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }


    @Test
    public void test_simplesort_forward() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sortForward(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }

    @Test
    public void test_simplesort_improved() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sortImproved(new int[] {5,3,6,9,1,2,4});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6,9}, sortedArray);
    }

}
