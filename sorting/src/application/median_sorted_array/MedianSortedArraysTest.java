package application.median_sorted_array;

import org.junit.Assert;
import org.junit.Test;

public class MedianSortedArraysTest {
    @Test
    public void simple_test_even() {
        MedianSortedArrays medianSortedArrays = new MedianSortedArrays();
        double result = medianSortedArrays.findMedian(new int[]{1,2}, new int[]{3,4});

        Assert.assertTrue(result == 2.5);
    }

    @Test
    public void simple_test_odd() {
        MedianSortedArrays medianSortedArrays = new MedianSortedArrays();
        double result = medianSortedArrays.findMedian(new int[]{1,3}, new int[]{2});

        Assert.assertTrue(result == 2);
    }
}
