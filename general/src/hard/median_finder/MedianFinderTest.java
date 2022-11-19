package hard.median_finder;

import org.junit.Assert;
import org.junit.Test;

public class MedianFinderTest {
    @Test
    public void simple_test() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(12);
        medianFinder.addNum(2);
        medianFinder.addNum(9);
        medianFinder.addNum(6);

        Assert.assertTrue(medianFinder.findMedian() == 7.5);
    }

    @Test
    public void simple_test_alt() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(4);
        medianFinder.addNum(12);
        medianFinder.addNum(2);
        medianFinder.addNum(9);
        medianFinder.addNum(6);

        Assert.assertTrue(medianFinder.findMedian() == 6);
    }
}
