package application.kth_largest_stream;

import application.bucketsort.TopKFrequentElements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KthLargestInStreamHeapSortTest {
    @Test
    public void simple_test() {
        KthLargestInStreamHeapSort kthLargestInStreamHeapSort = new KthLargestInStreamHeapSort();
        List<Integer> result = kthLargestInStreamHeapSort.findKthLargest(2,
                                                                Stream.of(4,6).collect(Collectors.toList()),
                                                                Stream.of(5,2,20).collect(Collectors.toList()));

        Assert.assertEquals(Arrays.asList(5,5,6), result);
    }
}
