package medium.peak_element;

import org.junit.Assert;
import org.junit.Test;

/**
 * LC: 528
 *
 * T(n)=O(log n)
 * S(n)=O(1)
 */
public class PeakElementTest {
    @Test
    public void findPeakElement() {
        int[] nums = {1,2,3,1};
        PeakElement peakElement = new PeakElement();
        int result = peakElement.findPeakElement(nums);

        Assert.assertEquals(2, result);
    }

    @Test
    public void findPeakElement_multi() {
        int[] nums = {1,2,1,3,5,6,4};
        PeakElement peakElement = new PeakElement();
        int result = peakElement.findPeakElement(nums);

        Assert.assertEquals(5, result);
    }
}
