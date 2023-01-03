package application.kth_largest_stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KthLargestInStreamTest {
    @Test
    public void simple_test() {
        KthLargestInStream kthLargestInStream = new KthLargestInStream();
        List<Integer> result = kthLargestInStream.findKthLargest(2,
                                                                Stream.of(4,6).collect(Collectors.toList()),
                                                                Stream.of(5,2,20).collect(Collectors.toList()));

        Assert.assertEquals(Arrays.asList(5,5,6), result);
    }
}
