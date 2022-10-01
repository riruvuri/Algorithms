package application.bucketsort;

import org.junit.Assert;
import org.junit.Test;

public class TopKFrequentElementsTest {

    @Test
    public void simple_test() {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] result = topKFrequentElements.topKElements(new int[]{1,2,2,1,1,600, 10000, 3}, 3);

        Assert.assertArrayEquals(new int[]{1,2}, result);
    }
}
