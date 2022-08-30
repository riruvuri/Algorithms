package radixsort.algorithm;

import countingsort.algorithm.CountingSortCumulativeCount;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RadixSortTest {

    @Test
    public void test_simpleSortCumulativeCount() {
        RadixSort radixSort = new RadixSort();
        int[] sortedArray = radixSort.sort(new int[] {170, 45, 75, 90, 802, 24, 2, 66});
        System.out.println(Arrays.toString(sortedArray));
        Assert.assertArrayEquals(new int[]{2, 24, 45, 66, 75, 90, 170, 802}, sortedArray);
    }
}
